package chap02_variables;

public class _02_ScopeOfVariables {
	// 1. 클래스 변수 선언(static으로 선언)
	// 클래스 중괄호 안에서 어디서든지 접근해서 사용하거나 값을 저장할 수 있다.
	static int num;
	
	// 인스턴스 변수(static 키워드 없이 클래스 안에서 선언된 변수)
	int num1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1-1. 클래스 변수의 사용
		num = 100;
		System.out.println(num);
		
		// 2. 지역변수 선언
		// main 메소드 안에서 선언되었기 때문에 main 메소드 중괄호에서만 접근해서 사용하거나 값을 저장할 수 있다.
		int mainMethodNum= 10;
		int sum = 0;
		
		// 3. 제어문의 지역변수 선언
		if(sum == 0) {
			int ifNum = 30;
			// mainMethodNum, sum은 if문 중괄호 블록보다 상위인 메소드 중괄호 블록에서 선언되었기 때문에
			// if문 안에서 사용가능하다.
			sum = mainMethodNum + ifNum;
		}
		
		// 제어문에서 선언된 지역변수를 제어문 밖에서 사용하면 에러가 발생한다.
//		System.out.println(ifNum);
		System.out.println(sum);
		
		// 4-1. 메소드의 실행(호출)
		// localVal1, localVal2, localResult는 이때 메모리에 저장되었다가 메소드가 종료되는 시점에서 메모리에서 삭제
		getSum();
		// 메소드의 종료
		
		// 지역변수는 메소드가 종료되면서 메모리에서 삭제되기 때문에 메모리에 남아있지 않는 변수에 접근하려고 해서 에러가 발생
		/*
		 * System.out.println(localVal1); System.out.println(localVal2);
		 * System.out.println(localResult);
		 */
	}
	
	// 다른 메소드 선언
	public static void getSum() {
		// 2-1. main 메소드에 선언된 변수를 다른 메소드에서 호출하면 에러가 발생한다.
//		System.out.println(mainMethodNum);
		
		// 4. 메소드의 지역변수 선언
		// 메소드의 지역변수들은 메소드가 실행될 때 메모리에 저장(할당)되었다가 메소드의 실행이 끝나면 자동으로 메모리에서 삭제
		int localVal1 = 50;
		int localVal2 = 60;
		
		int localResult = localVal1 + localVal2;
	}
	
	
	
	
	
	
	
	
	
}
