package chap23_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _01_BasicStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컬렉션 생성
		List<Integer> intList = new ArrayList<>();
		
		// 2. 배열
		int[] intArray = new int[10];
		
		for(int i = 0; i < 10; i++) {
			intList.add(i);
			intArray[i] = i;
		}
		
		// 3. 컬렉션을 스트림으로 변환
		Stream<Integer> integerStream = intList.stream();
		
		// 4. 배열을 스트림으로 변환
		// 기본타입의 배열들을 스트림으로 변환하여 사용할 수 있는 
		// 기본타입 스트림들이 존재한다.
		// IntStream, LongStream, DoubleStream.... 
		IntStream intStream = Arrays.stream(intArray);
		
		// 5. 스트림의 메소드들은 매개변수가 함수형 인터페이스여서
		// 메소드를 호출할 때 람다식으로 함수형 인터페이스의 구현체를 전달한다.
		// forEach는 리턴값이 없다.
		integerStream.forEach(num -> System.out.println(num));
		intStream.forEach(num -> System.out.println(num * 2));
		
		
		
	}

}
