package chap99_homework.homework09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고 
//		4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
		Map<String, Integer> stMap = new HashMap<String, Integer>();
		stMap.put("홍길동", 50);
		stMap.put("임꺽정", 90);
		stMap.put("조병조", 100);
		stMap.put("고기천", 70);
		
		Set<Entry<String, Integer>> entrySet = stMap.entrySet();
		
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		
		String name = "";
		int score = 0;
		
		while(it.hasNext()) {
			Entry<String, Integer> ent = it.next();
			
			if(ent.getValue() > score) {
				score = ent.getValue();
				name = ent.getKey();
			}
		}
		
		System.out.println(name + " : " + score);

//		2.
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(10, 20);
		map.put(100, 200);
		map.put(10000, 2);
		map.put(1000, 2009);
		map.put(100, 20000);
		
		System.out.println(getMaxMul(map));
		
		map.clear();
		
// 		3.
		for(int i = 0; i < 5; i++) {
			map.put(i, i);
		}
		printKVDesc(map);
	}

//	2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 
//	key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
	public static Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> map) {
		Entry<Integer, Integer> maxEntry = null;
		int num = 0;
		
		// map.entrySet() => Set<Entey<Integer, Integer>>
		for(Entry<Integer, Integer> ent : map.entrySet()) {
			if(ent.getKey().intValue() * ent.getValue().intValue() > num) {
				num = ent.getKey().intValue() * ent.getValue().intValue();
				maxEntry = ent;
			}
		}
		
		return maxEntry;		
	}
	
//	3. Map<Integer, Integer>을 매개변수로 받아서 
//	key는 정순 출력, value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요. 
// {1: 3, 2: 4, 3: 5}
// 1 : 5
// 2 : 4
// 3 : 3
	public static void printKVDesc(Map<Integer, Integer> map) {
		List<Entry<Integer, Integer>> entList = new ArrayList<Entry<Integer, Integer>>();
		
		for(Entry<Integer, Integer> ent : map.entrySet()) {
			entList.add(ent);
		}
		
		for(int i = 0; i < entList.size(); i++) {
			System.out.println(
					entList.get(i).getKey() 
					+ " : " 
					+ entList.get(entList.size() - (i + 1)).getValue());
		}
	}
}
