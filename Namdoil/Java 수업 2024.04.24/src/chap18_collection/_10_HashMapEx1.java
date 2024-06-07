package chap18_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _10_HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> intList2 = 
				new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
			
			for(int j = 0; j < i; j++) {
				if(intList2.get(i) == intList2.get(j)) {
					System.out.println("중복된 값입니다.");
					intList2.remove(i);
					i--;
				}
			}
		}
 		
		List<Integer> sumList = new ArrayList<>();
		
		Map<String, Integer> intMap = new HashMap<>();
		
		for(int i = 0; i < intList2.size(); i++) {
			for(int j = i + 1; j < intList2.size(); j++) {
				if(j != i) {
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		}
		System.out.println(sumList);
	
		/*
		 * {
		 * 		"3": 1,
		 * 		"4": 2,
		 * 		"5": 2,
		 * 
		 * 
		 * 
		 * */
		
		for (int i = 0; i < sumList.size(); i++) {
				if(!intMap.containsKey(sumList.get(i).toString())) {
						// Map에서 contailsKey 키 존재 여부를 확인하는 메소드(true/false)
						intMap.put(sumList.get(i).toString(), Integer.valueOf(1));
						// put으로 값을 추가, get 연결된값
				}else { intMap.put(sumList.get(i).toString(), Integer.valueOf(1));
		
				}
			
		}
		sc.close();
	}
}
	
