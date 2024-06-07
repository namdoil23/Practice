package chap07_class;

import chap07_class.circle.Circle;

public class _03_UseOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10);
		
		System.out.println(circle.radius);
		System.out.println(circle.round());
		System.out.println(circle.area());
	}

}
