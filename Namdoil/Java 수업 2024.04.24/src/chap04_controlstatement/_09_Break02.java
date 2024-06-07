package chap04_controlstatement;

import java.util.Scanner;

public class _09_Break02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 사용자가 입력한 숫자 단까지 구구단을 출력하는 프로그램을 작성하세요. 0을 입력하면 종료하세요.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요.(0 입력 시 종료)");
			
			int userNum = sc.nextInt();
			
			if(userNum == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			for(int i = 2; i <= userNum; i++) {
				if(i > 3) 
					break;
				System.out.println(i + "단");
				for(int j = 1; j <= 9; j++) {
					// 내부 for문을 중단하는 break
					// j가 4가 되는 순간 내부 for문이 종료되고 외부 for문의 증감식으로 이동한다.
//					if(j > 3) 
//						break;
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}
		}
		
		sc.close();
	}

}
