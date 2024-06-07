package chap21_multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import chap21_multithread.threads.SumThread01;
import chap21_multithread.threads.SumThread02;

public class _13_ThreadPool01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ThreadPool 생성
		// 스레드 최대 개수가 5개인 스레드 풀 생성
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
	
		// 2. SumThread01, SumThread02을 스레드 풀 대기큐에 등록
		threadPool.execute(new SumThread01());
		threadPool.execute(new SumThread02());
//		threadPool.execute(new SumThread01());
		
		// 3. shutDownNow(): InterruptedException을 발생시켜서
		// 스레드 풀의 모든 스레드를 종료시킨다.
//		threadPool.shutdownNow();
		
		// 4. shutDown(): 메인 스레드가 종료되도 대기큐에 있는 모든 스레드들의 
		// 작업을 모두 마친뒤에 스레드풀을 종료하는 메소드
		threadPool.shutdown();
	
	}

}
