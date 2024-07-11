// Kakao Map 초기화 및 검색 함수
var placeData = [];
var markers = [];

var mapContainer = document.getElementById('map'), // 지도를 표시할 div
    mapOption = {
        center: new kakao.maps.LatLng(37.566826, 126.9786567), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption);
var ps = new kakao.maps.services.Places();
var infowindow = new kakao.maps.InfoWindow({zIndex:1});

function searchPlaces() {
    var keyword = document.getElementById('keyword').value;

    if (!keyword.replace(/^\s+|\s+$/g, '')) {
        alert('키워드를 입력해주세요!');
        return false;
    }

    $("#keyword").val(keyword);
    ps.keywordSearch(keyword, placesSearchCB, { radius : 500 });
}

function placesSearchCB(data, status, pagination) {
    if (status === kakao.maps.services.Status.OK) {
        if (data.length > 0) {
            for (let idx in data) {
                placeData.push(data[idx]);
            }
        }

        displayPlaces(data);
        printResult(placeData);
        displayPagination(pagination);
    } else if (status === kakao.maps.services.Status.ZERO_RESULT) {
        alert('검색 결과가 존재하지 않습니다.');
    } else if (status === kakao.maps.services.Status.ERROR) {
        alert('검색 결과 중 오류가 발생했습니다.');
    }
}

function printResult(data) {
    console.log(data);
}

function displayPlaces(places) {
    var listEl = document.getElementById('placesList'),
        fragment = document.createDocumentFragment(),
        bounds = new kakao.maps.LatLngBounds();

    removeAllChildNods(listEl);
    removeMarker();

    for ( var i=0; i<places.length; i++ ) {
        var placePosition = new kakao.maps.LatLng(places[i].y, places[i].x),
            marker = addMarker(placePosition, i),
            itemEl = getListItem(i, places[i]);

        bounds.extend(placePosition);

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

    listEl.appendChild(fragment);
    map.setBounds(bounds);
}

function getListItem(index, places) {
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

function addMarker(position, idx) {
    var imageSrc = 'https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/marker_number_blue.png',
        imageSize = new kakao.maps.Size(36, 37),
        imgOptions =  {
            spriteSize : new kakao.maps.Size(36, 691),
            spriteOrigin : new kakao.maps.Point(0, (idx*46)+10),
            offset: new kakao.maps.Point(13, 37)
        },
        markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize, imgOptions),
        marker = new kakao.maps.Marker({
            position: position,
            image: markerImage
        });

    marker.setMap(map);
    markers.push(marker);

    return marker;
}

function removeMarker() {
    for ( var i = 0; i < markers.length; i++ ) {
        markers[i].setMap(null);
    }
    markers = [];
}

function displayPagination(pagination) {
    var paginationEl = document.getElementById('pagination'),
        fragment = document.createDocumentFragment(),
        i;

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

function displayInfowindow(marker, title) {
    var content = '<div style="padding:5px;z-index:1;">' + title + '</div>';

    infowindow.setContent(content);
    infowindow.open(map, marker);
}

function removeAllChildNods(el) {
    while (el.hasChildNodes()) {
        el.removeChild (el.lastChild);
    }
}

window.onload = function(){
    searchPlaces();

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
        var level = map.getLevel();
        var latlng = map.getCenter();
        var message = '<p>지도 레벨은 ' + level + ' 이고</p>';
        message += '<p>중심 좌표는 위도 ' + latlng.getLat() + ', 경도 ' + latlng.getLng() + '입니다</p>';

        var resultDiv = document.getElementById('result');
        resultDiv.innerHTML = message;
    });
};
