package chap11_abstract.academy;

// 추상클래스를 상속받은 자식클래스에서는 항상 추상메소드를 상속받아(오버라이드)
// 구현해야 한다. 구현하지 않으면 에러 발생
public class ComAcademy extends Academy {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("프로그래밍을 가르친다.");
	}

	@Override
	public void solveHomework() {
		// TODO Auto-generated method stub
		System.out.println("프로그래밍 숙제를 풀어준다.");
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("프로그래밍 수업이 끝나고 쉰다.");
	}

	@Override
	public void attend() {
		// TODO Auto-generated method stub
		System.out.println("프로그래밍 수업에 참여한다.");
	}

}
