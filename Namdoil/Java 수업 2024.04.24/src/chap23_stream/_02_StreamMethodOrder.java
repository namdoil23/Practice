package chap23_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _02_StreamMethodOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<>();
		
		strList.add("java");
		strList.add("html");
		strList.add("oracle");
		strList.add("javascript");
		strList.add("css");
		
		// 1. 컬렉션 스트림 형태로 변환
		Stream<String> strStream = strList.stream();
		
		// 2. 스트림의 메소드는 중간처리 단계 메소드와
		// 최종처리 단계 메소드로 나눌 수 있다.
		// 중간처리 단계 메소드는 메소드의 리턴 타입이 Stream인 메소드이고
		// 최종처리 단계 메소드는 메소드의 리턴 타입이 Stream이 아닌 메소드이다.
		
		// 2-1. 중간처리
		// 중간 처리 메소드는 여러번 사용할 수 있다.
		Stream<String> javaStream = strStream.filter(str -> str.contains("java"));
		
		// 2-2. 최종처리
		// 최종처리 메소드는 마지막에 한 번만 사용할 수 있다.
		List<String> javaList = javaStream.toList();
		
		System.out.println(javaList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
