package chap99_homework.homework09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//	    (Map<Character, Integer> 형태의 Map과 Entry 사용)
		Scanner sc = new Scanner(System.in);
		
		/// aabccdea
		System.out.println("문자열을 입력하세요.");
		String input = sc.nextLine();
		
		Map<Character, Integer> chMap = new HashMap<Character, Integer>();
		
		for(int i = 0; i < input.length(); i++) {
			// chMap = {'a': 2}
			// chMap = {a: 2, b: 1}
			// chMap = {a: 2, b: 1, 'c': 1}
			// chMap = {a: 2, b: 1, 'c': 2}
			// chMap = {a: 2, b: 1, 'c': 2, 'd': 1}
			// chMap = {a: 2, b: 1, 'c': 2, 'd': 1, 'e': 1}
			// chMap = {a: 3, b: 1, 'c': 2, 'd': 1, 'e': 1}
			if(i == 0) {
				// chMap = {a: 1}
				chMap.put(input.charAt(i), 1);
			} else {
				Set<Entry<Character, Integer>> entrySet = chMap.entrySet();
				
				Iterator<Entry<Character, Integer>> it = entrySet.iterator();
				
				int cnt = 0;
				char key = 0;
				
				while(it.hasNext()) {
					// {a: 1}
					// {a: 2}
					// {a: 2}, {b: 1}
					Entry<Character, Integer> ent = it.next();
					//iterator.next()로 객체를 꺼내와서
					//그 내용을 변경하게 되면 iterator가 인식하지 못하게
					//되어 에러발생
					// a == a
					// a == b
					// a == c, b == c
					if(ent.getKey() == input.charAt(i)) {
						// a
						// last a
						key = ent.getKey(); 
						// 1
						// last 2
						cnt = ent.getValue();
						//System.out.println(ent.getKey() + " : " + ent.getValue());
						break;
					} 
				}
				
				// key = 'a' cnt = 1
				if(key != 0 && cnt != 0) {
					// {'a', 2}
					// last {'a', 3}
					chMap.put(key, ++cnt);
				} else {
					// {'b', 1}
					// {'c', 1}
					chMap.put(input.charAt(i), 1);
				}
				
			}
		}
		
		System.out.println(chMap);
		
		int maxCnt = 0;
		char maxCh = 0;
		
		for(Entry<Character, Integer> ent: chMap.entrySet()) {
			if(ent.getValue() > maxCnt) {
				maxCnt = ent.getValue();
				maxCh = ent.getKey();
			}
		}
		
		System.out.println(maxCh + " : " + maxCnt);
		

		sc.close();
	}

}
