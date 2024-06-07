package chap99_homework.homework07;

import java.util.Scanner;

public class middle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		
		StringBuffer sb = new StringBuffer(30);
		// 크기 30인 StringBuffer 객체 생성
		sb.append("hello");
		
		int remainBufferSize = sb.capacity() - sb.length();
		
		for(int i = 0; i < remainBufferSize; i++) {
			sb.append("bit");
		}
		System.out.println(sb);
		

		//	2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 
//		StringBuffer이 있을 때 사용자가 정수를 입력하고 위 StringBuffer를 
//		거꾸로 만든 StringBuffer의 사용자가 입력한 정수에 해당하는 
//		인덱스의 문자를 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		
		int idx = sc.nextInt();
		
		StringBuffer sa = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		sa.reverse(); 
		
		System.out.println(sa.charAt(idx));	
		
		sc.close();
	}
	

}
