package chap21_multithread;

import chap21_multithread.threads.PrintNumWithSync;
import chap21_multithread.threads.SyncThread01;
import chap21_multithread.threads.SyncThread02;

public class _08_SyncSharedObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumWithSync pnws = new PrintNumWithSync();
		
		SyncThread01 st01 = new SyncThread01();
		SyncThread02 st02 = new SyncThread02();
		
		st01.setPnws(pnws);
		st02.setPnws(pnws);
		
		// st01 스레드가 공유객체인 pnws를 먼저 선점하게 되고
		// 동기화 메소드와 동기화 블록을 통해 선점한 st01 스레드의 작업이 모두 종료되기 전까지
		// num을 사용할 수 없는 상태로 잠금처리되고 st01 스레드의 작업이 모두 종료되면
		// st02가 num을 사용할 수 있는 상태가 된다.
		st01.start();
		st02.start();
	}

}
