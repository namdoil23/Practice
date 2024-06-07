package chap18_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_ArrayListExx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 
		List<String> list = saveStringList();
		
		System.out.println(list);		
		
			
		// 2. 사용자가 입력하 문자열을 StringBuilder 객체에 저장하고 
		// 길이를 10씩 잘라서 List<StringBuilder>에 저장하고 출력하세요.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	// 1. 사용자가 입력한 5개의 문자열을 List<String>에 저장해서 리턴하는 메소드를 구현하세요
	public static List<String> saveStringList(){
		Scanner sc = new Scanner(System.in);
		
		List<String> saveStr = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("문자열을 입력하세요.");
			saveStr.add(sc.nextLine());
		}
		
		sc.close();	

		return saveStr;
	}
	
}
