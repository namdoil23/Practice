package chap13_nestedclass;

import chap13_nestedclass.nestedclass.NestedClass;

public class _01_InstanceOfNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정적 중첩 클래스의 객체 생성
		// 외부클래스의 객체 생성없이도 객체 생성 가능
		NestedClass.Mul mul = new NestedClass.Mul();
		
		// 1-1. 정적 중첩 클래스의 인스턴스 변수와 메소드
		mul.num4 = 10;
		mul.num5 = 20;
		
		int result = mul.mul(mul.num4, mul.num5);
		
		System.out.println(result);
		
		// 1-2. 정적 중첩클래스의 클래스 변수와 메소드
		NestedClass.Mul.num6 = 10;
		
		result = NestedClass.Mul.staticMul(NestedClass.Mul.num6, 20);
		System.out.println(result);
		
		// 2. 인스턴스 중첩 클래스의 객체 생성
		// 항상 외부 클래스의 객체를 먼저 생성해야 한다.
		NestedClass nestedClass = new NestedClass();
		
		NestedClass.Div div = nestedClass.new Div();
		
		// 2-1. 인스턴스 중첩 클래스이 인스턴스 변수와 메소드
		div.num7 = 100;
		div.num8 = 17;
		
		double dResult = div.div(div.num7, div.num8);
		System.out.println(dResult);
		
		// 2-2. 인스턴스 중첩 클래스의 클래싀 변수와 메소드
		NestedClass.Div.num9 = 100;
		dResult = NestedClass.Div.staticDiv(NestedClass.Div.num9, 17);
		System.out.println(dResult);
		
	}

}
