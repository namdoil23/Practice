package chap21_multithread.threads;

public class PrintNum {
	public void printNum(int num) {
		// Thread t1, t2
		// t1 1~num까지 출력
		// t2 num+1~num*2까지 출력
		// t1, t2 순서대로 대기큐에 등록
		// join메소드로 t2가 먼저 실행되도록
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= num; i++) {
					System.out.println(i);
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = num + 1; i <= num * 2; i++) {
					System.out.println(i);
				}
			}
		};

		t1.start();
		t2.start();
		
		try {
			// main 스레드 일시정지
			t1.join();
			// t1 스레드 일시정지
			t2.join();
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
