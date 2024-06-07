package chap07_class.car;

public class Car {
	// 1. 자동차에 속성들(인스턴스 변수, 필드, 어트리뷰트...)
	// 제조사
	public String company;
	// 색상
	public String color;
	// 모델
	public String model;
	// 가격
	public int price;
	
	// 생성자 메소드: 리턴타입이 없고 클래스 이름과 동일한 명칭의 메소드.
	// 생성자 메소드의 역할은 객체를 생성하고 객체에 있는 변수와 메소드를 메모리에 올리면서 
	// 변수들을 초기화 하는 역할
	public Car() {
		
	}
	
	public Car(int price) {
		this.price = price;
	}
	
	// 2. 자동차의 기능들(메소드, 펑션, 함수....)
	// 시동을 켠다
	public void turnOn() {
		System.out.println("시동을 켠다.");
	}
	// 시동을 끈다
	public void turnOff() {
		System.out.println("시동을 끈다.");
	}
	// 속도를 높인다.
	public void speedUp() {
		System.out.println("속도를 높인다.");
	}
	// 속도를 줄인다.
	public void speedDown() {
		System.out.println("속도를 줄인다.");
	}
	// 자동차의 정보를 표시한다.
	public void printCarInfo() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	}
	
	
	
	
	
	
	
	
	
	
	
}
