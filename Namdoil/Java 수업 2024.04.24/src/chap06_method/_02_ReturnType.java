package chap06_method;

import chap06_method.calc.AccessModifierCalculator;
import chap06_method.calc.ReturnCalculator;

public class _02_ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnCalculator rCalc = new ReturnCalculator();
		
		// 1. 결과 값이 없는 메소드 호출(사용)
		rCalc.add();
		
		// 2. 결과 값이 있는 메소드 호출(사용)
		// 결과 값이 있는 메소드를 이런식을 호출해서 사용하면
		// 결과 값을 의미없게 사용하게 된다.
		rCalc.div();
		
		// 메소드의 결과 값을 의미 있게 사용하려면
		// 메소드의 결과 값과 같은 자료형의 변수로 저장해서 사용하거나
		// 다른 메소드의 매개변수로 전달해서 사용한다.
		double dNum = rCalc.div();
		System.out.println(dNum);
		
		System.out.println(rCalc.div());
		
		String str = rCalc.createString();
		System.out.println(str);
		
		int[] intArr = rCalc.createArray();
		System.out.println(intArr);
		
		AccessModifierCalculator ac = rCalc.createAnObject();
		System.out.println(ac);
		
		
		
	}

}
