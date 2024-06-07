package chap21_multithread.threads;

public class SumThread02 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		
		for(int i = 30; i <= 50; i++) {
			sum += i;
			
			System.out.println("스레드 2번의 현재 sum: " + sum + ", 현재 i : " + i);
			
			try {
				Thread.sleep(300);
			}catch(InterruptedException ie) {
				System.out.println("스레드 2번 shutDownNow() 호출됨");
				break;
			}
		}
	}
	
}
