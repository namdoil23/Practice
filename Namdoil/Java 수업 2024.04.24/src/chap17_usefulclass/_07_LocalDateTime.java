package chap17_usefulclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _07_LocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. LocalDateTime 객체 생성
		// 1-1. LocalDate, LocalTime 객체를 이용한 객체생성
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
		LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);

		// 1-2. 원하는 날짜 값을 입력하는 객체 생성
		// Canlendar와 달리 월에 +1을안해줘도 된다.
		LocalDateTime localDateTime2 = LocalDateTime.of(2024, 3, 24, 11, 11, 23);
		
		// 1-3. LocalDate.atTime메소드와 LocalTime.atDate메소드를 사용하여 객체 생성
		LocalDateTime localDateTime3 = localDate.atTime(localTime);
		LocalDateTime localDateTime4 = localTime.atDate(localDate);
		
		System.out.println(localDateTime1);
		System.out.println(localDateTime2);
		System.out.println(localDateTime3);
		System.out.println(localDateTime4);
		
		// 1-4. 현재 날짜와 시간을 갖는 객체 생성
		LocalDateTime localDateTime5 = LocalDateTime.now();
		System.out.println(localDateTime5);


	}

}
