package chap21_multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _06_ReasonOfThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 1억건의 데이터를 조회하는 메소드를 동시에 10만명의 사용자가 호출하면
		// 데이터베이스에 데드락이 걸린다.
		// 여러명의 사용자가 동시에 메소드를 사용하거나 많은 데이터를 조회하는 경우
		// 사용자별로 스레드를 생성해서 분산처리(병렬처리)해줘서
		// 데이터베이스에 무리가 가지 않게 해준다.
		Thread t1 = new Thread() {
			@Override
			public void run() {
				getDataList();
				
				try {
					Thread.sleep(1000);
				} catch(InterruptedException ie) {
					System.out.println(ie.getMessage());
				}
			}
		};
		
		t1.start();
	}
	
	// 1. 1억건의 데이터를 조회하는 메소드
	public static List<Map<String, String>> getDataList() {
		return new ArrayList<Map<String, String>>();
	}
}
