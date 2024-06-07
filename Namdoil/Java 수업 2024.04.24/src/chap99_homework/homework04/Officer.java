package chap99_homework.homework04;

public class Officer extends Worker{
	public void goToWork() {
		System.out.println("시청으로 출근한다.");
	}

	public void goBackHome() {
		System.out.println("차를 타고 퇴근한다.");
	}

	public void work() {
		System.out.println("민원 처리한다.");
	}
}
