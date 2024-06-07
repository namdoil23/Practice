package chap23_stream;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Long> longList = new ArrayList<>();
		
		for(long i = 0; i < 100000000L; i++) {
			longList.add(i);
		}
		
		long startTime = System.currentTimeMillis();
		
		longList.stream().forEach(num -> System.out.println(num));
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
		
//		long startTime = System.currentTimeMillis();
//		
//		for(Long num : longList) {
//			System.out.println(num);
//		}
//		
//		long endTime = System.currentTimeMillis();
//		
//		System.out.println(endTime - startTime);
	}
	
}
