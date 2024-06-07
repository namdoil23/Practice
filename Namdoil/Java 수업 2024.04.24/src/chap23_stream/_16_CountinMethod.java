package chap23_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _16_CountinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i);
		}
		
		// 1. count(): Stream 요소의 개수를 long 타입으로 반환
		long count = intList.stream()
							.count();
		
		System.out.println("요소의 개수:" + count);
		
		// 2. findFirst(): Stream의 첫 번째 요소를 Opional객체 담아서 리턴
		Integer first = intList.stream()
								.filter(num -> num >5)
								.findFirst().orElseThrow();
		
		System.out.println("첫 번째 요소는:" + first);
		
		// 3. max(Comparator.comparing(람다식)): 람다식에서 지정된 값의 최대값을 구하는 메소드
		//    min(Comparator.comparing(람다식)): 람다식에서 지정된 값의 최소값을 구하는 메소드
		// Stream<제네릭> 타입일 때만 매개변수를 넣어준다.
		// 기본타입 스트림인 IntStream, LongStream, DoubleStream에서는 매개변수가 필요없다.
		Integer max = intList.stream()
							 .max(Comparator.comparing(num -> num))
							 .orElseThrow();
		System.out.println("요소의 최대 값:" + max);
		
		Integer min = intList.stream()
				 .min(Comparator.comparing(num -> num))
				 .orElseThrow();
		System.out.println("요소의 최소 값:" + min);
		
		//IntStream, LongStream, DoubleStream에서는 비교 기준이 필요없기 때문에
		// 매개변수가 필요 없다.
		int max1 = intList.stream()
						  .mapToInt(num -> num)
						  .max()
						  .getAsInt();
		
		int min1 = intList.stream()
				  		  .mapToInt(num -> num)
				  		  .min()
				  		  .getAsInt();
						  
		
	}

}
