package chap99_homework.homework07;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		StringBuffer sb1 = new StringBuffer(30);
		sb1.append("hello");
		
		int len = sb1.capacity() - sb1.length();
		
		for(int i = 0; i < len; i++) {
			if(i % 3 == 0) {
				sb1.append("b");
			} else if(i % 3 == 1) {
				sb1.append("i");
			} else if(i % 3 == 2) {
				sb1.append("t");
			}
		}
		
		System.out.println(sb1);

//		2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 문자열이 있을때
//		사용자가 정수를 입력하고 문자열을 거꾸로 만든 문자열의 정수 인덱스의 문자를 출력하세요.
		StringBuffer sb2 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		sb2.reverse();
		
		System.out.print("정수를 하나 입력하세요.");
		int inputNum1 = sc.nextInt();
		
		System.out.println(sb2.charAt(inputNum1));
}
}
