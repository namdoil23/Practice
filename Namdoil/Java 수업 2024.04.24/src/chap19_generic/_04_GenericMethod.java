package chap19_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _04_GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"java", "db", "javascript", "html"};
		
		System.out.println("strArr의 마지막 요소는 " + getLastElement(strArr));
		
		// 2. 번의 경우에는 메소드를 호출할 때 타입을 지정한다.
		// 메소드 명 앞에 타입을 지정한다.
		_04_GenericMethod.<Integer>getLastElement2(new int[] {1, 2, 3, 4, 5});
		
		// 3.
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(3);
		intList.add(11);
		
		System.out.println(getLastElement(intList));
		
		// 4.
		Map<String, Integer> map = new HashMap<>();
		
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		
		System.out.println(getSumMap(map));
		
		// 5.
		System.out.println(getMaxMap(map));
	}
	
	// 1. 제네릭 메소드 정의
	// 리턴타입 앞에 <T> 타입매개변수를 붙여서 리턴타입이나 매개변수의 타입이 열려있는
	// 메소드를 정의할 수 있다.
	// 제네릭 메소드의 타입은 메소드가 호출될 때 전달되는 매개변수 타입에 따라서 지정되게 된다.
	public static <T> T getLastElement(T[] tArr) {
		return tArr[tArr.length - 1];
	}
	
	// 2. 매개변수에서 타입을 지정할 수 없는 메소드
	public static <T> Integer getLastElement2(int[] intArr) {
		T t = null;
		System.out.println(t);
		return intArr[intArr.length - 1];
	}
	
	/// 3. 제네릭 메소드를 정의하세요.
	// 제네릭 타입의 List를 받아서 제네릭 타입의 값을 리턴하는 메소드
	// List의 마지막 요소를 리턴하는 메소드를 구현하세요.
	public static <T> T getLastElement(List<T> tList) {
		return tList.get(tList.size() - 1);
	}
	
	// 4. Map의 key, value를 모두 제네릭 타입으로 설정하고 싶을 때는
	// <K, V> 제네릭을 사용한다.
	public static <K, V> int getSumMap(Map<K, V> map) {
		int sum = 0;
		
		for(V v : map.values()) {
			sum += (int)v;
		}
		
		return sum;
	}
	
	// 5. Map을 매개변수로 받아서 value가 최대값인 key를 리턴하는 제네릭 메소드를 구현하세요. 
	public static <K, V> K getMaxMap(Map<K, V> map) {
		K maxKey = null;
		V maxValue = null;
		
		int index = 0;
		
		for(Entry<K, V> entry : map.entrySet()) {
			if(index == 0) {
				maxKey = entry.getKey();
				maxValue = entry.getValue();
			} else {
				if((int) entry.getValue() > (int) maxValue) {
					maxKey = entry.getKey();
					maxValue = entry.getValue();
				}
			}
			
			index++;
		}
		
		return maxKey;
			
	}
	
	
	
	
	
	
	
	
	
}
