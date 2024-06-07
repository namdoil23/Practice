 package chap99_homework.homework09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    1. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) 
//		value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> alphaMap = new HashMap<String, Integer>();

		for(int i = 0; i < 10; i++) {
			System.out.println("알파벳을 입력하세요.");

			String alpah = sc.nextLine();

			alphaMap.put(alpah, (int)alpah.charAt(0));
		}
		
		System.out.println(alphaMap);
		
// 		2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고, 
// 		특정 이름의 전화번호를 조회하는 기능을 구현하세요.
		Map<String, String> phoneBook = new HashMap<>();

		phoneBook.put("홍길동", "010-1111-1111");
		phoneBook.put("장길산", "010-2222-2222");
		phoneBook.put("임꺽정", "010-3333-3333");


		System.out.println("전화번호를 조회할 이름을 입력하세요:");
		String name = sc.nextLine();
		System.out.println(phoneBook.get(name));

		sc.close();
	}

}
