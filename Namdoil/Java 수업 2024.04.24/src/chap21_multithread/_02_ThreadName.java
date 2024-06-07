package chap21_multithread;

public class _02_ThreadName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 현재 동작중인 스레드 객체 얻어오기
		Thread currentThread = Thread.currentThread();
		
		// 2. getName(): 스레드의 이름을 String 타입으로 리턴해주는 메소드
		System.out.println(currentThread.getName() + " 동작 중");
		
		for(int i = 0; i < 3; i++) {
			Thread subThread1 = new Thread() {
				@Override
				public void run() {
					System.out.println(this.getName() + " 동작 중");
				}
			};
			
			subThread1.start();
		}
		
		Thread subThread2 = new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName() + " 동작 중");
			}
		};
		
		// 3. setName(스레드명): 매개변수로 주어진 스레드명으로 스레드의 이름을 변경하는 메소드
		subThread2.setName("No3-Thread");
		subThread2.start();
		
		
		
		
		
		
		
		
		
		
		
	}

}
