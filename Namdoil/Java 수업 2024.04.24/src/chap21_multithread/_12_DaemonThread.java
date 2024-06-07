package chap21_multithread;

import chap21_multithread.threads.DaemonThread;

public class _12_DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread dt = new DaemonThread();
		
		
		// 1. setDaemon(boolean) 메소드를 통해
		// 해당 스레드를 보조 스레드로 지정
		dt.setDaemon(true);
		
		dt.start();
		
		try {
			Thread.sleep(30000);
		} catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		// 주 스레드인 메인 스레드가 종료되면 보조 스레드인 dt도 종료된다.
		System.out.println("메인 스레드 종료");
	}

}
