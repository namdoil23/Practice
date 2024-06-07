package chap99_homework.homework04;

public class Lion extends Cat{
	Lion() {
		super("사자");
	}
	
	public void hunt() {
		System.out.println(this.race + "는(은) 사냥을 합니다.");
	}

	public void run() {
		System.out.println(this.race + "는(은) 달립니다.");
	}
}
