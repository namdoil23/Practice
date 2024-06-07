package chap22_lambda.basiclambda;


public class MulAndDiv {
	public void singleMul(int num1, SingleMul singleMul) {
		singleMul.singleMultiply(num1);
	}
	
	public void mul(int num1, int num2, Mul mul) {
		mul.multiply(num1, num2);
	}
	
	public void div(int num1, int num2, Div div) {
		div.div(num1, num2);
	}
}
