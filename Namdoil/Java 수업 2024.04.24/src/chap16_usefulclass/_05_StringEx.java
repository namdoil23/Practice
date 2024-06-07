package chap16_usefulclass;

import java.util.Scanner;

public class _05_StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 문자열 두개 입력하여 str1, str2에 저장
		// str1이 str2를 포함하면 str1에 있는 str2를 빈칸으로 변경해서 출력
		// str1이 str2를 포함하지 않으면 str1에서 str2를 찾을 수 없습니다. 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String str1 = sc.nextLine();
		
		System.out.println("문자열을 입력하세요.");
		String str2 = sc.nextLine();
		
		if(str1.indexOf(str2) != -1) {
			System.out.println(str1.replace(str2, ""));
		} else {
			System.out.println(str1 + "에서 " + str2 + "를 찾을 수 없습니다.");
		}
		
		if(str1.contains(str2)) {
			String str3 = str1.replace(str2, "");
			System.out.println(str3);
		} else {
			System.out.println(str1 + "에서 " + str2 + "를 찾을 수 없습니다.");
		}
		
		sc.close();
	}

}
