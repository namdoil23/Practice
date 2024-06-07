package chap22_lambda;

import chap22_lambda.basiclambda.Calculator;

public class _01_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		
		// 2. 함수형 인터페이스를 익명객체로 구현
		calc(num1, num2, new Calculator() {
			@Override
			public void calculate(int a, int b) {
				System.out.println(a + b);
			}
		});
		
		// 3. 함수형 인터페이스를 람다식으로 구현
		// 함수형 프로그래밍은 매개변수로 함수를 전달하여 데이터 처리를 다형성을 제공하는 방식이다.
		// 자바에서는 람다식을 이용해서 함수형 프로그래밍을 지원한다.
		// 매개변수로 넘겨주는 람다식의 처리내용을 다르게 해주면 같은 메소드를 호출해도
		// 전혀 다른 결과값이 나오기 떄문에 함수(메소드)의 다형성을 구현할 수 있다.
		calc(num1, num2, (a , b) -> {System.out.println(a * b);});
		calc(num1, num2, (a , b) -> {System.out.println(a - b);});
	}

	//1. 함수형 인터페이스를 매개변수로 받는 메소드 선언
	// 메소드를 호출하는 부분에서 매개변수로 선언된 함수형 인터페이스의 구현제를 넘겨준다.
	// 함수형 인터페이스의 구현체를 구현하는 방법은 익명객체와 람다식이다.
	public static void calc(int a, int b, Calculator calculator) {
		calculator.calculate(a, b);
	}
	
}
