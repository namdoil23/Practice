package chap99_homework.homework04;

public class Mammal {
	String race;
	
	Mammal() {
		System.out.println(race + "는(은) 포유류과입니다.");
	}
	
	Mammal(String race) {
		this.race = race;
		System.out.println(race + "는(은) 포유류과입니다.");
	}
	
	public void calve() {
		System.out.println(race + "는(은) 새끼를 낳습니다.");
	}

	public void sleep() {
		System.out.println(race + "는(은) 잠을 잡니다.");
	}
}
