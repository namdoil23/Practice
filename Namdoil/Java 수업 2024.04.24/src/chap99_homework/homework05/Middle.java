package chap99_homework.homework05;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		1. Reverse라는 클래스를 만들고 메소드로 
//		   String reverseString(String str)를 만듭니다.
//		    매개변수로 받은 str을 거꾸로 만든 String을 리턴하도록 만드세요.
		Reverse reverse = new Reverse();
		
		System.out.print("문자열을 입력하세요.");
		String str1 = sc.nextLine();
		
		System.out.println(reverse.reverseString(str1));
		
//		2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
		System.out.print("문자열을 입력하세요.");
		String str2 = sc.nextLine();
		 
		for(int i = 0; i < str2.length(); i++) {
			for(int j = 0; j < i; j++) {
				if(str2.charAt(i) == str2.charAt(j)) {
					str2 = str2.replace(
							String.valueOf(str2.charAt(i)), "");
					i = 0;
				}
			}
		}
		
		System.out.println(str2);
		
//		3. 사용자가 입력한 문자열에서 3의 배수 자리의 문자는 3으로 
//		5의 배수 자리의 문자는 5로 변경하여 출력하세요.
		System.out.print("문자열을 입력하세요.");
		// ab35edf
		String str3 = sc.nextLine();
		String newStr = "";
		
		for(int k = 0; k < str3.length(); k++) {
			if(k > 0) {
				if(k % 3 == 0 && k % 5 == 0) {
					newStr += "35";
				} else {
					if(k % 3 == 0) {
						newStr += "3";
					} else if(k % 5 == 0) {
						newStr += "5";
					} else {
						newStr += str3.charAt(k);
					}
				}
			} else {
				newStr += str3.charAt(k);
			}
		}
		
		System.out.println(newStr);
		
		sc.close();

	}
}
