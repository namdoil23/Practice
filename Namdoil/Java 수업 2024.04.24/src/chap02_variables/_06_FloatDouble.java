package chap02_variables;

public class _06_FloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. float 타입의 변수 선언 및 초기화
		// F, f 붙이는 것에 차이가 없다.
		float fNum1 = 3.14f;
		float fNum2 = 3.14F;
		
		// 2. double 타입의 변수 선언 및 초기화
		double dNum1 = 89.1234;
		double dNum2 = 11.984;
		
		// 3. 실수형 타입의 연산
		float result1 = fNum1 + fNum2;
		double result2 = dNum1 / dNum2;
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
