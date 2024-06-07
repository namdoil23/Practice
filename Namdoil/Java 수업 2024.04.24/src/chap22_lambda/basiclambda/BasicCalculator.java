package chap22_lambda.basiclambda;

// @FunctionalInterface를 이용해서 함수형 인터페이스로 지정
// @FunctionalInterface: 함수형 인터페이스라고 선언
//						 추상 메소드는 하나만 가질 수 있고 
//						 선언된 추상메소드를 람다식으로 구현할 수 있게 해준다.
// 						 컴파일러과정에서 추상메소드가 하나인지 검사
@FunctionalInterface
public interface BasicCalculator {
	int calculate(int a, int b, String operator);
	// 함수형 인터페이스는 무조건 추상메소드 하나만 소유할 수 있다.
//	void add(int a, int b);
}
