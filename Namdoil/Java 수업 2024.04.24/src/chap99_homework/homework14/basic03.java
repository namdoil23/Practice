package chap99_homework.homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서 
//		문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
		Scanner sc = new Scanner(System.in); 
		
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 문자열을 입력하세요. ");
			String input = sc.nextLine();
			strList.add(input);
		}
			strList.stream()
            // 문자열에 영문자가 포함되어 있는지 확인하는 정규 표현식 사용
            	   .filter(str -> str.matches(".*[a-zA-Z]+.*"))
            	   .forEach(System.out::println);

     sc.close();
 }
}