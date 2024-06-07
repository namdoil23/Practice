package chap99_homework.homework03;

public class SmartPhone {
	public int volume;
	public int size;
	public String company;
	
	public SmartPhone() {
		
	}

	public SmartPhone(int volume, int size, String company) {
		this.volume = volume;
		this.size = size;
		this.company = company;
	}
	
	public void turnOn() {
		System.out.println("전원을 켠다.");
	}
	
	public void tunrOff() {
		System.out.println("전원을 끈다.");
	}
	
	public void volumeUp() {
		System.out.println("볼륨을 높인다.");
	}
	
	public void volumeDown() {
		System.out.println("볼륨을 줄인다.");
	}
}
