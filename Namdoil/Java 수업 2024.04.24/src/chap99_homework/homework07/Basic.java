package chap99_homework.homework07;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용필수).
		StringBuffer sb1 = new StringBuffer();
		
		for(int i = 0; i < 3; i++) {
			System.out.print("문자열을 입력해주세요.");
			sb1.append(sc.nextLine());
		}
		
		System.out.println(sb1);
		
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		    비어있는 바이트의 공간을 a로 모두 채우시오.
		StringBuffer sb2 = new StringBuffer(30);
		
		sb2.append("hello");
		
		int len = sb2.capacity() - sb2.length();
		
		for(int i = 0; i < len; i++) {
			sb2.append("a");
		}
		
		System.out.println(sb2);
	}
}
