package chap99_homework.homework04;

public class Developer extends Worker {

	@Override
	public void goToWork() {
		// TODO Auto-generated method stub
		System.out.println("개발자는 출근한다.");
	}

	@Override
	public void leaveWork() {
		// TODO Auto-generated method stub
		System.out.println("개발자는 퇴근한다.");
	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("개발자는 일한다.");
	}

}
