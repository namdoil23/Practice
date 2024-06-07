package chap20_enum;

import chap20_enum.enums.MethodMonth;

public class _06_MethodEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. enum에 선언된 static 메소드 사용
		// class에 선언된 static 메소드와 사용법이 동일하다.
		MethodMonth.printMonths();
		
		// 2. enum에 선언된 인스턴스 메소드 사용
		// enum 객체를 생성한 후 메소드를 호출한다.
		MethodMonth methodMonth = MethodMonth.JAN;
		
		methodMonth.printMonth(12);
		
		methodMonth.printAddMonth(130);
		
		// 3. enum에 선언된 추상메소드 사용
		methodMonth.printHangulMonth();
	}

}
