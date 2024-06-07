package chap99_homework.homework14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다. 
//		intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(
					(int)(Math.random() * 10) + 1);
		}
		System.out.println(intList);
		
//		Stream<Integer> intStream = 
//					intList.stream();
//		
//		Stream<Integer> newStream = 
//					intStream.map(num -> num * 3);
//		
//		newStream.forEach(num -> 
//					System.out.print(num + ", "));
		//체이닝기법
		intList.stream()
			   .map(num -> num * 3)
			   .forEach(num ->
			   				System.out.print(num + ", "));
							
		System.out.println();
		System.out.println("----------------------------");

//		2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 
//		길이가 5이상인 문자열만 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		List<String> strList = new ArrayList<String>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("문자열을 입력하세요.");
			strList.add(sc.nextLine());
		}
		
		strList.stream()
			   .filter(str -> str.length() >= 5)
			   .forEach(str -> System.out.println(str));
		System.out.println("----------------------------");

//		3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서 
//		문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
		List<String> strList2 = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("문자열를 입력하세요.");
			String input = sc.nextLine();
			strList2.add(input);
		}
		
//		Stream<Character> chStream =
//				   		charList.stream();
//		
//		Stream<Character> convStream =
//					chStream.map(ch -> {
//						if(ch >= 'A' && ch <= 'Z') {
//							ch = (char)(ch + 32);
//						} else if(ch >= 'a' && ch <= 'z') {
//							ch = (char)(ch - 32);
//						}
//						
//						return ch;
//					});
//		
//		convStream.forEach(ch ->
//				System.out.print(ch + ", "));
		
		//체이닝기법
		strList2.stream()
				.filter(str -> {
					for(int i = 0; i < str.length(); i++) {
						if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ||
						str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
							return true;
						}
					}
					return false;
				})
				.forEach(str -> 
					System.out.print(str + ", "));
		

		sc.close();
	}
}
