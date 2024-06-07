package chap21_multithread.threads;

public class WaitNotifyThread02 extends Thread{
private PrintNumWaitNotify pnwn;
	
	public PrintNumWaitNotify getPnwn() {
		return this.pnwn;
	}
	
	public void setPnwn(PrintNumWaitNotify pnwn) {
		this.pnwn = pnwn;
	}
	
	@Override
	public void run() {
		this.pnwn.printNum2(10);
	}
}
