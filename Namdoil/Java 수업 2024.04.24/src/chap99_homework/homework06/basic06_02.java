package chap99_homework.homework06;

import java.util.Scanner;

public class basic06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//		   대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		
		String inputString = scanner.nextLine();
		
		String resultString = removeVowels(inputString);
		
		System.out.println("모음이 제거된 문자열: " + resultString);
		
		scanner.close();
	}

	public static String removeVowels(String str) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
						// 문자열 반환
			if (!isVowel(ch)) {
				result.append(ch);
						//문자열을 덧붙인다
			}
		}
		return result.toString();
						// 문자열을 반환
	}

	public static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
				 ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	}
	
}

