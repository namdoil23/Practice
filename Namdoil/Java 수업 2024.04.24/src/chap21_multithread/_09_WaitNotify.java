package chap21_multithread;

import chap21_multithread.threads.PrintNumWaitNotify;
import chap21_multithread.threads.WaitNotifyThread01;
import chap21_multithread.threads.WaitNotifyThread02;

public class _09_WaitNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumWaitNotify pnwn = new PrintNumWaitNotify();
		
		WaitNotifyThread01 wt01 = new WaitNotifyThread01();
		WaitNotifyThread02 wt02 = new WaitNotifyThread02();
		
		wt01.setPnwn(pnwn);
		wt02.setPnwn(pnwn);
		
		wt01.start();
		wt02.start();
	}

}
