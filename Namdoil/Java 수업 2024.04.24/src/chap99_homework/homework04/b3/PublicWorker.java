package chap99_homework.homework04.b3;

public class PublicWorker extends Labor 
{

	@Override
	public void workStart() { 
		System.out.println("9시 정각까지 출근합니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void workFinish() {
		System.out.println("6시 정각에 퇴근합니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void work() {
		System.out.println("8시간 일을 합니다.");
		// TODO Auto-generated method stub
		
	}

}
