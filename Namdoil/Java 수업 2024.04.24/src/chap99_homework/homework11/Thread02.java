package chap99_homework.homework11;

public class Thread02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 20; i++) {
					if(30 % i == 0) {
						System.out.println("sub : " + i);
					}
				}
			}
		};
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				System.out.println("main : " + i);
			}
		}
	}

}
