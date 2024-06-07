package chap09_inherit.animal;

public class Animal {
	int age;
	String size;
	boolean hasWing;
	
	public Animal() {
		
	}
	
	public Animal(int age, String size, boolean hasWing) {
		this.age = age;
		this.size = size;
		this.hasWing = hasWing;
	}
	
	public void eat() {
		System.out.println("먹이를 먹는다.");
	}
	
	public void sleep() {
		System.out.println("잠을 잔다.");
	}
}
