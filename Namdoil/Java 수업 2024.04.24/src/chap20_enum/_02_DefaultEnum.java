package chap20_enum;

import chap20_enum.enums.DefaultMonth;

public class _02_DefaultEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Enum은 객체처럼 사용
		// DefaultMonth.JAN에 해당하는 값의 DefaultMonth 객체를 하나 생성
		DefaultMonth defaultMonth = DefaultMonth.AUG;
		
		// enum 객체를 출력하면 상수의 이름(변수명)이 출력된다.
		// 상수의 값을 출력하려면 enum 클래스에 메소드를 정의해서 호출해야한다.
		System.out.println(defaultMonth);
		
		// 2. name()메소드: enum 객체의 지정된 상수명을 리턴
		System.out.println(defaultMonth.name());
		
		// 3. ordinal() 메소드: enum 객체의 지정된 상수의 위치(인덱스)를 리턴
		System.out.println(defaultMonth.ordinal());
		
		// 4. values() 메소드: enum 클래스에 선언되어 있는 상수들을 enum 객체 배열로 만들어서 리턴
		// static 메소드여서 enum 클래스 원형.values()로 호출한다.
		DefaultMonth[] defaultMonthArr = DefaultMonth.values();
		
		for(DefaultMonth dm : defaultMonthArr) {
			System.out.println(dm.name() + "은(는) " + dm.ordinal() + "에 있습니다.");
		}
		
		// 5. valueOf(String 상수명): 상수명에 해당하는 enum 객체를 리턴
		DefaultMonth aug = DefaultMonth.AUG;
		DefaultMonth aug2 = DefaultMonth.valueOf("AUG");
		
		System.out.println(aug);
		System.out.println(aug2);
		
		
		
		
		
		
		
		
		
		
	}

}
