package chap21_multithread;

public class _01_Thread {
	
	// 1. 메인스레드: 메인메소드 영역
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 서브 스레드 선언
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// 3. 서브스레드가 실행할 코드 작성
				for(int i = 1; i <= 5; i++) {
					System.out.println(i);
					
					try {
						Thread.sleep(500);
					} catch(InterruptedException ie) {
						System.out.println(ie.getMessage());
					}
				}
			}
		});
		
		// 4. 서브스레드 대기 큐에 등록
		// 대기큐에 등록된 스레드는 실행순서가 되면 run 메소드를 자동으로 실행한다.
		thread.start();
		
		// 5. 메인스레드의 작업
		for(int i = 6; i <= 10; i++) {
			System.out.println(i);
			
			try {
				// Thread.sleep(밀리세컨드): 매개변수로 주어진 밀리세컨드만큼 작업을 일시정지
				// 스레드가 일시정지되면 대기큐에 있는 다음 스레드가 실행된다.
				Thread.sleep(500);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
