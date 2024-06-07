package chap07_class.car;

public class CarConstructor {
	public String company;
	public String model;
	public String color;
	public int price;
	
	// 생성자는 관례적으로 속성과 기능사이에 정의한다.
	// 접근제어자 + 클래스명(매개변수) 으로 지정
	// 매개변수가 없는 생성자를 기본생성자라고 하며
	// 생성자를 정의하지 않았을 때 기본으로 제공된다.
	// 생성자는 객체를 생성하면서 속성들을 초기화할 때 주로 사용한다.
	public CarConstructor() {
		// 생성되는 객체들의 company는 모두 현대로 지정된 다음에 생성된다.
		company = "현대";
	}
	
	// 매개변수가 있는 생성자
	public CarConstructor(String c) {
		company = c;
	}
	
	public CarConstructor(String company, String model) {
		this.company = company;
		this.model = model;
	}

	// 매개변수가 있는 생성자는 받아온 매개변수 값으로 클래스의 속성들을 초기화한다.
	// 매개변수는 생성자에서 어떤 변수를 초기화하는 명확하게 하기 위해서 
	// 속성 변수명과 일치시키는 게 관례적이다.
	// 매개변수가 있는 생성자를 생성하면 기본생성자가 제공되지 않기때문에 항상 
	// 기본생성자 먼저 정의를 해주고 다른 생성자들을 정의한다.
	public CarConstructor(String company, String model, String color, int price) {
		// this라는 객체는 생성된 CarConstructor 객체를 지칭하는 표현
		this.company = company;
		this.model = model;
		this.color = color;
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
