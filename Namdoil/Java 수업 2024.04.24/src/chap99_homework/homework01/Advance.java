package chap99_homework.homework01;

import java.util.Scanner;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 금액을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요.
//		   출력 개수는 단위가 큰 것 순서로 계산합니다
//		   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int count;
		String printStr = "";
		
		count = money / 50000;
		printStr += "<오만원 " + count + "매, ";
		money -= count * 50000; // money %= 50000;
		
		
		count = money / 10000;
		printStr += "만원 " + count + "매, ";
		money -= count * 10000; // money %= 10000;
		
		count = money / 5000;
		printStr += "오천원 " + count + "매, ";
		money -= count * 5000;
		
		count = money / 1000;
		printStr += "천원 " + count + "매, ";
		money -= count * 1000;
		
		count = money / 500;
		printStr += "500원 " + count + "개, ";
		money -= count * 500;
		
		count = money / 100;
		printStr += "100원 " + count + "개, ";
		money -= count * 100;
		
		count = money / 50;
		printStr += "50원 " + count + "개, ";
		money -= count * 50;
		
		count = money / 10;
		printStr += "10원 " + count + "개> 입니다.";
		money -= count * 10;
		
		System.out.println(printStr);
		
//
//		2. 369게임을 작성합니다.
//		   1~99까지의 정수를 입력받고
//		   3,6,9중 하나가 있으면 "박수짝"을 출력하고
//		   2개가 있으면 "박수짝짝"을 출력하세요
//		   예를 들어 13은 "박수짝"
//		   36인 경우는 "박수짝짝"을 출력하면 됩니다.
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 99) {
			int tenNum = num / 10;
			int oneNum = num - tenNum * 10;
			count = 0;
			
			if(tenNum > 0 && tenNum % 3 == 0) {
				count++;
			}
			
			if(oneNum > 0 && oneNum % 3 == 0) {
				count++;
			}
			
			if(count == 1) {
				System.out.println("박수짝");
			} else if(count == 2) {
				System.out.println("박수짝짝");
			} else {
				System.out.println("3, 6, 9를 찾을 수 없습니다.");
			}
		} else {
			System.out.println("99이하의 수만 입력하세요.");
		}
		sc.close();
//
//		3. 다음과 같이 출력하세요.
//		4321001234
//	 0	    *
//	 1	   ***
//	 2	  *****
//	 3	 *******
//	 4	*********
		for (int i = 0; i < 5; i++) {
	        for (int j = 4; j >= 0; j--) {
	        	if(i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
	        }
	        for(int k = 0; k < i; k++) {
	        	System.out.print("*");
	        }
	        System.out.println();
	    }
	}

}
