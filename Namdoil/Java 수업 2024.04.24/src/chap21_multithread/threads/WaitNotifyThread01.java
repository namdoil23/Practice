package chap21_multithread.threads;

public class WaitNotifyThread01 extends Thread{
	private PrintNumWaitNotify pnwn;
	
	public PrintNumWaitNotify getPnwn() {
		return this.pnwn;
	}
	
	public void setPnwn(PrintNumWaitNotify pnwn) {
		this.pnwn = pnwn;
	}
	
	@Override
	public void run() {
		this.pnwn.printNum1(10);
	}
}
