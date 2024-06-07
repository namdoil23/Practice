package chap21_multithread.threads;

import java.util.Scanner;

public class SafeExitThread extends Thread{
	private Scanner sc = new Scanner(System.in);
	private boolean isStop = false;
	
	public boolean isStop() {
		return this.isStop;
	}
	
	public void setStop(boolean isStop) {
		this.isStop = isStop;
	}
	
	@Override
	public void run() {
		// isStop 값을 변경하므로써 run() 메소드의 내용이 모두 처리된 것처럼 동작하는 방식
		while(!isStop) {
			String str = sc.nextLine();
			
			System.out.println("입력한 문자열: " + str);
			System.out.println("스레드 동작");
		}
		
		// run메소드의 내용이 모두 끝났을 때 점유하고 있는 리소스 해제
		sc.close();
		System.out.println("스레드 종료");
	}
	
	
	
	
	
	
	
	
	
	
}
