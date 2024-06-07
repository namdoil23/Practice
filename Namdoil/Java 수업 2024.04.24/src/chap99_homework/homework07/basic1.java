package chap99_homework.homework07;

import java.util.Scanner;

public class basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).
//
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 문자열을 입력하세요.");
		String str1 = sc.nextLine();
		
		System.out.println("두번째 문자열을 입력하세요.");
		String str2 = sc.nextLine();
		
		System.out.println("세번째 문자열을 입력하세요.");
		String str3 = sc.nextLine();
		
		StringBuffer stb1 = new StringBuffer(str1);
		StringBuffer stb2 = new StringBuffer(str2);
		StringBuffer stb3 = new StringBuffer(str3);
		
		stb1.append(stb2)
			.append(stb3);
		// 기존 StringBuffer에 새로운 문자열을 추가하여 StringBuffer 타입으로 리턴 
		System.out.println(stb1);
		
		sc.close();
		
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		    비어있는 바이트의 공간을 a로 모두 채우시오.
		
		StringBuffer sb = new StringBuffer(30);
		// 크기 30인 StringBuffer 객체 생성
		sb.append("hello");
		// hello 문자열 추가
		int remainBufferSize = sb.capacity() - sb.length();
		
		for(int i = 0; i < remainBufferSize; i++) {
			sb.append("a");
		
		}
		System.out.println(sb);
	}
}

