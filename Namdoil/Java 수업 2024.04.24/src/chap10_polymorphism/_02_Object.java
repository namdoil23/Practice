package chap10_polymorphism;

import chap10_polymorphism.member.Member;

public class _02_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member(1, "bit", "1234", "bit@bit.com", "bitcamp");
		
		//println()	메소드에 객체를 매개변수로 전달하면 toString 메소드가 자동적으로 동작한다.
		System.out.println(member);
	}

}
