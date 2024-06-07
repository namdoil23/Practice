package chap21_multithread.threads;

public class DaemonThread extends Thread {
	public void save() {
		System.out.println("저장되었습니다.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
			
			save();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
