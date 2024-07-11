window.onload = function(){
    const sidebar = $('.container');
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
};

function editDescription() {
    var p = document.getElementById('profile-description');
    var textarea = document.getElementById('profile-textarea');
    var editIcon = document.querySelector('.edit-icon');

    if (textarea.style.display === 'none' || textarea.style.display === '') {
        textarea.value = p.textContent;
        p.style.display = 'none';
        textarea.style.display = 'block';
        textarea.focus();
        editIcon.src = '../images/save-icon.png'; // Save icon when editing
    } else {
        p.textContent = textarea.value;
        p.style.display = 'block';
        textarea.style.display = 'none';
        editIcon.src = '../images/edit-icon.png'; // Edit icon when not editing
    }
}

//각 목록에 지정한 10가지 색상 중 랜덤한 값이 들어가게 만들기.
const colors=['#FFC061','#D4ADFB','#97E285','#F9A7A7','#1A70D6','#7BD0FF','#C8C8C8','#BADCE3','#AFA18E','#ECCCCF'];

// 모든 .card 클래스 요소에 랜덤 색상 적용하기
const cards = document.querySelectorAll('.card');
cards.forEach(card => {
    const uls = card.querySelectorAll('ul');
    uls.forEach(ul => {
        ul.style.backgroundColor = colors[Math.floor(Math.random() * colors.length)];
    });
});

// 모든 .course-button 클래스 요소에 랜덤 색상 적용하기
const courseButtons = document.querySelectorAll('.course-button');
courseButtons.forEach(button => {
    button.style.backgroundColor = colors[Math.floor(Math.random() * colors.length)];
});


document.addEventListener('DOMContentLoaded', function() {
    const courseDetails = document.querySelector('.course-details');
    courseDetails.style.display = 'none'; // 초기에 숨김 처리
});

// 유저들의 코스 하트 누르기
function toggleHeart(button) {
  const heartImage = button.querySelector('img');
  const heartCount = button.querySelector('span');
  const isLiked = heartImage.src.includes('after');
  if (isLiked) {
      heartImage.src = 'images/icon_heart_before.png';
      heartCount.textContent = parseInt(heartCount.textContent) - 1;
  } else {
      heartImage.src = 'images/icon_heart_after.png';
      heartCount.textContent = parseInt(heartCount.textContent) + 1;
  }
}
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

document.getElementById('openModalLink').onclick = function(event) {
    event.preventDefault();
    document.getElementById('modal').style.display = 'block';
};

document.querySelectorAll('.close-btn').forEach(btn => {
    btn.onclick = function() {
        document.querySelectorAll('.modal').forEach(modal => {
            modal.style.display = 'none';
        });
    };
});

document.querySelector('.yes-btn').onclick = function() {
    document.getElementById('modal').style.display = 'none';
    document.getElementById('farewellModal').style.display = 'block';
};

document.querySelector('.no-btn').onclick = function() {
    document.getElementById('modal').style.display = 'none';
};

document.querySelector('.close-farewell-btn').onclick = function() {
    document.getElementById('farewellModal').style.display = 'none';
};

window.onclick = function(event) {
    if (event.target.classList.contains('modal')) {
        document.querySelectorAll('.modal').forEach(modal => {
            modal.style.display = 'none';
        });
    }
};