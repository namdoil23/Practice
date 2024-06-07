package chap99_homework.homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
		Scanner sc = new Scanner(System.in); 
		
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 문자열을 입력하세요. ");
			String input = sc.nextLine();
			strList.add(input);
		}
		
        System.out.println("길이가 5 이상인 문자열:");
        strList.stream()
               .filter(str -> str.length() >= 5)
               .forEach(System.out::println);

        sc.close();
    }
}
