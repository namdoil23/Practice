package chap17_usefulclass;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _08_ZonedDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime localDateTime = LocalDateTime.now();
		
		// 1. ZoneId 객체 생성
		// of 메소드를 통해서 객체를 생성한다.
		ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
		ZoneId zoneId2 = ZoneId.of("Europe/Paris");
		
		// 2. LocalDateTime 객체의 atZone 메소드를 통해 ZoneId가 추가된
		// ZonedDateTiem 객체 생성
		ZonedDateTime zonedDateTime1 = localDateTime.atZone(zoneId1);
		ZonedDateTime zonedDateTime2 = localDateTime.atZone(zoneId2);
		
		System.out.println(localDateTime);
		System.out.println(zonedDateTime1);
		System.out.println(zonedDateTime2);
		
		System.out.println(zoneId1);
		System.out.println(zoneId2);
		
		// 3. ZonedDateTime 객체에서 ZoneId 추출
		System.out.println(zonedDateTime1.getZone());
		
		// 4. 현재 날짜와 시간을 갖는 ZonedDateTime 객체 생성
		ZonedDateTime zonedDateTime3 = ZonedDateTime.now();
		
		// withZoneSameInstant(ZoneId 객체)
		// ZonedDateTime 객체 생성하면서 Zone을 지정
		ZonedDateTime zonedDateTime4 = ZonedDateTime.now().withZoneSameInstant(zoneId2);
		
		System.out.println(zonedDateTime3);
		System.out.println(zonedDateTime3.getZone());
		System.out.println(zonedDateTime4);
		System.out.println(zonedDateTime4.getZone());
		
		
		
		
		
	}

}
