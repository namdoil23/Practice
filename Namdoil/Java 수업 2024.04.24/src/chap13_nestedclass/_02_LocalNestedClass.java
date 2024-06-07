package chap13_nestedclass;

import chap13_nestedclass.nestedclass.LocalNestedClass;

public class _02_LocalNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역 중첩 클래스는 객체 생성이 불가능하다.
		LocalNestedClass localNestedClass = new LocalNestedClass();
		
		localNestedClass.speedUp();
		
//		localNestedClass.Engine engine = localNestedClass.new Engine();

	}

}
