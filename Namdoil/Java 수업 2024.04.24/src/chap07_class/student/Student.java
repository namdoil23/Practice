package chap07_class.student;

public class Student {
	public String name;
	public int age;
	public String major;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	public void printStudentInfo() {
		// 생성자에서 this 객체가 생성된 객체를 의미한다면
		// 인스턴스 메소드에서 this 객체는 해당 메소드를 소유하고 있는 객체를 의미한다.
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("학과: " + this.major);
	}
	
	
	
	
	
	
}
