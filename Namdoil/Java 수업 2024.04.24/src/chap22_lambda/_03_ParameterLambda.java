package chap22_lambda;

import chap22_lambda.basiclambda.Mul;
import chap22_lambda.basiclambda.MulAndDiv;
import chap22_lambda.basiclambda.SingleMul;

public class _03_ParameterLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		
		// 1. 매개변수가 하나인 함수형 인터페이스의 추상메소드를 구현하는 람다식
		singleMul(num1, (a) -> {System.out.println(a * a);});
		
		// 매개변수가 하나인 람다식에서는 소괄호를 생략해도 된다.
		singleMul(num2, a -> {System.out.println(a * a);});
		
		// 2. 매개변수가 여러개거나 매개변수가 없는 람다식에서는 소괄호를 생략할 수 없다.
		mul(num1, num2, (a, b) -> {System.out.println(a * b);});
		mul(num1, num2, (a, b) -> {System.out.println(a * b * a * b);});
//		mul(num1, num2, a, b -> {System.out.println(a * b);});
		
		// 3. 함수형 인터페이스를 매개변수로 받는 메소드를 선언한 클래스를 사용
		MulAndDiv mulAndDiv = new MulAndDiv();
		mulAndDiv.singleMul(num1, a -> {System.out.println(a * a * a * a);});
		mulAndDiv.mul(num1, num2, (a,b) -> {System.out.println(a * b * a);});
		mulAndDiv.mul(num1, num2, (a,b) -> {System.out.println((double)a / b);});

	}
	
	public static void mul(int a, int b, Mul mul) {
		mul.multiply(a, b);
	}
	
	public static void singleMul(int a, SingleMul singleMul) {
		singleMul.singleMultiply(a);
	}
}
