package chap99_homework.homework05;

import java.util.Scanner;

public class InputStudentInfo {
	// 학생 기본정보 입력할 것인지, 과목이랑 기말고사 점수를 입력할 것인지 선택하는 메소드
	public int selectInputMode(int index, Scanner sc, Student[] stArr) {
		int inputMode = 0;
	
		while(true) {
			System.out.println("----학생정보 입력----");
			System.out.println("1. 기본정보 입력");
			System.out.println("2. 과목정보 입력");
			
			inputMode = sc.nextInt();
			
			if(inputMode == 1) {
				inputDefaltStudentInfo(index, sc, stArr);
				break;
			} else if(inputMode == 2) {
				InputSubjectScore inputSubjectScore = new InputSubjectScore();
				inputSubjectScore.inputSubjectScoreInfo(index, sc, stArr);
				
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
		return inputMode;
	}
	
	// 학생 기본정보 입력 메소드
	public void inputDefaltStudentInfo(int index, Scanner sc, Student[] stArr) {
		System.out.println("----기본정보 입력----");
		
		System.out.print("학번: ");
		int sno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이름: ");
		StringBuffer name = new StringBuffer(sc.nextLine());
		
		while(true) {
			System.out.print("학과: ");
			String major = sc.nextLine();
			
			if(major.equals("수학")) {
				stArr[index] = new MathStudent(sno, name);
				break;
			} else if(major.equals("영어")) {
				stArr[index] = new EngStudent(sno, name);
				break;
			} else if(major.equals("컴공")) {
				stArr[index] = new ComStudent(sno, name);
				break;
			} else {
				System.out.println("존재하지 않는 학과입니다. 다시 입력하세요.");
				continue;
			}
		}
	}
}
