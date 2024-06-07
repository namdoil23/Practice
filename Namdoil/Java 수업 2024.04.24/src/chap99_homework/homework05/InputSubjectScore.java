package chap99_homework.homework05;

import java.util.Scanner;

public class InputSubjectScore {
	// 과목과 기말고사를 입력하는 메소드
	public void inputSubjectScoreInfo(int index, Scanner sc, Student[] stArr) {
		System.out.println("과목과 기말고사 점수를 입력할 학생의 학번을 입력하세요.");
		int sno = sc.nextInt();
		
		int stCnt = 0;
		
		for(int i = 0; i < index; i++) {
			if(stArr[i].getSno() == sno) {
				System.out.println(stArr[i].getName() + " 학생이 수강한 과목의 개수를 입력하세요.");
				int cnt = sc.nextInt();
				sc.nextLine();
				
				// 입력받은 과목 개수로 배열들 초기화
				stArr[i].initSubScore(cnt);
				
				for(int j = 0; j < cnt; j++) {
					System.out.println("과목을 입력하세요.");
					String subject = sc.nextLine();
					System.out.println("기말고사 점수를 입력하세요.");
					int score = sc.nextInt();
					sc.nextLine();
					stArr[i].saveInfo(j, subject, score);
				}
				
				stCnt++;
				
				break;
			}
		}
		
		if(stCnt == 0) {
			System.out.println("기본정보가 입력되지 않은 학생입니다.");
		}
	}
}
