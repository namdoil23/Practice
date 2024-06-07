package chap23_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _06_ArraysToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.random()*10) + 1;
		}
		
		// 1. 배열로 Stream 생성하기
		// Arrays.steam()를 사용하거나
		// Stream.of() 메소드 사용
		// 기본타입 배열들은 Stream<제네릭>형태로 만들 수 없기 때문에
		// 기본타입에 매핑되어 있는 IntStream, DoubleStream, LongStream,...
		// 을 이용한다. of() 메소드도 IntStream, DoubleStream, LongStream의 of() 메소드 사용
		
		IntStream intStream1 = Arrays.stream(intArr);
		IntStream intStream2 = IntStream.of(intArr);
		
		String[] strArr = new String[10];
		
		for(int i = 0; i < 10; i++) {
			strArr[i] = String.valueOf(i);
		}
		
		// Strting은 클래스이자 참조타입이기 때문에 Stream<String>형태로 변환한다
		Stream<String> strStream1 = Arrays.stream(strArr);
		Stream<String> strStream2 = Stream.of(strArr);

		
		
		// IntStream도 Stream이기 때문에 
		// Stream에서 지원하는 모든 메소드를 사용할 수 있다.(forEach, map, filter, reduce)
		// intStream1에서 5이상되는 값만 추출하고
		// 추출된 값들에서 4를 곱한 요소로 구성된 새로운 Stream을 만들고
		// 요소들을 하나씩 출력하세요.
		
		// 배열을 스트림으로 변환해도 파이프라인 구성가능하다.
		
		intStream1.filter(num -> num>= 5)
					.map(num -> num*4)
					.forEach(num -> System.out.println(num));
		
		
	
		
	}

}
