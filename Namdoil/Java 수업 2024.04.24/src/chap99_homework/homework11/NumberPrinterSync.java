package chap99_homework.homework11;

public class NumberPrinterSync {
	private int num;

	public synchronized void numPrint1(int a) {
		this.num = a;
		
		for(int i = this.num; i <= 50; i++) {
			if(i % 3 == 0) {
				System.out.println("print1 : " + i);
				
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void numPrint2(int a) {
		synchronized(this) {
			this.num = a;
		}
		for(int i = this.num; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println("print2 : " + i);
				
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
