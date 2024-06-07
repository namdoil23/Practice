package chap99_homework.homework02;


import java.util.Random;

import java.util.Scanner;



public class RockScissPaper {

	private Scanner sc = new Scanner(System.in);

	//컴퓨터가 랜덤한 값을 가지고 있어야 한다.
	private Random rd = new Random();
	private boolean isExit = false;
	
	private int winCnt = 0;
	private int drawCnt = 0;
	private int loseCnt = 0;

	public void start() {
		while(true) {
			//가위(0) 바위(1) 보(2)
			int comRd1 = rd.nextInt(3);//0, 1, 2중 하나를 랜덤하게 선택
			System.out.println("가위(0), 바위(1), 보(2) 중 하나를 입력하세요.(3 입력 시 종료)");

			int inputNum = sc.nextInt();

			if(inputNum == 3) {
				isExit = true;
			} else if(inputNum != 0 && inputNum != 1 && inputNum != 2) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}

			if(isExit == true) {
				System.out.println("게임을 종료합니다.");
				System.out.println("총 " + (winCnt + drawCnt + loseCnt) + "전 " + 
						winCnt + "승 " + drawCnt + "무 " + loseCnt + "패");
				break;
			}

			printCom(comRd1);

			judgeWDL(inputNum, comRd1);
		}

	}
	
	//승무패 판단해주는 메소드
	public void judgeWDL(int user, int com) {
		if(user == com) {
			drawCnt++;
			System.out.println("비겼습니다.");
		} else if((user == 0 && com == 2) || 
				(user == 1 && com == 0) ||
				(user == 2 && com == 1)) {
			winCnt++;
			System.out.println("이겼습니다.");
		} else {
			loseCnt++;
			System.out.println("졌습니다.");
		}
	}

	//컴퓨터 가위, 바위, 보 출력해주는 메소드
	public void printCom(int com) {
		switch(com) {
		case 0:
			System.out.println("컴퓨터: 가위");
			break;
		case 1:
			System.out.println("컴퓨터: 바위");
			break;
		case 2:
			System.out.println("컴퓨터: 보");
			break;
		}
	}
}

