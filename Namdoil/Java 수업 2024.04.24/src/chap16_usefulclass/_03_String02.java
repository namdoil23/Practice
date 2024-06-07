package chap16_usefulclass;

import java.util.ArrayList;
import java.util.List;

public class _03_String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "computer";
		String str2 = "smartPhone";
		// String은 space값도 문자열값으로 인식(index로 잡힌다.)
		String str3 = "abcdha bcdeba";
		
		// 1. contains: 문자열을 포함하는지 여부를 검사하는 메소드
		// 포함하고 있으면 true, 포함하지 않으면 false를 리턴한다.
		System.out.println(str2.contains("tP"));
		System.out.println(str3.contains("tP"));
		
		// 2. indexOf, lastIndexOF: 특정 문자나 문자열의 index를 리턴하는 메소드
		// 포함되어 있으면 해당 문자의 인덱스 찾아서 리턴, 포함되어 있지 않으면 -1 리턴
		// indexOf는 왼쪽에서 오른쪽으로 검사
		// lastIndexOf는 오른쪽에서 왼쪽으로 검사
		System.out.println("str2에서 h의 index는" + str2.indexOf('h'));
		System.out.println("str3에서 a의 index는" + str3.indexOf('a'));
		System.out.println("str3에서 index 4부터 a의 index는" + str3.indexOf('a',4));
		
		System.out.println("str3에서 abc의 index는" + str3.indexOf("abc"));
		System.out.println("str2에서 abc의 index는" + str2.indexOf("abc"));

		System.out.println("str3에서 마지막 h의 index는" + str3.lastIndexOf('b'));
		System.out.println("str3에서 마지막 bc의 index는" + str3.lastIndexOf("bc"));
		
		// 3. legth: 문자열의 길이를 리턴하는 메소드
		System.out.println("str3의 길이는" + str3.length());
		
		// 배열에서는 legth가 메소드가 아니고 속성 값(멤버변수)이다.
		int[] intArr = new int[100];
		System.out.println("intArr의 길이는" + intArr.length);
		
		// List의 길이는 size 메소드를 사용한다.
		List <Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		System.out.println("intList의 길이는" + intList);
		
		// 4. replace, replaceAll: 문자열에서 주어진 첫 번째 매개변수를 찾아서 두 번째 매개변수로 
		// 치환하는 메소드, replace, replaceAll의 차이는 replaceAll의 정규표현식을 매개변수로
		// 전달할 수 있다는 점이다.
		
		String str4 = "abcabcacbaabbcc";
		
		System.out.println(str4.replace("abc", "111"));
		
		System.out.println(str4.replaceAll("abc", "111"));
		
		// replaceAll에서 정규표현식 사용
		// str4에 있는 a, c를 2로 치환해라
		System.out.println(str4.replaceAll("[ac]", "2"));
		
		// 5. 체이닝 기법
		// 메소드를 체인처럼 엮어서 사용하는 것을 체이닝기법이라 한다.
		// 사용한 메소드의 리턴타입에 따라서 엮어서 사용할 수 있는 메소드들이 달라진다.
		System.out.println(str4.replace('a', '1')
								.concat("abcabc")
								.replace('b', '2')
								.toUpperCase()
								);



	}

}
