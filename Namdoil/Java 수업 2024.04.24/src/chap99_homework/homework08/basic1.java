package chap99_homework.homework08;

import java.util.Calendar;

public class basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Calendar 객체를 오늘날짜로 생성하세요.
//		   객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
//		   위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤
//			(동시에)로 변경하고 출력하세요.
			Calendar today = Calendar.getInstance();
			today.set(2020, 3, 8);
			System.out.println("변경된 날짜는 " + DateToString(today) + "입니다");
			
			today.add(Calendar.YEAR, 5);
			System.out.println("변경된 날짜는 " + DateToString(today) + "입니다");
			today.add(Calendar.MONTH, 2);
			System.out.println("변경된 날짜는 " + DateToString(today) + "입니다");
			today.add(Calendar.DATE, 3);
			System.out.println("변경된 날짜는 " + DateToString(today) + "입니다");
			
			
		}
		
	public static String DateToString(Calendar calendar) {
		// 몇년 몇월 몇일 형태의 String이 리턴되도록 구현
		return calendar.get(Calendar.YEAR) + "년" +
		(calendar.get(Calendar.MONTH) + 1) + "월" +
		calendar.get(Calendar.DATE) + "일";	
		
	}
		
		
		

	}


