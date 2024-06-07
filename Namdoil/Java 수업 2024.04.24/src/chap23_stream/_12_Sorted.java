package chap23_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _12_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i ++) {
			intList.add(i);
			
		}
		
		
		// 1. sorted(): 오름차순으로 정렬
		intList.stream()
			   .sorted()
			   .forEach(num -> System.out.println(num));
		System.out.println("-----------------------");
		
		// 2. sorted(Comparator.reverseOrder()): 내림차순 정령
		intList.stream()
			   .sorted(Comparator.reverseOrder())
			   .forEach(num -> System.out.println(num));
	}

}
