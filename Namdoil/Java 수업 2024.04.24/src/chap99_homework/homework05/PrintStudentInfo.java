package chap99_homework.homework05;

public class PrintStudentInfo {
	// 학번으로 검색해서 학생정보 출력하는 메소드
	public void searchStudent(int sno, Student[] stArr) {
		for(int i = 0; i < stArr.length; i++) {
			if(stArr[i].getSno() == sno) {
				stArr[i].printInfo();
				break;
			}
		}
	}
	
	// 모든 학생 정보 출력하는 메소드
	public void printAllStudentInfo(int index, Student[] stArr) {
		for(int i = 0; i < index; i++) {
			if(stArr[i] != null)
				stArr[i].printInfo();
		}
	}
}
