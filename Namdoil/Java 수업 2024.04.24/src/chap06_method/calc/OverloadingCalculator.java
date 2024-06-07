package chap06_method.calc;

public class OverloadingCalculator {
	// 기본적으로 동일한 메소드명으로 메소드를 여러개 생성할 수 없는데
	// 오버로딩을 통해서 동일한 이름의 메소드를 여러개 생성할 수 있다.
	// 오버로딩은 메소드의 매개변수의 타입, 개수, 순서를 다르게 하여 메소드를 생성하는 것이다.
	public int add(int a, int b) {
		return a + b;
	}
	
	// 매개변수의 타입이 다른 메소드
	public int add(double a, int b) {
		return (int)a + b;
	}
	
	// 두 번째 add 메소드와 매개변수의 순서가 다른 메소드
	public int add(int a, double b) {
		return a + (int)b;
	}
	
	// 매개변수의 개수가 다른 메소드
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	// 매개변수의 이름이 달라도 이미 int 값 두개를 받는 add 메소드가 존재하기 때문에
	// 에러 발생
//	public int add(int e, int f) {
//		return e + f;
//	}
}
