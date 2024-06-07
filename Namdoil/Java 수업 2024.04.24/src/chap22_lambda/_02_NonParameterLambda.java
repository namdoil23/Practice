package chap22_lambda;

import chap22_lambda.basiclambda.Add;

public class _02_NonParameterLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 매개변수가 없는 함수형 인터페이스의 추상메소드 람다식으로 구현
		// 매개변수가 없는 추상메소드를 람다식으로 구현할 때는 비어있는 ()을 넣어준다.
		// 람다식은 구현부의 내용대로 결과값이 달라진다.
		add(() -> { System.out.println(30+40);});
		add(() -> { System.out.println(50+100);});
		add(() -> {
			System.out.println(120+20);
			System.out.println(200+300);
		});
	}
	// 함수형 인터페이스를 매개변수로 받는 메소드 선언
	public static void add(Add add) {
		add.add();
	}
}
