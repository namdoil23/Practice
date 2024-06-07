package chap19_generic.box;

import java.util.List;

// 1. 제네릭 클래스 선언
// 클래스 이름뒤에 <타입매개변수인 T>를 붙여준다.
// 제네릭으로 선언된 클래스는 객체를 생성할 때 타입매개변수의 타입을 지정한다.
// 사용전까지는 타입에 대해 열어두고 사용할 때 타입을 지정해서 사용할 수 있게된다.
public class Box<T> {
	// T 타입의 변수
	// T 타입의 변수도 객체가 생성될 때 지정된 제네릭 타입에 따라 타입이 변경된다.
	private T t1;
	private T t2;
	
	private List<T> tList;
	
	public Box() {
		
	}
	
	public Box(T t1, T t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public void setT1(T t1) {
		this.t1 = t1;
	}
	
	// 제네릭의 타입매개변수는 메소드의 리턴 타입, 매개변수로도 사용할 수 있다.
	public T getT1() {
		return this.t1;
	}
	
	public void setT2(T t2) {
		this.t2 = t2;
	}
	
	public T getT2() {
		return this.t2;
	}
	
	public void setTList(List<T> tList) {
		this.tList = tList;
	}
	
	public List<T> getTList() {
		return this.tList;
	}
	
	public void add() {
		// 타입매개변수로 생성된 변수는 어떤 타입의 클래스가 들어올지 몰라서
		// Object에 존재하는 메소드 외의 메소드는 사용불가능하다.
		if(t1.getClass().getSimpleName().equals("Integer")) {
			System.out.println((Integer)t1 + (Integer)t2);
		} else if(t1.getClass().getSimpleName().equals("String")) {
			System.out.println((String)t1 + t2);
		} else {
			System.out.println("Integer나 String 타입이 아닙니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
