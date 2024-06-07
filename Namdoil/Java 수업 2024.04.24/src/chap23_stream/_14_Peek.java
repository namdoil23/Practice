package chap23_stream;

import java.util.ArrayList;
import java.util.List;

public class _14_Peek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i);
		}
		
		
		// 1. peak 메소드: forEach와 동일한 동작을 하지만 원본 스트림이 그대로 리턴되기 때문에
		// 중간단계 메소드이다. 주로 중간에 stream의 요소들의 값을 확인하고 싶을 때 사용
		
		// 2. 최종단계 메소드가 없으면 동작하지 않는다.
		intList.stream()
			    .filter(num -> num % 3 == 0)
			    .peek(num -> System.out.println(num));
		// 3. 최종단계 메소드가 있을 때
		intList.stream()
	    		.filter(num -> num % 3 == 0)
	    		.peek(num -> System.out.println(num))
	    		.mapToInt(num -> num)
	    		.sum();
		
		
	}

}
