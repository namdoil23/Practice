package chap23_stream;

import java.util.ArrayList;
import java.util.List;

public class _15_MathMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i);
		}
		
		// 1. allMatch(람다식): 람다식의 조건식에 모든 요소가 true여야 true 리턴
		//						하나라도 false면 false 리턴
		boolean result = intList.stream()
								.allMatch(num -> num % 3 == 0);
		
		System.out.println("모든 요소가 3의 배수인지 검사:" + result);
		
		
		// 2. anyMatch(람다식): 람다식의 조건식에 하나의 요소라도 부합하면 true 리턴
		//						모든 요소가 부합하지 않을 때만 false 리턴
		result = intList.stream()
						.anyMatch(num -> num % 2 == 0);
		
		System.out.println("요소 중에 짝수가 하나라도 존재하는지 검사:" + result);
		
		// 3. noneMatch(람다식): 람다식의 조건식에 모든 요소가 부합하지 않아야 true 리턴
		//						하나라도 부합하는 요소가 존재하면 false 리턴	
		result = intList.stream()
						.noneMatch(num -> num > 10);
		
		System.out.println("모든 요소가 10보다 작은지 여부 검사:" + result);
		
	}

}
