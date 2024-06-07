package chap21_multithread;

import chap21_multithread.threads.InterruptedThread;

public class _11_SafeExitInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptedThread it = new InterruptedThread();
		
		it.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		// InterruptedThread 스레드에 InterruptedException 발생시켜 
		// 스레드 안전종료
		it.interrupt();
	}

}
