package chap99_homework.homework08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 
//		5개의 정수를 저장하고 출력하세요.
		ArrayList <Integer> saveList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("5개의 정수를 입력하세요.");
	
		
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			saveList.add(num);
		}
			System.out.println("저장된 정수는" + saveList);
		
		sc.close();
	}		

}

