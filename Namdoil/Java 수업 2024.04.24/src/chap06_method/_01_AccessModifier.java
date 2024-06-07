package chap06_method;

import chap06_method.calc.AccessModifierCalculator;

public class _01_AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 클래스 구분
		// 메인메소드를 가지고 있는 클래스는 실행 클래스로 실제 자바 코드가 실행되는 클래스
		// 메인메소드가 없는 클래스는 부품의 역할만 하는 클래스
		// 메인메소드가 없는 클래스는 변수로 선언해서 사용해야 한다.
		// 객체(부품) 생성
		AccessModifierCalculator ac = new AccessModifierCalculator();
		
		String str = "aaa";
		
		// 클래스에 정의해놓은 메소드나 변수를 사용할 때는 
		// 변수명.변수명, 변수명.메소드명으로 사용한다.
		// 현재 AccessModifierCalculator가 다른 패키지에 있기 때문에
		// public으로 선언한 add 메소드만 사용할 수 있다.
		ac.add();
		
		// 상속받은 자식 클래스에서 protected 메소드 사용하는 예제
		AccessModifierCalculatorChild acChild = new AccessModifierCalculatorChild();
		acChild.print();
	}

}
