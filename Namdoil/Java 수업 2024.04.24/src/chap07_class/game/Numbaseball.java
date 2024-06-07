package chap07_class.game;

import java.util.Scanner;

public class Numbaseball {
	// 1. 컴퓨터가 0~9 까지 숫자중 랜던한 값 3개를 배열에 저장(중복불가능)
	// 2. 사용자가 0~9까지 숫자 세개 입력(중복불가능)
	// 3. 사용자가 입력한 숫자 중 컴퓨터가 가지고 있는 숫자와 같은 숫자면서 위치가 다르면 볼로 판단
	// 4. 사용자가 입력한 숫자 중 컴퓨터가 가지고 있는 숫자와 같은 숫자면서 위치가 같으면 스트라이크로 판단
	// com {1, 2, 3} user {1, 3, 5} ==> 1스트라이크 1볼
	// com {1, 2, 3} user {4, 5, 6} ==> 0스트라이크 0볼
	// com {1, 2, 3} user {2, 3, 1} ==> 0스트라이크 3볼
	// com {1, 2, 3} user {1, 2, 3} ==> 3스트라이크 아웃 게임종료

	// 클래스에 필요한 필드
	int strike = 0;
	int ball = 0;

	int[] com = new int[3];
	int[] user = new int[3];

	Scanner sc = new Scanner(System.in);

	public void start() {
		// com 배열에 3개의 숫자 저장
		for(int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random() * 10);
			
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
		}
		
		// 3스트라이크 아웃이 될때까지 사용자의 입력값 받기
		while(true) {
			//게임이 한 판 종료될 때마다 스트라이크, 볼 초기화
			strike = 0;
			ball = 0;
			
			// com 배열의 내용 확인
			for(int i : com) {
				System.out.print(i);
			}
			System.out.println();
			
			//사용자 입력 값 user 배열에 저장
			for(int i = 0; i < user.length; i++) {
				System.out.print("0~9 중 하나를 입력하세요.");
				user[i] = sc.nextInt();
				
				if(user[i] < 0 || user[i] > 9) {
					System.out.println("잘못 입력하셨습니다.");
					i--;
					continue;
				}
				
				if(i > 0) {
					for(int j = 0; j < i; j++) {
						if(user[i] == user[j]) {
							System.out.println("중복된 값이 있습니다. 다시 입력하세요.");
							i--;
							break;
						}
					}
				}
			}
			
			// 사용자 입력 값 확인
			for(int i : user) {
				System.out.print(i);
			}
			System.out.println();
			
			// 컴퓨터의 배열과 사용자 배열 비교
			for(int i = 0; i < user.length; i++) {
				for(int j = 0; j < com.length; j++) {
					if(user[i] == com[j]) {
						if(i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			
			if(strike == 3) {
				System.out.println("3스트라이크 아웃. 게임을 종료합니다.");
				break;
			} else {
				System.out.println(strike + "스트라이크, " + ball + "볼");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
