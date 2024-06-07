package chap99_homework.homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다. 
//		intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
//
//

		
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			intList.add((int)(Math.random() * 10) + 1);
//								0 <= random < 1
		}
		System.out.println(intList);
		System.out.println("------------------------");
		intList.stream()
				.map(intArr ->intArr*3)
				.forEach(intArr -> System.out.println(intArr));
		
		
		
		
	} 


}
