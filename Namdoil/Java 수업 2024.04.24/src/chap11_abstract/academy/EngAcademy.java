package chap11_abstract.academy;

public class EngAcademy extends Academy {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("영어를 가르친다.");
	}

	@Override
	public void solveHomework() {
		// TODO Auto-generated method stub
		System.out.println("영문법 숙제를 풀어준다.");
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("영어 수업이 끝나고 쉰다.");
	}

	@Override
	public void attend() {
		// TODO Auto-generated method stub
		System.out.println("영어 수업에 참여한다.");
	}

}
