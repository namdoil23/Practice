package chap99_homework.homework06;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
		// 0개면 '가, 바가 존재하지 않습니다.'라고 출력.
		System.out.println("문자열을 입력하세요.");
		String str1 = sc.nextLine();
		int gaCnt = 0;
		int baCnt = 0;

		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == '가') {
				gaCnt++;
			} else if(str1.charAt(i) == '바') {
				baCnt++;
			}
		}

		if(gaCnt == 0 && baCnt == 0) {
			System.out.println("가, 바가 존재하지 않습니다.");
		} else {
			System.out.println("가의 개수: " + gaCnt + ", 바의 개수: " + baCnt);
		}


		// 2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
		// 대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
		System.out.println("문자열을 입력하세요.");
		String str2 = sc.nextLine();
		String str3 = "";

		for(int i = 0; i < str2.length(); i++) {
			if(str2.charAt(i) != 'a' && str2.charAt(i) != 'A'
				&& str2.charAt(i) != 'e' && str2.charAt(i) != 'E'
				&& str2.charAt(i) != 'i' && str2.charAt(i) != 'I'
				&& str2.charAt(i) != 'o' && str2.charAt(i) != 'O'
				&& str2.charAt(i) != 'u' && str2.charAt(i) != 'U') {
					str3 += str2.charAt(i);
				}
		}

		System.out.println(str3);		

//		3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx)
		System.out.println((double)Math.round(16.456 * 100) / 100);
		
		sc.close();
	}
}
