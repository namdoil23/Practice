package chap18_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 
//		List<String> list = new ArrayList<>();
//		
//		list = createStrList();
//		
//		System.out.println(list);
		// 2. 사용자가 입력한 문자열을 StringBuilder 객체에 저장하고 
		// 길이를 10씩 잘라서 List<StringBuilder>에 저장하고 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		
		StringBuilder sb = new StringBuilder(sc.nextLine());
								
		List<StringBuilder> sbList = new ArrayList<>();
		
		for(int i = 0; i < sb.length(); i += 10) {
			if(i + 10 < sb.length()) {
				sbList.add(
					new StringBuilder(
						sb.substring(i, i + 10)
					)	
				);
			} else {
				sbList.add(
					new StringBuilder(
						sb.substring(i, sb.length())
					)
				);
			}
		}
		
		for(StringBuilder sb2 : sbList) {
			System.out.println(sb2);
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	// 1. 사용자가 입력한 5개의 문자열을 List<String>에 저장해서 리턴하는 메소드를 구현하세요.
	public static List<String> createStrList() {
		Scanner sc = new Scanner(System.in);
		
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("문자열을 입력하세요.");
			strList.add(sc.nextLine());
		}
		
		sc.close();
		
		return strList;
	}
}
