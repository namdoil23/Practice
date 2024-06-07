package chap21_multithread;

public class _03_JoinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread subThread1 = new Thread() {
			@Override
			public void run() {
				for(int i = 6; i <= 10; i++) {
					System.out.println(i);
				}
			}
		};
		
		subThread1.start();
		
		try {
			// 1. join(): join()메소드가 호출된 시점에 동작하고 있는 
			// 스레드를 일시정지시키는 메소드.
			// 동작중인 메소드가 일시정지되고 대기큐에 등록된 다음 스레드가 
			// 진행된다. 다음 스레드의 실행이 모두 끝나면 일시정지됐던 스레드가 다시 실행된다.
			subThread1.join();
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
	}

}
