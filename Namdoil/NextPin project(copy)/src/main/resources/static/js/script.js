// 구글 지도 API 불러오기. 추후 카맵 API로 수정 예정

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
        saveImage.src = 'images/icon_save_before.png';
    } else {
        saveImage.src = 'images/icon_save_after.png';
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
});