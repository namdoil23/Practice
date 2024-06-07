package chap19_generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _07_WildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		List<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		System.out.println(getSumList(intList));
		
		// 2.
		System.out.println(getMaxList(intList));
		
		List<String> strList = new ArrayList<>();
		
		strList.add("1");
		strList.add("2");
		strList.add("3");
		strList.add("4");
		strList.add("5");
		
//		System.out.println(getMaxList(strList));
		
		// 3.
		System.out.println(getAvgList(intList));
		
		List<Long> longList = new ArrayList<>();
		
		longList.add(10L);
		longList.add(20L);
		longList.add(30L);
		longList.add(40L);
		longList.add(50L);
		
		// Long 클래스는 Integer 클래스와 같은 Number 클래스를 상속받은 형제 클래스이지만
		// Integer 클래스와 부모, 자식관계로 매핑되어있지 않기 때문에 super 키워드로 하한제한을 건
		// 매개변수로는 사용할 수 없다.
//		System.out.println(getAvgList(longList));
	}
	
	// 1. 타입매개변수를 지정하지 않고 바로 사용가능한 제네릭 타입을 와일드카드<?>라고 한다.
	// 와일드카드는 제네릭클래스에는 사용할 수 없고 제네릭 메소드에서만 사용할 수 있다.
	// 제네릭 메소드의 리턴타입이나 매개변수에 타입매개변수의 지정없이 제네릭으로 사용할 수 있다.
	// 와일드카드는 타입매개변수와는 다르게 단독으로는 사용 못하고 제네릭클래스로 정의된 클래스의 
	// 서브클래스 타입으로 사용할 수 있다.
//	public static ? craeteList(? wildCardList) {
//		
//	}
	
	public static int getSumList(List<?> wildCardList) {
//		T t;
//		? a;
		int sum = 0;
		
		for(int i = 0; i < wildCardList.size(); i++) {
			sum += (int)wildCardList.get(i);
		}
		
		return sum;
	}
	
	// 2. 와일드카드<?>도 extends로 상한제한을 걸 수 있다.
	// <? extends 부모클래스>: 부모클래스를 상속받은 클래스와 부모클래스만 
	// 						 매개변수나 리턴타입으로 지정할 수 있다.
	public static int getMaxList(List<? extends Number> wildCardList) {
		int max = wildCardList.get(0).intValue();
		
		for(int i = 1; i < wildCardList.size(); i++) {
			if(wildCardList.get(i).intValue() > max) {
				max = wildCardList.get(i).intValue();
			}
		}
		
		return max;
	}
	
	// 3. 와일드카드<?>는 super 키워드로 하한제한을 걸 수 있다.
	// <? super 자식클래스>: 자식클래스에게 상속해준 부모클래스와 자식클래스만 메소드의 리턴타입, 매개변수로
	//					   지정가능하다.
	public static double getAvgList(List<? super Integer> intList) {
		double avg = 0.0;
		double sum = 0.0;
		
		for(int i = 0; i < intList.size(); i++) {
			sum += (double)intList.get(i);
		}
		
		avg = sum / intList.size();
		
		return avg;
	}
	
	// 4. 와일드카드<?>와 제네릭 타입매개변수<T, K, V, E,...>의 차이점
	// 4-1. 와일드카드는 제네릭 메소드(매개변수, 리턴타입)에만 사용가능하고 
	// 제네릭 타입매개변수<T, K, V, E,...>는 제네릭 클래스와 제네릭 메소드에 모두 사용가능하다.
	// 4-2. 제네릭 타입매개변수<T, K, V, E,...>는 메소드의 정의부나 클래스의 정의부에 타입매개변수를
	// 항상 지정해야 하지만 와일드카드<?> 타입매개변수를 지정 안해도 된다.
	// 4-3. 제네릭 타입매개변수<T, K, V, E,...>는 단독으로 사용가능
	// (타입매개변수 타입의 변수선언, 리턴타입, 매개변수)
	// 와일드카드는 단독으로 사용할 수 없고 제네릭클래스의 서브클래스 타입으로만 지정가능하다.
	// 와일드카드는 제네릭클래스의 확장성을 한 단계 더 높여서 사용을 더 유연하게 해주는 기능을 한다.
	public static List<?> copyList(List<?> wildCardList) {
		List<Integer> returnList = new ArrayList<>();
		List<Map<String, String>> mapList = new ArrayList<>();
		
		// 와일드카드는 향상된 for문도 사용불가능
		for(int i = 0; i < wildCardList.size(); i++) {
			returnList.add((int)wildCardList.get(i));
		}
		
		return mapList;
	}
	
	
	
	
	
	
	
}
