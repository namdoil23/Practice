package chap16_usefulclass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _13_Regex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정규표현식 문자열 생성
		// 소문자 c로 시작하고 소문자 a-z로 구성된 모든 문자열
		String pattern = "c[a-z]*";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String compare = sc.nextLine();
		
		// 2. 정규표현식을 Pattern 객체로 생성
		// Pattern 클래스의 compile 메소드 생성
		Pattern pt = Pattern.compile(pattern);
		
		// 3. 비교할 문자열을 Matcher 객체로 생성
		// Pattern 객체의 matcher 메소드 사용
		Matcher matcher = pt.matcher(compare);
		
		// 4. Matcher 객체의 matchers 메소드로 문자열이 정규표현식과 부합한지 비교
		// 부합하면 true, 부합하지 않으면 false
		if(matcher.matches()) {
			System.out.println(compare + "는 소문자로 c로 시작하고 소문자 a-z만 포함한 문자열입니다.");
		}else {
			System.out.println("부합하지 않습니다.");
		}
	}

}
