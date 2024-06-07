package chap99_homework.homework04;

public class Cat extends Mammal{
	Cat() {
		super();
		System.out.println(race + "는(은) 고양이과입니다.");
	}
	
	Cat(String race) {
		super(race);
		System.out.println(race + "는(은) 고양이과입니다.");
	}
	
	public void howling() {
		System.out.println(this.race + "는(은) 웁니다.");
	}

	public void scratch() {
		System.out.println(this.race + "는(은) 할큅니다.");
	}
}
