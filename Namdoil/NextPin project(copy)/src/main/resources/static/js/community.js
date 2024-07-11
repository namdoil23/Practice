// 카맵 API
var placeData = [];
// 마커를 담을 배열입니다
var markers = [];

var mapContainer = document.getElementById('map'), // 지도를 표시할 div
    mapOption = {
        center: new kakao.maps.LatLng(37.566826, 126.9786567), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

// 지도를 생성합니다
var map = new kakao.maps.Map(mapContainer, mapOption);

// 장소 검색 객체를 생성합니다
var ps = new kakao.maps.services.Places();

// 검색 결과 목록이나 마커를 클릭했을 때 장소명을 표출할 인포윈도우를 생성합니다
var infowindow = new kakao.maps.InfoWindow({zIndex:1});

// 키워드로 장소를 검색합니다
// searchPlaces();

// 키워드 검색을 요청하는 함수입니다
function searchPlaces() {

    var keyword = $('#inputPlace').val() === undefined ? "강남 고깃집" : $('#inputPlace').val();

    if (!keyword.replace(/^\s+|\s+$/g, '')) {
        alert('키워드를 입력해주세요!');
        return false;
    }

    $("#keyword").val(keyword);
    // 장소검색 객체를 통해 키워드로 장소검색을 요청합니다
    // ps.keywordSearch( keyword, placesSearchCB);
    ps.keywordSearch(keyword, placesSearchCB
        , {
            radius : 500                  // 반경범위 미터 단위(0m ~ 20000m)
            // ,location: new kakao.maps.LatLng(37.566826, 126.9786567)
        }
    );
}

// 장소검색이 완료됐을 때 호출되는 콜백함수 입니다
function placesSearchCB(data, status, pagination) {
    // console.log("placesSearchCB data : " + JSON.stringify(data));
    if (status === kakao.maps.services.Status.OK) {
        // console.log(data);
        if(undefined !== data) {
            if (data.length > 0) {
                for (let idx in data) {
                    placeData.push(data[idx]);
                }
            }
        }

        // console.log(placeData);
        // 정상적으로 검색이 완료됐으면
        // 검색 목록과 마커를 표출합니다
        displayPlaces(data);
        printResult(placeData);

        // 페이지 번호를 표출합니다
        displayPagination(pagination);

    } else if (status === kakao.maps.services.Status.ZERO_RESULT) {

        alert('검색 결과가 존재하지 않습니다.');
        return;

    } else if (status === kakao.maps.services.Status.ERROR) {

        alert('검색 결과 중 오류가 발생했습니다.');
        return;

    }
}
let i = 0;
function printResult(data) {

    console.log(++i + "번째 실행");
    console.log(data);
    console.log("print placeData : " + placeData);
}

// 검색 결과 목록과 마커를 표출하는 함수입니다
function displayPlaces(places) {

    var listEl = document.getElementById('placesList'),
        menuEl = document.getElementById('menu_wrap'),
        fragment = document.createDocumentFragment(),
        bounds = new kakao.maps.LatLngBounds(),
        listStr = '';

    // 검색 결과 목록에 추가된 항목들을 제거합니다
    removeAllChildNods(listEl);

    // 지도에 표시되고 있는 마커를 제거합니다
    removeMarker();

    for ( var i=0; i<places.length; i++ ) {

        // 마커를 생성하고 지도에 표시합니다
        var placePosition = new kakao.maps.LatLng(places[i].y, places[i].x),
            marker = addMarker(placePosition, i),
            itemEl = getListItem(i, places[i]); // 검색 결과 항목 Element를 생성합니다

        // 검색된 장소 위치를 기준으로 지도 범위를 재설정하기위해
        // LatLngBounds 객체에 좌표를 추가합니다
        bounds.extend(placePosition);

        // 마커와 검색결과 항목에 mouseover 했을때
        // 해당 장소에 인포윈도우에 장소명을 표시합니다
        // mouseout 했을 때는 인포윈도우를 닫습니다
        (function(marker, title) {
            kakao.maps.event.addListener(marker, 'mouseover', function() {
                displayInfowindow(marker, title);
            });

            kakao.maps.event.addListener(marker, 'mouseout', function() {
                infowindow.close();
            });

            itemEl.onmouseover =  function () {
                displayInfowindow(marker, title);
            };

            itemEl.onmouseout =  function () {
                infowindow.close();
            };
        })(marker, places[i].place_name);

        fragment.appendChild(itemEl);
    }

    // 검색결과 항목들을 검색결과 목록 Element에 추가합니다
    listEl.appendChild(fragment);
    menuEl.scrollTop = 0;

    // 검색된 장소 위치를 기준으로 지도 범위를 재설정합니다
    map.setBounds(bounds);
}

// 검색결과 항목을 Element로 반환하는 함수입니다
function getListItem(index, places) {

    // for(key in places){
    //     let rowData = {};
    //     rowData.key = key;
    //     rowData.value = places[key]
    //     console.log("지도 데이터1 : " + JSON.stringify(placeData));
    //     console.log("지도 데이터 개수: " + placeData.length);
    //     placeData.push(rowData);
    // }
    // console.log("지도 데이터 : " + JSON.stringify(placeData));
    var el = document.createElement('li'),
        itemStr = '<span class="markerbg marker_' + (index+1) + '"></span>' +
            '<div class="info">' +
            '   <h5>' + places.place_name + '</h5>';

    if (places.road_address_name) {
        itemStr += '    <span>' + places.road_address_name + '</span>' +
            '   <span class="jibun gray">' +  places.address_name  + '</span>';
    } else {
        itemStr += '    <span>' +  places.address_name  + '</span>';
    }

    itemStr += '  <span class="tel">' + places.phone  + '</span>' +
        '</div>';

    el.innerHTML = itemStr;
    el.className = 'item';

    return el;
}

// 마커를 생성하고 지도 위에 마커를 표시하는 함수입니다
function addMarker(position, idx, title) {
    var imageSrc = 'https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/marker_number_blue.png', // 마커 이미지 url, 스프라이트 이미지를 씁니다
        imageSize = new kakao.maps.Size(36, 37),  // 마커 이미지의 크기
        imgOptions =  {
            spriteSize : new kakao.maps.Size(36, 691), // 스프라이트 이미지의 크기
            spriteOrigin : new kakao.maps.Point(0, (idx*46)+10), // 스프라이트 이미지 중 사용할 영역의 좌상단 좌표
            offset: new kakao.maps.Point(13, 37) // 마커 좌표에 일치시킬 이미지 내에서의 좌표
        },
        markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize, imgOptions),
        marker = new kakao.maps.Marker({
            position: position, // 마커의 위치
            image: markerImage
        });

    marker.setMap(map); // 지도 위에 마커를 표출합니다
    markers.push(marker);  // 배열에 생성된 마커를 추가합니다

    return marker;
}

// 지도 위에 표시되고 있는 마커를 모두 제거합니다
function removeMarker() {
    for ( var i = 0; i < markers.length; i++ ) {
        markers[i].setMap(null);
    }
    markers = [];
}

// 검색결과 목록 하단에 페이지번호를 표시는 함수입니다
function displayPagination(pagination) {
    var paginationEl = document.getElementById('pagination'),
        fragment = document.createDocumentFragment(),
        i;

    // 기존에 추가된 페이지번호를 삭제합니다
    while (paginationEl.hasChildNodes()) {
        paginationEl.removeChild (paginationEl.lastChild);
    }

    for (i=1; i<=pagination.last; i++) {
        var el = document.createElement('a');
        el.href = "#";
        el.innerHTML = i;

        if (i===pagination.current) {
            el.className = 'on';
        } else {
            el.onclick = (function(i) {
                return function() {
                    pagination.gotoPage(i);
                }
            })(i);
        }

        fragment.appendChild(el);
    }
    paginationEl.appendChild(fragment);
}

// 검색결과 목록 또는 마커를 클릭했을 때 호출되는 함수입니다
// 인포윈도우에 장소명을 표시합니다
function displayInfowindow(marker, title) {
    var content = '<div style="padding:5px;z-index:1;">' + title + '</div>';

    infowindow.setContent(content);
    infowindow.open(map, marker);
}

// 검색결과 목록의 자식 Element를 제거하는 함수입니다
function removeAllChildNods(el) {
    while (el.hasChildNodes()) {
        el.removeChild (el.lastChild);
    }
}

window.onload = function(){
    searchPlaces();
    // printResult();
    $("#dataChk").on("click", function(){
        $.ajax({
            method : "POST",
            headers : {
                'content-type':'application/json'
            },
            url : "/kakaoData",
            async : true,
            dataType: "json",
            data : JSON.stringify(placeData),
            success : function(result){
                console.log("ajax : result : " + result);
            },
            error : function(request, status, error){
                console.log(error);
            }
        });
    });

    kakao.maps.event.addListener(map, 'center_changed', function() {

        // 지도의  레벨을 얻어옵니다
        var level = map.getLevel();

        // 지도의 중심좌표를 얻어옵니다
        var latlng = map.getCenter();

        var message = '<p>지도 레벨은 ' + level + ' 이고</p>';
        message += '<p>중심 좌표는 위도 ' + latlng.getLat() + ', 경도 ' + latlng.getLng() + '입니다</p>';

        var resultDiv = document.getElementById('result');
        resultDiv.innerHTML = message;

    });
};

// 프로필 사진을 클릭하면 해당 유저의 페이지로 이동 (추후 수정 예정)
function goToProfile(button) {
    let profileName = button.querySelector('span').textContent; // 프로필 버튼 내 span 요소의 텍스트 가져오기
    alert(profileName + '의 페이지로 이동'); // alert 창에 메시지 표시
}

// 유저들의 코스 하트 누르기
function toggleHeart(button) {
    const heartImage = button.querySelector('img');
    const heartCount = button.querySelector('span');
    const isLiked = heartImage.src.includes('after');

    if (isLiked) {
        heartImage.src = '../images/icon_heart_before.png';
        heartCount.textContent = parseInt(heartCount.textContent) - 1;
    } else {
        heartImage.src = '../images/icon_heart_after.png';
        heartCount.textContent = parseInt(heartCount.textContent) + 1;
    }
}

// 초기 로드 시 실행
document.addEventListener('DOMContentLoaded', function() {
    const courseDetails = document.querySelector('.course-details');
    courseDetails.style.display = 'none'; // 초기에 숨김 처리
});

// 코스 버튼 클릭 시 course-details 토글
function toggleCourseDetails() {
    const courseDetails = document.querySelector('.course-details');
    courseDetails.classList.toggle('active');
}
// 유저들이 코스 누르면 여행 코스가 보이게 하기
function toggleCourseDetails(button) {
    const courseDetails = document.querySelector('.course-details');
    const isVisible = courseDetails.style.display === 'block';

    if (isVisible) {
        courseDetails.style.display = 'none';
    } else {
        courseDetails.style.display = 'block';
    }
}

// 저장버튼 누르면 아이콘 색 채워지기
function toggleSave(button) {
    const saveImage = button.querySelector('img');
    const isSaved = saveImage.src.includes('after');

    if (isSaved) {
        saveImage.src = 'images/save-before-icon.png';
    } else {
        saveImage.src = 'images/save-after-icon.png';
    }
}

// 유저가 클릭한 일차 글자 색상 변경
document.addEventListener('DOMContentLoaded', function() {
    // 모든 'day' 클래스를 가진 요소들을 선택
    const dayElements = document.querySelectorAll('.day');

    // 각 요소에 대해 클릭 이벤트 리스너 추가
    dayElements.forEach(function(dayElement) {
        dayElement.addEventListener('click', function() {
            // 클릭된 요소가 이미 active 클래스가 있는지 확인
            const isActive = this.classList.contains('active');

            // 모든 day 요소에서 active 클래스 제거
            dayElements.forEach(function(el) {
                el.classList.remove('active');
            });

            // 클릭된 요소에 active 클래스 추가/제거
            if (!isActive) {
                this.classList.add('active');
            }
        });
    });

    const sidebar = $('.content');
    const sidebarToggle = $('.sidebar-toggle');
    let isExpand = false;

    sidebarToggle.on('click', () => {
        isExpand = !isExpand;
        sidebar.toggle('open');

        if(isExpand) {
            $('.sidebar-toggle img').css({'transform': 'rotate(180deg)'});
            return;
        }

        $('.sidebar-toggle img').css({'transform': 'rotate(0deg)'});
        // sidebarContainer.classList.toggle('open');
        // sidebarArrowContainer.classList.toggle('open');
    });
});
