package chap21_multithread.threads;

public class PrintNumWithSync {
	private int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	// 1. 동기화메소드: 공유되고 있는 객체의 멤버변수를 잠금처리하여 다른 스레드에서 사용하지 못하게 한다.
	// 두 번째 스레드는 동기화 블록을 통해서 잠금처리된 변수의 사용이 끝날 때까지 실행을 멈춘다.
	// 하나의 스레드가 동기화 메소드를 호출하면 다른 스레드에서는 호출할 수 없다.
	public synchronized void printNum1(int num) {
		this.setNum(num);
		
		for(int i = 1; i <= this.num; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
	
	public void printNum2(int num) {
		// 2. 동기화 블록: 공유되고 있는 객체의 멤버변수를 선점한 스레드의 작업이 끝날 때까지 실행을 멈춘다.
		synchronized(this) {
			this.setNum(num);
		}
		for(int i = 1; i <= this.num * 2; i++) {
			System.out.println(i);
		}
	}
}
