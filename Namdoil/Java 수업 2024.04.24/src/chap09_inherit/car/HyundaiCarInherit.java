package chap09_inherit.car;

// 1. extends 키워드로 상속받은 클래스의 속성과 메소드를 모두 사용할 수 있다.
public class HyundaiCarInherit extends Car {
	// Car에 정의되어 있는 속성과 기능들은 따로 정의할 필요없이 사용가능해서
	// 코드를 줄일 수 있다.
	public void autoPilot() {
		System.out.println("자율주행한다.");
	}
	
	public void special() {
		System.out.println("자율주행한다.");
	}
}
