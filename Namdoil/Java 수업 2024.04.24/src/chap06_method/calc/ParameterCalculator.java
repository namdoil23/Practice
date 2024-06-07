package chap06_method.calc;

public class ParameterCalculator {
	// 3. 매개변수: 메소드가 받아서 처리할 대상이 되는 값을 의미한다.
	// 매개변수의 지정 위치는 메소드 명 뒤 () 소괄호 안에 선언할 수 있다.
	// 매개변수에 사용할 수 있는 타입은 기본자료형과 모든 참조타입
	// 매개변수의 개수에는 제한이 없어서 개발자가 원하는 대로 지정할 수 있다.
	// 매개변수가 있는 메소드를 사용할 때는 항상 매개변수의 타입, 순서, 갯수를 맞춰야 한다.
	
	// 메소드의 정의부(선언부): 메소드의 접근제어자, 리턴타입, 메소드명, 매개변수, 어떤 동작을 하는지를 지정한다.
	// 메소드의 사용부에서는 항상 정의부에서 정의한 형태로 호출해서 사용한다.
	public void add(int a, long b) {
		System.out.println(a + b);
	}
	
	public double div(double a, int b) {
		return a / b;
	}
	
	public String concat(String a, String b) {
		return a + " " + b;
	}
	
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
