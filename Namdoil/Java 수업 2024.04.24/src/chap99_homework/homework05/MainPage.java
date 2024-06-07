package chap99_homework.homework05;

import java.util.Scanner;

public class MainPage {
	public int index = 0;
	
	// 메인 메뉴 출력하는 메소드
	public void printMenu(Scanner sc, Student[] stArr) {
		System.out.println("----학적관리----");
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 검색");
		System.out.println("3. 전체 학생 정보 출력");
		System.out.println("4. 학과별 성적 순위");
		System.out.println("5. 종료");
		
		selectMenu(sc, stArr);
	}
	
	// 메뉴 선택 메소드
	public void selectMenu(Scanner sc, Student[] stArr) {
		InputStudentInfo inputStudentInfo = new InputStudentInfo();
		PrintStudentInfo printStudentInfo = new PrintStudentInfo();
		
		while(true) {
			System.out.print("메뉴를 선택하세요.: ");
			int menuSelect = sc.nextInt();
			
			if(menuSelect == 1) {
				int inputMode = inputStudentInfo.selectInputMode(index, sc, stArr);
				
				if(inputMode == 1)
					index++;
				break;
			} else if(menuSelect == 2) {
				System.out.print("검색할 학생의 학번: ");
				int sno = sc.nextInt();
				printStudentInfo.searchStudent(sno, stArr);
				break;
			} else if(menuSelect == 3) {
				printStudentInfo.printAllStudentInfo(index, stArr);
				break;
			} else if(menuSelect == 4) {
				
			} else if(menuSelect == 5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}
		}
	}
}
