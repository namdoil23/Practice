package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.ConcatString;

public class _04_ReturnLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 리턴값이 있는 람다식1
		// 처리부에 중괄호 블록을 사용하지 않으면 해당 내용이 바로 리턴된다.
		// 처리하는 내용이 한 줄일 때만 사용가능
		String result = conc((str1, str2) -> str1 + str2);
		System.out.println(result);
		
		// 2. 리턴 값이 있는 람다식2
		// 처리부에 중괄호 블록을 사용하면 항상 리턴 구문을 사용해줘야한다.
		// 중괄호블록에서 return 구문을 사용하지 않으면 에러가 발생한다.
		// 처리하는 내용이 한 줄이거나 여러 줄일 때 모두 사용가능
//		result = conc((s1, s2) -> { s1 + s2;});
		result = conc((s1, s2) -> {return s1 + s2;});
		System.out.println(result);
		
		// 3. 처리하는 내용이 여러줄일 때 중괄호 블록을 생략하면 에러가 발생한다.
//		result = conc((st1, st2) -> 
//			System.out.println(st1); 
//			System.out.println(st2); 
//			st1 + st2;
//		);
		
		// 처리할 내용이 여러 줄일때는 중괄호블록으로 묶고 리턴 구문을 사용한다.
		result = conc((st1, st2) -> {
			System.out.println(st1); 
			System.out.println(st2); 
			return st1 + st2;
		});
		System.out.println(result);
		
		// 4. 리턴 값이 있는 람다식3
		// 처리할 내용이 한 줄이고 리턴값이 있는 람다식
		// 리턴할 내용을 소괄호로 묶어도 된다.
		result = conc((str1, str2) -> (str1 + str2));
		System.out.println(result);
		
		// 5. 람다식에서는 중괄호 블록 안에서만 ;(세미콜론)을 사용한다.
		// 에러발생
//		result = conc((str1, str2) -> (str1 + str2););
//		result = conc((str1, str2) -> str1 + str2;);
		result = conc((str1, str2) -> {return str1 + str2;});
		System.out.println(result);
	}
	
	public static String conc(ConcatString concatString) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String str1 = sc.nextLine();
		System.out.println("문자열을 입력하세요.");
		String str2 = sc.nextLine();
		
		sc.close();
		
		return concatString.concat(str1, str2);
	}
}
