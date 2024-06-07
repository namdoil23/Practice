package chap06_method.calc;

public class AccessModifierCalculator {
	public int num;
	// 1. 접근제어자
	// 접근제어자는 메소드의 사용범위를 지정하는 기능이다.
	
	// public: 어디서나 사용가능한 접근제어자
	public void add() {
		System.out.println(10 + 20);
	}
	
	// protected: 현재 클래스, 같은 패키지내의 클래스, 자식 클래스에서 사용가능
	protected void sub() {
		System.out.println(20 - 10);
	}
	
	// default: 현재 클래스, 같은 패키지내의 클래스에서 사용가능
	// default 접근제어자는 접근제어자를 명시하지 않으면 생성된다.
	void mul() {
		System.out.println(10 * 20);
	}
	
	// private: 현재 클래스에서만 사용가능
	private void div() {
		System.out.println(20 / 10);
	}
}
