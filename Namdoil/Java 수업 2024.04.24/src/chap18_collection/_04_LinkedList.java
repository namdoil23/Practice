package chap18_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _04_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ArrayList, LinkedList의 속도 비교
		// 1-1. 순차적으로 데이터를 넣는 속도 비교
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 1000000; i++) {
			arrayList.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 순차적으로 데이터를 넣는데 걸린 시간: " +
			(endTime - startTime) + "나노초입니다.");
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 1000000; i++) {
			linkedList.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 순차적으로 데이터를 넣는데 걸린 시간: " +
			(endTime - startTime) + "나노초입니다.");
		System.out.println("-------------------------------------------");
		
		// 1-2. 리스트 중간에 데이터를 넣는 속도 비교
		startTime = System.nanoTime();
		
		for(int i = 1000; i < 10000; i++) {
			arrayList.add(i, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 중간에 데이터를 추가하는 데 걸린 시간: " +
			(endTime - startTime) + "나노초입니다.");
		
		startTime = System.nanoTime();
		
		for(int i = 1000; i < 10000; i++) {
			linkedList.add(i, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 중간에 데이터를 추가하는 데 걸린 시간: " +
			(endTime - startTime) + "나노초입니다.");
		System.out.println("-------------------------------------------");
		
		// 1-3. 인덱스를 통해 데이터에 접근하는 속도 비교
		startTime = System.nanoTime();
		
		System.out.println(arrayList.get(80000));
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 80000번 인덱스의 데이터에 접근하는 데 걸린 시간: " +
			(endTime - startTime) + "나노초입니다.");
		
		startTime = System.nanoTime();
		
		System.out.println(linkedList.get(80000));
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 80000번 인덱스의 데이터에 접근하는 데 걸린 시간: " +
			(endTime - startTime) + "나노초입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
