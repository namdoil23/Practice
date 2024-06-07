package chap23_stream;

import java.util.ArrayList;
import java.util.List;

public class _20_ParallelStreamSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> longList = new ArrayList<>();
		
		for(long i = 0; i < 100000000L; i++) {
			longList.add(i);
		}
		
		// 1. 일반 스트림 평균 구하는 속도
		double average = 0;
		long startTime = 0;
		long endTime = 0;
		
		startTime = System.nanoTime();
		
		average = longList.stream()
						  .mapToLong(num -> num)
						  .average()
						  .getAsDouble();
		
		endTime = System.nanoTime();
		
		System.out.println("일반 스트림 평균 구하는 데 걸린시간: " + (endTime - startTime));
		
		startTime = System.nanoTime();
		
		average = longList.parallelStream()
						  .mapToLong(num -> num)
						  .average()
						  .getAsDouble();
		
		endTime = System.nanoTime();
		
		System.out.println("병렬 스트림 평균 구하는 데 걸린시간: " + (endTime - startTime));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
