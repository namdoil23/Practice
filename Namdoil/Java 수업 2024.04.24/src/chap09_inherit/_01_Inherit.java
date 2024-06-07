package chap09_inherit;

import chap09_inherit.car.Car;
import chap09_inherit.car.HyundaiCarInherit;
import chap09_inherit.car.KiaCarInherit;

public class _01_Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 상속받은 자식 클래스 객체 생성
		HyundaiCarInherit hCar = new HyundaiCarInherit();
		
		// 2. 부모클래스인 Car의 속성과 기능 사용
		hCar.company = "현대";
		hCar.model = "제네시스";
		hCar.color = "검정";
		hCar.price = 5000;
		
		hCar.carInfo();
		
		// 3. 자식클래스인 HyundaiCarInherit의 고유한 속성이나 기능 사용
		hCar.autoPilot();
		
		KiaCarInherit kCar = new KiaCarInherit();
		
		kCar.company = "기아";
		kCar.model = "k9";
		kCar.color = "초록";
		kCar.price = 6000;
		
		kCar.carInfo();
		
		kCar.cruiseMode();
		
		// 4. 상속은 다형성의 기초
		// 다형성은 다양한 형태를 띄는 성질
		// 부모클래스 타입 변수에 여러 형태의 자식 객체를 담아서 사용할 수 있게 된다.
		Car car = new HyundaiCarInherit();
		
		car.special();
		
		car = new KiaCarInherit();
		car.special();
		
		// 부모클래스 타입의 변수에서는 자식클래스의 고유한 속성이나 기능은 사용하지 못한다.
//		car.autoPilot();
//		car.cruiseMod();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
