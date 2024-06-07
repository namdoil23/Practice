package chap18_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import chap14_objectarray.car.Car;

public class _06_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> carList = new ArrayList<>();
		
		carList.add(new Car("현대", "제네시스", 5000, "검정"));
		carList.add(new Car("현대", "소나타", 4000, "흰색"));
		carList.add(new Car("기아", "k9", 5000, "검정"));
		carList.add(new Car("기아", "ev6", 6000, "초록"));
		carList.add(new Car("현대", "그랜저", 4500, "회색"));
		
		System.out.println("carList의 데이터 개수: " + carList.size());
		
		// 1. Iterator 객체 얻기
//		Iterator<Car> carIterator = carList.iterator();
//		
//		while(carIterator.hasNext()) {
//			Car car = carIterator.next();
//			
//			car.carInfo();
//			
//			// iterator를 통한 데이터 삭제
//			// iterator.next 메소드로 데이터를 하나 꺼내온 후에 사용가능하다.
//			if(car.company.equals("현대")) {
//				// iterator.next 메소드를 통해 꺼내온 데이터 List에서 삭제
//				carIterator.remove();
//			}
//		}
		
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).company.equals("현대")) {
				carList.remove(i--);
			}
		}
		
//		for(Car car : carList) {
//			if(car.company.equals("현대"))
//				carList.remove(car);
//		}
		 
		System.out.println(carList.size());
		
		// 2. ListIterator 객체 얻기
		// cursor = 0 ListIterator 객체
		ListIterator<Car> carListIterator = carList.listIterator();
		
		// next메소드를 사용하면 iterator 객체가 다음 데이터를 가리키게 된다.
		// next => cursor +1
		carListIterator.next();
//		// cursor가 가리키고 있는 데이터 앞에 데이터를 추가한다.
		carListIterator.add(new Car("현대", "제네시스", 5000, "회색"));
//		
		while(carListIterator.hasPrevious()) {
//			// previous메소드는 iterator 객체가 이전 데이터를 가리키게 된다.
			carListIterator.previous();
//			
			carListIterator.set(new Car("쉐보레", "카마로", 5000, "노란"));
		}
		
		System.out.println(carList.size());
		
		for(Car car : carList) {
			car.carInfo();
		}
		
		
		
		
		
		
		
		
		
	}

}
