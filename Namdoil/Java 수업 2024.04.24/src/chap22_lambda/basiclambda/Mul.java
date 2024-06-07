package chap22_lambda.basiclambda;

@FunctionalInterface
public interface Mul {
	// 매개변수가 두 개인 함수형 인터페이스의 추상메소드
	void multiply(int a, int b);
}
