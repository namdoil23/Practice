package chap99_homework.homework06;

import java.util.Scanner;

public class basic06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//		   0개면 '가, 바가 존재하지 않습니다.'라고 출력.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		String inputString = scanner.nextLine();
		
		int[] counts = new int[2];
		
		for(int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if(ch == '가') {
				counts[0]++;
			} else if (ch == '바') {
				counts[1]++;
			}
			
			if( counts[0] == 0 && counts[1] == 0) {
				System.out.println("가,바가 존재하지 않습니다.");
			} else {
				System.out.println("'가'의 개수:" + counts[0]);
				System.out.println("'바'의 개수:" + counts[1]);
			}
			
		
			scanner.close();
		
//

//		
		}
		}

}
