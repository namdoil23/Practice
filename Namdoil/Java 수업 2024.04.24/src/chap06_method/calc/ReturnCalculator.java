package chap06_method.calc;

public class ReturnCalculator {
	// 2. 리턴타입: 메소드가 종료되고 반환되는 결과 값의 자료형을 지정
	// 2-1. 결과값이 없는 메소드는 리턴타입을 void로 지정한다.
	public void add() {
		System.out.println(10 + 20);
		// 리턴타입이 void인 메소드에서 return 구문을 사용하면 에러 발생
//		return 20;
	}
	
	// 2-2. 결과값이 있는 메소드는 결과값의 자료형을 리턴타입으로 지정한다.
	// 결과 값이 int인 메소드
	public int sub() {
		return 20 - 10;
	}
	
	// 지정한 리턴타입과 다른 자료형의 값을 리턴해도 에러가 발생한다.
//	public int div() {
//		return (double)20 / 10;
//	}
	
	public double div() {
		return (double)20 / 10;
	}
	
	// 참조 타입의 값도 리턴타입으로 지정할 수 있다.
	public String createString() {
		return "hello java";
	}
	
	public int[] createArray() {
		return new int[5];
	}
	
	// 우리가 만드는 클래스들도 참조타입이기 때문에 리턴타입으로 지정가능하다.
	public AccessModifierCalculator createAnObject() {
		return new AccessModifierCalculator();
	}
	
	
	
}
