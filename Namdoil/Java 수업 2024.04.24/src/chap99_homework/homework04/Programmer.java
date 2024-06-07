package chap99_homework.homework04;

public class Programmer extends Worker{
	public void goToWork() {
		System.out.println("회사로 출근한다.");
	}

	public void goBackHome() {
		System.out.println("지하철을 타고 퇴근한다.");
	}

	public void work() {
		System.out.println("프로그램을 개발한다.");
	}
}
