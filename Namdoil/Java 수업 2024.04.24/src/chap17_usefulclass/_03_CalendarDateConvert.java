package chap17_usefulclass;

import java.util.Calendar;
import java.util.Date;

public class _03_CalendarDateConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 6, 7);
		
		// 1. Calendar 객체를 Date 객체로 변환
		// Date 생성자에 매개변수로 Calendar 객체의 getTimeInMills() 메소드를 전달
		Date date = new Date(cal.getTimeInMillis());
		
		// 2. Date 객체를 Calendar 객체로 변환
		Calendar cal2 = Calendar.getInstance();
		
		// Calendar 객체의 setTime메소드의 매개변수로 Date 객체 전달
		cal2.setTime(date);
		
		// 3. Date, Calendar 객체는 toString이 오버라이드 되어있다.
		System.out.println(date);
		System.out.println(cal2);

		
	}

}
