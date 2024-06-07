package chap21_multithread.threads;

public class SumThread01 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			
			System.out.println("스레드 1번의 현재 sum: " + sum + ", 현재 i : " + i);
			
			try {
				Thread.sleep(300);
			}catch(InterruptedException ie) {
				System.out.println("스레드 1번 shutDownNow() 호출됨");
				break;
			}
		}
	}
	
}
