package chap18_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chap14_objectarray.car.Car;

public class _09_MapList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> carList = new ArrayList<>();
		
		carList.add(new Car("현대", "제네시스", 5000, "검정"));
		carList.add(new Car("현대", "소나타", 4000, "흰색"));
		carList.add(new Car("기아", "k9", 5000, "검정"));
		carList.add(new Car("기아", "ev6", 6000, "초록"));
		carList.add(new Car("현대", "그랜저", 4500, "회색"));
		
		
		// 1. Map이 여러개 저장되어있는 List 생성
		List<Map<String, Object>> mapList = new ArrayList<>();
		
		for(Car car : carList) {
			Map<String, Object> carMap = new HashMap<>();
			
			carMap.put("company", car.company);
			carMap.put("model", car.model);
			carMap.put("price", car.price);
			carMap.put("color", car.color);
			
			mapList.add(carMap);
			
		}
		
		System.out.println(carList);
		System.out.println("------------------------");
		System.out.println(mapList);
	}

}
