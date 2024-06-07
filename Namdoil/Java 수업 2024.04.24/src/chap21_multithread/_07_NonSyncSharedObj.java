package chap21_multithread;

import chap21_multithread.threads.NonSyncThread01;
import chap21_multithread.threads.NonSyncThread02;
import chap21_multithread.threads.PrintNumWithoutSync;

public class _07_NonSyncSharedObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumWithoutSync pnws = new PrintNumWithoutSync();
		
		NonSyncThread01 nst01 = new NonSyncThread01();
		NonSyncThread02 nst02 = new NonSyncThread02();
		
		// 1. 동일한 객체를 두 개의 스레드에서 공유
		nst01.setPnws(pnws);
		nst02.setPnws(pnws);
			
		
		// 2. 동기화되지 않은 공유객체의 변수는
		// 첫번째 스레드가 선점해도 두번째 스레드에서 값을 변경할 수 있어서
		// 개발자가 의도하지 않은 결과 값이 나타난다.
		// 의도한 결과: printNum1 => 1~10출력, printNum2 => 1~40 출력
		// 실제 결과: printNum1 => 1~20출력, printNum2 => 1~40 출력
		// 동기화되지 않은 공유객체는 변수값이 계속 변경될 수 있기 때문에
		// 동기화를 해서 다른 스레드에서 값을 변경하지 못하게 잠금처리해야 한다.
		
		nst01.start();
		nst02.start();
		

	}

}
