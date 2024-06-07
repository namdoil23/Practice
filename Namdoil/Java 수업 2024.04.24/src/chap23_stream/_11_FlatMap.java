package chap23_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _11_FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArr = {{1, 2}, {3, 4}, {5, 6}};
		
		
		Stream<int[]> intArrStream = Arrays.stream(intArr);
		
		intArrStream.forEach(arr -> {
			for(int num : arr) {
				System.out.print(num + ", ");
			}
			System.out.println();
		});
		
		// 1. flatMap
		// 스트림 요소에 담겨있는 여러개의 스트림을 하나의 스트림으로 합쳐준다.
		intArrStream = Arrays.stream(intArr);
		
		IntStream flatIntStream = intArrStream.flatMapToInt(Arrays::stream);
		
		flatIntStream.forEach(num -> System.out.println(num));
		
		
		
		
		
		
		
		
		
		
	}

}
