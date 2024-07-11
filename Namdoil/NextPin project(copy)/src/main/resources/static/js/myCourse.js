$(function() {
    $("#testDatepicker").datepicker({
        changeMonth: true,
        changeYear: true,
        dayNamesMin: ['일','월','화','수','목','금','토'],
        monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
        showButtonPanel: true,
        showMonthAfterYear:true,
        dateFormat:"yy-mm-dd",
        beforeShow: function(input, inst) {
            var sidebarWidth = $('#side-bar').outerWidth();
            inst.dpDiv.css({ marginLeft: sidebarWidth }); // 사이드바 너비만큼 왼쪽으로 이동
        }
    });
});

// 메모 입력 함수
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('memo-active').addEventListener('change', function() {
        document.getElementById('memo-text').disabled = !this.checked;
    });
});