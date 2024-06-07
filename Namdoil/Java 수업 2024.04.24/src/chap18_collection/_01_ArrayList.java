package chap18_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chap14_objectarray.car.Car;

public class _01_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. List 객체 생성
		// List는 인터페이스라 객체를 생성 할 수 없고
		// List를 상속받아 구현된 ArrayList, LinkedList 등의 객체를 사용한다.
		// List를 생성할 때는 제네릭 타입의 엘레먼트의 타입을 지정해야하는데
		// 지정하지 않고 List를 생성하면 엘레먼트의 타입이 자동으로 Object로 지정된다.
		
		List list1 = new ArrayList();
		List<Object> list2 = new ArrayList<>();
		
		
		// 엘레먼트의 타입이 Object로 지정되었기 때문에
		// 모든 타입의 갓을 저장할 수 있는 List가 된다.
		
		list1.add(1);
		list1.add("aa");
		list1.add(new Car());
		list1.add(new ArrayList());
		
		
		// 2. Java 17버전 이전에서는 ArrayList 생성자에서도 엘레먼트의 제네릭타입을 지정해야 됐지만
		// Java 17버전부터는 제네릭 타입을 명시하지 않아도 된다.
		
		// Java 17버전
		List<String> strList = new ArrayList<>();
		
		// Java 17 이전 버전
		List<String> strList2 = new ArrayList<String>();
		
		// 3. 제네릭 타입에 기본타입은 지정할 수 없다.
//		List<int> intList = new ArrayList<>();
		
		// 4. subList: 매개변수로 전달된 시작 인덱스부터 끝 인데스까지의 데이터를 잘라서 새로운 리스트로 리턴
		List<Integer> intList1 = new ArrayList<>();
		
		intList1.add(4);
		intList1.add(5);
		intList1.add(3);
		intList1.add(1);
		intList1.add(2);

		List<Integer> intList2 = new ArrayList<>(intList1.subList(1, 4));
		
		System.out.println(intList1);
		System.out.println(intList2);
		
		// 3. 정렬
		// Collections.sort(Collection c) 메소드 사용
		// sort 메소드는 static으로 선언되어 있어서 Collection 클래스에서 바로 사용한다.
		Collections.sort(intList1);
		Collections.sort(intList2);
		
		System.out.println(intList1);
		System.out.println(intList2);

		// 4. 포함여부 확인
		// containsAll(Conllection c): 매개변수로 전달된 Collection 객체가 모두 포함되는지 확인
		// contains(Object o): 매개변수로 전달된 객체가 목록에 존재하는지 확인
		if(intList1.contains(11)) {
			System.out.println("포함합니다.");
		}else {
			System.out.println("포함하지 않습니다.");
			
		}
		
		if(intList1.containsAll(intList2)) {
			System.out.println("포함합니다.");
		}else {
			System.out.println("포함하지 않습니다.");
		}
			
		// 5. 데이터추가
		// add(E e): 매개변수로 전달받은 e를 목록의 마지막에 추가
		// addAll(Collection c): 매개변수로 전달받은 Collection 객체의 데이터를 목록 마지막에 모두 추가
		intList2.add(10);
		intList2.add(13);

		intList1.addAll(intList2);
		
		System.out.println(intList1);
		System.out.println(intList2);
		
		// 6. 특정 index의 데이터 수정
		// set(int, index, E e): 매개변수로 전달받은 index에 위치한 데이터를 e로 수정
		intList1.set(1, 1000);
		intList2.set(3, 2000);
		
		System.out.println(intList1);
		System.out.println(intList2);
		
		// 7. 리스트에 저장되어 있는 데이터의 개수 확인
		// size() 메소드를 사용한다.
		System.out.println(intList1.size());
		System.out.println(intList2.size());

		
	}

}
