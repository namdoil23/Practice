package chap19_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _06_LimitedGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 
		List<Long> longList = new ArrayList<>();
		
		longList.add(10L);
		longList.add(20L);
		longList.add(30L);
		
		System.out.println(sumList(longList));
		
		List<String> strList = new ArrayList<>();
		
		strList.add("10");
		strList.add("20");
		strList.add("30");
		// sumList 제네릭 메소드가 T로 Number 클래스를 상속받은 자식클래스만 지정가능하기 때문에
		// Number클래스를 상속받지 않은 String은 타입으로 지정할 수 없다.
//		System.out.println(sumList(strList));
		
		// 2.
		Map<String, Integer> intMap = new HashMap<>();
		intMap.put("A", 1);
		intMap.put("B", 2);
		intMap.put("C", 3);
		intMap.put("D", 4);
		intMap.put("E", 5);
		System.out.println(getSumMap(intMap));
		
		Map<String, String> strMap = new HashMap<>();
		strMap.put("A", "1");
		strMap.put("B", "2");
		strMap.put("C", "3");
		strMap.put("D", "4");
		strMap.put("E", "5");
		// getSumMap 제네릭 메소드에서 value의 타입으로는 Number 클래스를 상속받은 클래스만 지정가능하기 때문에
		// String은 타입으로 사용할 수 없다.
//		System.out.println(getSumMap(strMap));
	}
	
	// 1. 제네릭 클래스와 마찬가지로 제네릭 메소드에도 extends 키워드로 지정할 타입에 대한
	// 제한을 걸 수 있다.
	// extends로 제한된 제네릭에서는 부모클래스가 지정되어 있기 때문에
	// Object의 메소드 뿐만 아니라 지정된 부모클래스의 메소드도 사용이 가능하다.
	public static <T extends Number> double sumList(List<T> tList) {
		double sum = 0.0;
		
		for(T t : tList) {
//			Object obj = new Object();
//			obj.
			// 제한이 걸린 Number 클래스의 doubleValue 메소드 사용
			sum += t.doubleValue();
		}
		
		return sum;
	}
	
	// 2. String을 상속받은 클래스만 Key로 지정가능하고 
	// Number 클래스를 상속받은 클래스만 Value로 지정가능한 제네릭 메소드
	public static <K extends String, V extends Number> int getSumMap(Map<K, V> map) {
		int sum = 0;
		
		for(V v : map.values()) {
			sum += v.intValue();
		}
		
		return sum;
	}
	
	
	
	
	
	
	
	

}
