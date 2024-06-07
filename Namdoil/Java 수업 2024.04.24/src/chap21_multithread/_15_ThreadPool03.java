package chap21_multithread;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import chap21_multithread.threads.PrintThread;

public class _15_ThreadPool03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		PrintThread pt01 = new PrintThread();
		PrintThread pt02 = new PrintThread();

		pt02.setThreadName("스레드 2번");
		
		for(int i = 0; i < 10; i++) {
			pt01.setThreadName("스레드 1번 - " + i);
			
			// execute() 메소드
			// 스레드 풀의 최대 스레드 개수가 5개로 지정돼 있어서
			// 0~4번까지 처음에 스레드가 지정되고
			// 0번 스레드의 작업이 끝나면 5번스레드이 스레드 할당이 일어난다.
//			System.out.println(i);
			threadPool.execute(pt01);
		}
		
		List<Runnable> runnableList = threadPool.shutdownNow();
		
		for(Runnable runnable : runnableList) {
			System.out.println(runnable);
		}
	}

}
