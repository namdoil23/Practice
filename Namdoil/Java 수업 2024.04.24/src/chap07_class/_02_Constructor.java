package chap07_class;

import chap07_class.car.CarConstructor;

public class _02_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본생성자에서 company를 현대로 지정했기 때문에
		// 생성된 객체의 company는 현대로 초기화된 상태
		CarConstructor car = new CarConstructor();
		
		System.out.println(car.company);
		System.out.println(car.model);
		
		CarConstructor kiaCar = new CarConstructor("기아");
		
		System.out.println(kiaCar.company);
		System.out.println(kiaCar.color);
		
		CarConstructor blackGenesis = new CarConstructor("현대", "제네시스", "검정", 5000);
		blackGenesis.printCarInfo();
		
		
		
		
		
		
		
	}

}
