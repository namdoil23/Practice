package chap16_usefulclass;

public class _09_Math02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123;
		int num2 = -456;
		
		// 1. abs: 절대값을 리턴해주는 메소드
		System.out.println(Math.abs(num1));
		System.out.println(Math.abs(num2));
		
		// 2. max: 두 개의 매개변수 중 큰 값을 리턴
		//	  min: 두 개의 매개변수 중 작은 값을 리턴
		//    두개의 매개변수가 동일한 타입의 값으로 전달되어야한다.
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.min(num1, num2));
		
		// 3. rint: 매개변수로 주어진 실수에서 가장 가까운 정수 값을 double 타입으로 리턴(근사치)
		System.out.println(Math.rint(123.456));
		System.out.println(Math.rint(1.5));
		System.out.println(Math.rint(2.5));
	
	
	}

}
