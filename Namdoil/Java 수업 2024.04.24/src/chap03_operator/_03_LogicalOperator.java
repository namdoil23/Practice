package chap03_operator;

public class _03_LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 관계연산자(비교연산자)
		int num1 = 110;
		int num2 = 225;
		
		// true
		System.out.println("num1 < num2 : " + (num1 < num2));
		// true
		System.out.println("num <= num2 : " + (num1 <= num2));
		// false
		System.out.println("num1 > num2 : " + (num1 > num2));
		// false
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		// false
		System.out.println("num1 == num2 : " + (num1 == num2));
		// true
		System.out.println("num1 != num2 : " + (num1 != num2));
		
		// ==, != 값의 동일여부를 비교할 때는 기본자료형만 가능하다.
		// 참조형 변수들은 값이 heap 메모리에 저장되어 있기 때문에
		// ==, !=을 이용해서 값을 비교하면 stack 메모리에 저장되어 있는 주소값을 비교한다.
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		// String의 경우는 Object에서 상속받아 오버라이드된 equals라는 메소드로 값을 비교한다.
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		
		// 3. 논리연산자
		int num3 = 10;
		int num4 = 33;
		
		boolean result;
		
		// 논리곱(&&): 양쪽 항 모두 true여야 true 리턴.
		result = num1 < num2 && num3 / num4 == 0;
		System.out.println(result);
		
		// 논리합(||): 한쪽 항만 true여도 true 리턴.
		result = false || num2 > 100;
		System.out.println(result);
		
		// 부정(!): true는 false, false는 true로 반전해서 리턴.
		result = !(num4 > 200);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
