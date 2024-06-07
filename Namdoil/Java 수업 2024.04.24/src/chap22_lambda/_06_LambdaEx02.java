package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.ConvertcaseString;

public class _06_LambdaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 소문자로 변환하는 추상메소드(ConvertcaseString 인터페이스의 toConvertcase)
		// 람다식으로 구현 
		// 여기서 구현한 람다식의 내용이 toConvertcase의 동작으로 만들어진다.
		printConvertCase(s1 -> s1.toLowerCase());
		
		// 2. 대문자로 변환하는 추상메소드 람다식으로 구현
		printConvertCase(string -> string.toUpperCase());

		
	}
	
	public static void printConvertCase(ConvertcaseString convertcaseString) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 단어를 입력하세요.");
		String str = sc.nextLine();
		
		System.out.println("입력받은 문자열: " + str);
		
		// 함수형 인터페이스의 추상메소드 호출
		// 함수형 인터페이스의 메소드는 추상메소드라 어떤 동작을 할지 알 수 없는 상태
		// 리턴 타입이랑 매개변수타입만 알 수 있다.
		// 함수형 인터페이스의 추상메소드의 동작은 추상메소드가 호출되는 메소드의 매개변수로
		// 람다식을 전달하면서 만들어진다.
		String convertStr = convertcaseString.toConvertcase(str);
		
		System.out.println("변환된 문자열: " + convertStr);
		
		
		
		
		
		
		
		
	}
}
