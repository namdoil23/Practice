package chap21_multithread.threads;

import java.util.Scanner;

public class InterruptedThread extends Thread {
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void run() {
		while(true) {
			System.out.println("문자열을 입력하세요.");
			String str = sc.nextLine();
			System.out.println("입력한 문자열: " + str);
			System.out.println("스레드 동작");
			
			// 1. Thread.interrupted() 메소드를 통해서
			// InterruptedException이 발생했는지 검사
			if(Thread.interrupted()) {
				// 리소스 정리
				sc.close();
				System.out.println("스레드 종료");
				break;
			}
		}
		
	}
}
