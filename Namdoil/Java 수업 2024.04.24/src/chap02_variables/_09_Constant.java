package chap02_variables;

public class _09_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 상수 선언 및 초기화
		// 상수를 선언할 때는 final 키워드를 사용한다.
		final int MAX_STUDENT_COUNT = 30;
		final int CURRENT_STUDNET_COUNT = 29;
		
		System.out.println("현재 강의실 빈 자리는: " + (MAX_STUDENT_COUNT - CURRENT_STUDNET_COUNT));
		
		// 2. 상수는 선언만 하고 나중에 초기화해도 된다.
		final double PI;
		
		PI = 3.14;
		
		// 3. 한 번 저장된 상수의 값은 변경할 수 없다.
//		PI = 3.141592;
		
		// 4. 상수를 이용한 연산
		int radius = 10;
		
		System.out.println("반지름이 10인 원의 둘레: " + (2 * PI * radius));
		System.out.println("반지름이 10인 원의 넓이: " + (PI * radius * radius));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
