package chap99_homework.homework04;

public class Tiger extends Cat{
	Tiger() {
		super("호랑이");
	}
	
	public void eat() {
		System.out.println(this.race + "는(은) 고기를 먹습니다.");
	}

	public void swim() {
		System.out.println(this.race + "는(은) 수영을 합니다.");
	}
}
