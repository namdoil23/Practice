package chap22_lambda.basiclambda;

@FunctionalInterface
public interface ConcatString {
	// 리턴 값이 있는 함수형 인터페이스의 추상메소드
	String concat(String str1, String str2);
	
}
