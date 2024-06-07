package chap21_multithread;

public class _05_YieldMethod {
	static int flag = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 6; i <= 10; i++) {
					System.out.println(i);
				}
				
				flag = 1;
			}
		};
		
		t1.start();
		
		for(int i = 1; i <= 5; i++) {
			if(flag > 0) {
				System.out.println(i);
			} else {
				i--;
				System.out.println("yield 메소드 호출");
				// 1. yield(): 다음 스레드에게 작업순서를 양보
				Thread.yield();
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
