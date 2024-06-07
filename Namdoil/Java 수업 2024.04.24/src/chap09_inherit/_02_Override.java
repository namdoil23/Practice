package chap09_inherit;

import chap09_inherit.animal.Animal;
import chap09_inherit.animal.Bird;
import chap09_inherit.animal.Tiger;

public class _02_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Bird();
		
		// Bird 클래스의 eat, sleep이 실행
		animal.eat();
		animal.sleep();
		
		animal = new Tiger();
		
		// Tiger 클래스의 eat, sleep이 실행
		animal.eat();
		animal.sleep();
	}

}
