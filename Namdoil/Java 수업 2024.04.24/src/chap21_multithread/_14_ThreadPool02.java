package chap21_multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import chap21_multithread.threads.PrintThread;

public class _14_ThreadPool02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. shutdown() 메소드로 스레드 풀 바로 종료시키기
		// Thread에 boolean 값을 통해 shutdown() 메소드가 호출되도
		// 바로 스레드 풀을 종료시킬 수 있다.
		
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		PrintThread pt = new PrintThread();
		
		pt.setThreadName("thread-1");
		
		threadPool.execute(pt);
		
		// 2. 스레드 풀의 스레드는 데몬 스레드가 아니기 때문에
		// 주 스레드가 종료되도 남아있는 작업들이 계속해서 진행된다.
		// 이러한 문제를 방지하고자 주 스레드가 종료되기전에 
		// shutdown(), shutdownNow() 메소드를 호출해서 
		// 스레드풀을 안전하게 종료시켜야 한다.
		// shutdownNow()는 스레드 풀에 남아있는 스레드를 모두 종료시켜서 문제가 되지 않지만
		// shutdown()는 대기큐가 남아있어 스레드들이 계속 작업이 진행되기 때문에
		// 문제가 발생할 수 있다. 따라서 shutdown()메소드로도 스레드 풀의 모든
		// 작업 종료가 될 수 있도로 boolean 변수를 하나 선언해서
		// shutdown() 메소드가 호출됐음을 스레드에 알리고 스레드가 안전하게 종료될 수 있도록 한다.
		
		threadPool.shutdown();
		pt.setShutDown(true);
		
	}

}
