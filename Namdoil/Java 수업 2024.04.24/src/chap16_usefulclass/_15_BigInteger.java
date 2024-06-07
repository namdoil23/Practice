package chap16_usefulclass;

import java.math.BigInteger;

public class _15_BigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. BigInteger 객체 생성
		// 1-1. 생성자를 통한 객체 생성	
		BigInteger bigInt1 = new BigInteger("1000000000000000000000000000000000000000000000000000000000000000000");
		
		// 1-2. valueOf 메소드를 통한 객체 생성
		BigInteger bigInt2 = BigInteger.valueOf(300000000000000L);
		
		// 2. toString: 객체에 저장되어 있는 값을 String 타입으로 변환
		// Object의 toString 메소드가 오버라이드 되어있다.
		
		System.out.println(bigInt1);
		System.out.println(bigInt2);
	
		// 3. 연산 메소드를 통한 연산
		// BigInteger 객체는 기본 연산자를 통한 연산을 지원하지 않ㅎ아서
		// 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산을 메소드를 통해 진행한다.
		System.out.println(bigInt1.add(bigInt2));
		System.out.println(bigInt1.subtract(bigInt2));
		System.out.println(bigInt1.multiply(bigInt2));
		System.out.println(bigInt1.divide(bigInt2));
		System.out.println(bigInt1.remainder(bigInt2));
		
	
	}

}
