// 장소 검색 시 해당 장소 화면에 띄우기
function searchAndDisplay() {
    var searchText = document.getElementById('searchInput').value.trim(); // 검색창의 입력값 가져오기
    var searchText2 = document.getElementById('searchInput2').value.trim(); // 검색창의 입력값 가져오기
    var searchResultElement = document.getElementById('searchResult');

    if (searchText !== '' && searchText2 !== '') {
        var message = searchText + '<span class="highlight-text">와(과) </span>' + searchText2 + '<span class="highlight-text"> 주변</span>';
        searchResultElement.innerHTML = message;
    } else {
        searchResultElement.textContent = '검색어를 입력해주세요.'; // 검색어가 없는 경우 메시지 출력
    }
}

// 초기 로드 시 실행
document.addEventListener('DOMContentLoaded', function() {
    const banners = document.querySelector('.banners');
    banners.style.display = 'none'; // 초기에 숨김 처리

    // 각 배너 버튼에 클릭 이벤트 리스너 추가
    const bannerButtons = document.querySelectorAll('.banner');
    bannerButtons.forEach(button => {
        button.addEventListener('click', function() {
            // 모든 배너 이미지를 원래 상태로 되돌리기
            bannerButtons.forEach(btn => {
                const img = btn.querySelector('img');
                const src = img.src;
                if (src.includes('_after.png')) {
                    img.src = src.replace('_after.png', '.png');
                }
            });

            // 클릭한 배너 이미지 토글
            const img = this.querySelector('img');
            const src = img.src;
            if (src.includes('_after.png')) {
                img.src = src.replace('_after.png', '.png');
            } else {
                img.src = src.replace('.png', '_after.png');
            }
        });
    });
});

// 배너 클릭 시 banners 토글
function toggleBanners() {
    const banners = document.querySelector('.banners');
    banners.classList.toggle('active');
}
// 장소 검색 시 배너 보이기
function toggleBanners(button) {
    const banners = document.querySelector('.banners');
    const isVisible = banners.style.display === 'flex';

    if (isVisible) {
        banners.style.display = 'none';
    } else {
        banners.style.display = 'flex';
    }
}

// 배너 클릭 시 배너 색 채우기
function toggleBannerfill(button) {
    const filledImage = button.querySelector('img');
    const isfilled = filledImage.src.includes('after');

    if (isfilled) {
        filledImage.src = 'images/icon_save_before.png';
    } else {
        saveImage.src = 'images/icon_save_after.png';
    }
}
