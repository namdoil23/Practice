$(() => {
    $('.signup-container .btn .btn-outline-secondary').removeClass('btn-outline-secondary');
    $('.signup-container .btn').addClass('btn-primary mb');
    let chkFlag1, chkFlag2, chkFlag3, chkFlag4 = false;

    $('#inputId').on('blur', (e) => {
        if($('#inputId').val() === ''){
            $('#id-validate-message1').text('아이디를 입력해주세요.');
            e.preventDefault();
            return;
        }
        if($('#inputId').val().length < 5){
            $('#id-validate-message1').text('아이디는 5자 이상 입력해주세요.');
            e.preventDefault();
            return;
        }
        $('#id-validate-message1').text('');
        chkFlag1 = true;
        // console.log("메시지 값 : " + $('#id-validate-message1').text());
    });

    $('#button-addon1').on('click', function(){
        var tempId = $('#inputId').val();
        alert('중복체크 아이디 값 : ' + tempId + '               DB 작업 필요...');
    });

    $('#inputNickname').on('blur', (e) => {
        if($('#inputNickname').val() === ''){
            $('#id-validate-message3').text('닉네임을 입력해주세요.');
            e.preventDefault();
            return;
        }
        if($('#inputNickname').val().length < 2){
            $('#id-validate-message3').text('닉네임은 2자 이상 입력해주세요.');
            e.preventDefault();
            return;
        }
        $('#id-validate-message3').text('');
        chkFlag2 = true;
        // console.log("메시지 값 : " + $('#id-validate-message1').text());
    });

    $('#button-addon2').on('click', function(){
        var tempNickname = $('#inputNickname').val();
        alert('중복체크 닉네임 값 : ' + tempNickname + '               DB 작업 필요...');
    });

    $('#inputPassword').on('blur', (e) => {
        if($('#inputPassword').val() === ''){
            $('#id-validate-message5').text('비밀번호를 입력해주세요.');
            e.preventDefault();
            return;
        }
        if($('#inputPassword').val().length < 8){
            $('#id-validate-message5').text('비밀번호는 8자 이상 입력해주세요.');
            e.preventDefault();
            return;
        }
        $('#id-validate-message5').text('');
        chkFlag3 = true;
        // console.log("메시지 값 : " + $('#id-validate-message1').text());
    });

    $('#inputPasswordChk').on('blur', (e) => {
        if($('#inputPasswordChk').val() === ''){
            $('#id-validate-message6').text('비밀번호를 재입력해주세요.');
            e.preventDefault();
            return;
        }
        if($('#inputPasswordChk').val() !== $('#inputPassword').val()){
            $('#id-validate-message6').text('비밀번호가 일치하지 않습니다.');
            e.preventDefault();
            return;
        }
        $('#id-validate-message6').text('');
        chkFlag4 = true;
        // console.log("메시지 값 : " + $('#id-validate-message1').text());
    });

    $('#backToLogin').on('click', (e) => {
        if(chkFlag1 || chkFlag2 || chkFlag3 || chkFlag4){
            e.preventDefault();
            $('#staticBackdrop').modal('show');
            // $('#staticBackdrop .modal-content').css('text-align', 'center');
        }
    });

    $('#modalYes').on('click', function(){
        $('#signupForm')[0].reset();
        location.replace('login');
    });
});