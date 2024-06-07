package chap14_objectarray;

import chap14_objectarray.car.Car;

public class _01_ClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 객체 배열 선언
		// 100개의 모든 요소가 null인 상태로 만들어진다.
		Car[] carArr = new Car[100];
		
		// null에는 어떠한 속성도 기능도 존재하지 않는다.
//		carArr[0].carInfo();
		
		// 2. 객체 배열의 값 저장
		// 객체배열의 요소에는 항상 객체가 저장되어야 한다.
		carArr[0] = new Car("현대", "제네시스", 5000, "검정");
		carArr[1] = new Car("기아", "k9", 5000, "초록");
		carArr[2] = new Car("현대", "아반떼", 3000, "흰정");

		// 3. 객체 배열 사용
		// 객체 배열 요소에 하나 씩 접근해서
		// 요소가 객체기 때문에 객체에 있는 메소드나 속성들을 사용한다.
		carArr[0].company = "포르쉐";
		carArr[0].model = "타이칸";
		carArr[0].price = 10000;
		carArr[0].color = "빨간색";
		
		carArr[0].carInfo();
		System.out.println("-----------");
		
		int[] intArr = new int[100];
		
		intArr[0] = 1;
		System.out.println(intArr[0]);
		System.out.println("-----------");
		
		// 4. 일반 for문과 향상된 for문 사용가능
		for(int i = 0; i < carArr.length; i++) {
			// nullpointException을 피하기 위한 예외처리
			if(carArr[i] != null) {
				// carArr에 저장되어 있는 Car 객체를 하나씩 꺼내서 사용
				carArr[i].carInfo();
				
			}
		}
		
		for(Car c: carArr) {
			if(c != null) {
				c.carInfo();
			}
		}
	}

}
