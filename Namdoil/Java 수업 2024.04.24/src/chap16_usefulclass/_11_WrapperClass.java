package chap16_usefulclass;

public class _11_WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Integer 객체(래퍼 클래스의 객체) 생성
		// 자바 9 버전부터 래퍼클래스의 생성자 사용불가능
		Integer num1 = 10;
		Integer num2 = Integer.valueOf(300);
		Integer num3 = Integer.valueOf("300");
		
		// 2. 기본 타입은 값을 저장하는 기능 제공한다.
		// 속성이나 메소드를 사용할 수 없다
		// 속성이나 메소드를 사용하려면 기본 타입에 매핑된 래퍼클래스 객체로 변환해서 사용한다.
		int num4 = 30;
		
		// 아무런 속성이나 기능이 존재하지 않는다.
//		num4.
		
		Integer num5 = Integer.valueOf(num4);
		
		Integer num6 = Integer.valueOf(100);
		Integer num7 = Integer.valueOf(100);
		
		// 3. 같은 객체를 사용하는 지 비교
		// valueOf 메소드로 생성되는 객체는 값이 같으면 같은 객체를 사용한다.
		// -128 ~ 127까지만 같은 객체를 리턴하고 범위를 벗어난 값은 새로운 객체를 생성한다.
		System.out.println(num6 == num7);
		
		// 4. equals 메소드는 오버라이드가 되어있어서 값의 동일여부를 비교한다.
		System.out.println(num1.equals(num6));
		System.out.println(num6.equals(num7));
		
		// 5. compareTo: 객체에 저장되어 있는 값이 같으면 0 다르면 작으면 1, 크면-1 리턴
		Integer num8 = Integer.valueOf(500);
		
		System.out.println(num1.compareTo(num6));	
		System.out.println(num6.compareTo(num7));
		System.out.println(num8.compareTo(num6));
		
		// 6. parseInt: 문자열 값을 int 타입으로 변환
		String numStr = "1000";
		int converNum = Integer.parseInt(numStr);
		long converLongNum = Long.parseLong(numStr);

		
		// 7. int 타입의 최대값과 최소값을 상수(static fianl)로 지정해놔서 바로 사용할 수 있다
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// 8. toString: Integer객체를 String 타입으로 객체로 변환
		String convertStr = num1.toString();
		System.out.println(convertStr.getClass().getSimpleName());
		
		// 9. 생성된 Integer 객체의 사이즈 ,바이트, 타입 확인
		System.out.println(num1.SIZE);
		System.out.println(num1.BYTES);
		System.out.println(num1.TYPE);
		
		
		
	}

}
