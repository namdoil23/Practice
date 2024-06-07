package chap99_homework.homework06;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
		// 문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
		System.out.println("문자열을 입력하세요.");
		String str1 = sc.nextLine();

		if(str1.length() % 2 == 0) {
			System.out.println("" + str1.charAt(str1.length() / 2 - 1) + str1.charAt(str1.length() / 2));
		} else {
			System.out.println("" + str1.charAt(str1.length() / 2));
		}

		// 2. 1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
		// 단어를 bit, com, sql, int로 만들어서 모두 출력하세요.(힌트 bit => [0], [4], [8]에 있습니다.)
		char[] chArr = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};

		String[] strArr = {"", "", "", ""};

		for(int i = 0; i < chArr.length; i++) {
			if(i % 4 == 0) {
				strArr[0] += chArr[i];
			} else if(i % 4 == 1) {
				strArr[1] += chArr[i];
			} else if(i % 4 == 2) {
				strArr[2] += chArr[i];
			} else if(i % 4 == 3) {
				strArr[3] += chArr[i];
			}
		}

		for(String s : strArr) {
			System.out.println(s);
		}
		
		String bit = "bit";
		String com = "com";
		String sql = "sql";
		String intStr = "int";
		
		char[] charArr2 = new char[12];
		
		for(int i = 0; i < charArr2.length; i++) {
			if(i % 4 == 0) {
				charArr2[i] = bit.charAt(i / 4);
			} else if(i % 4 == 1) {
				charArr2[i] = com.charAt(i / 4);
			} else if(i % 4 == 2) {
				charArr2[i] = sql.charAt(i / 4);
			} else {
				charArr2[i] = intStr.charAt(i / 4);
			}
		}
		
		for(char c : charArr2) {
			System.out.print(c + ", ");
		}
		
		sc.close();
		
//		3. 처음에 은행에 맡긴 돈은 10000원입니다
//		   금리는 연 10%입니다
//		   복리이자로 계산했을 때 10년후 얼마가 될까요?
		int money = 10000;
		
		for(int i = 1; i <= 10; i++) {
			//money = money * 0.1 => money * (1 + 0.1)
			money *= 1.1;
		}
		
		System.out.println("10년 후 금액 : " + money);
		
		sc.close();
	}
}
