package chap08_static.car;

public class CarStatic {
	// 1. 인스턴스 변수 선언
	// 인스턴스 변수는 객체가 생성된 후에 사용가능
	public String company;
	public String model;
	public String color;
	public int price;
	
	// 2. 클래스 변수 선언(static 변수)
	// 클래스 변수는 컴파일러가 클래스를 읽으면서 메모리(static 영역)에 바로 저장되어 객체 생성없이 사용가능
	public static String grade;
	
	// 3. 인스턴스 메소드 선언
	// 인스턴스 메소드도 컴파일러가 클래스를 읽으면서 메모리에(static 영역(메소드 영역))에 저장되지만
	// 객체가 생성되지 않으면 사용하지 못하는 상태로 만들어준다.
	// 그리고 객체들이 생성되면 각각의 객체가 메소드를 각각 생성하는 것이 아니고
	// static 영역에 생성된 메소드를 참조해서 사용한다.
	public void carInfo() {
		System.out.println("제조사: " + this.company);
		System.out.println("모델: " + this.model);
		System.out.println("색상: " + this.color);
		System.out.println("가격: " + this.price);
	}
	
	// 4. 클래스 메소드(static 메소드)
	public static void printCurrentGrade() {
		System.out.println("현재 등급: " + grade);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
