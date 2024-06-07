package chap08_static;

import chap08_static.car.CarStatic;

public class _01_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 클래스 변수와 메소드의 사용
		// 클래스 변수와 메소드는 클래스명.변수, 클래스명.메소드로 접근한다.
		CarStatic.grade = "B";
		CarStatic.printCurrentGrade();
		
		// 2. 인스턴스 변수나 메소드는 클래스원형으로는 접근 및 사용이 불가능하다.
//		CarStatic.company = "현대";
//		CarStatic.model = "제네시스";
//		CarStatic.carInfo();
		
		// 3. 인스턴스 변수와 메소드는 객체 생성 후에 사용한다.
		CarStatic car = new CarStatic();
		car.company = "현대";
		car.model = "제네시스";
		car.color = "검정";
		car.price = 5000;
		car.carInfo();
		
	}

}
