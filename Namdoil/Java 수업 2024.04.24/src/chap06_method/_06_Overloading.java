package chap06_method;

import chap06_method.calc.OverloadingCalculator;

public class _06_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		double dNum1 = 40.0;
		double dNum2 = 50.0;
		
		int result;
		
		OverloadingCalculator oc = new OverloadingCalculator();
		
		result = oc.add(num1, num2, num3);
		System.out.println(result);
		
		result = oc.add(dNum1, num1);
		System.out.println(result);
		
		result = oc.add(num2, num3);
		System.out.println(result);
		
		
		
		
	}

}
