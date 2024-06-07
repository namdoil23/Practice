package chap99_homework.homework08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		2. Calendar 객체를 오늘날짜로 생성하세요.
//		   오늘날짜를 2023-03-24 형식으로 출력하세요.
//		   오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		Calendar today = Calendar.getInstance();
		today.set(2023,02,24);
		System.out.println("오늘 날짜는 " + 
				today.get(Calendar.YEAR) + "-" +
				((today.get(Calendar.MONTH) + 1) < 10 
						? "0" + (today.get(Calendar.MONTH) + 1) 
						: (today.get(Calendar.MONTH) + 1)) + "-" +
				(today.get(Calendar.DATE) < 10 
						? "0" + today.get(Calendar.DATE)
						: today.get(Calendar.DATE))
				);
		System.out.println(DateToString(today) + "" + TimeToString(today));
		
	}
	
	
	
	public static String DateToString(Calendar calendar) {
		// 몇년 몇월 몇일 형태의 String이 리턴되도록 구현
		return calendar.get(Calendar.YEAR) + "년" +
			(calendar.get(Calendar.MONTH) + 1) + "월" +
			calendar.get(Calendar.DATE) + "일";
	
		
		
	}
	
	public static String TimeToString(Calendar calendar) {
		// 몇시(0~23) 몇분 몇초 형태의 String이 리턴되도록 구현
		return calendar.get(Calendar.HOUR_OF_DAY) + "시" +
			calendar.get(Calendar.MINUTE) + "분" + 
			calendar.get(Calendar.SECOND) + "초";
	
}
}
