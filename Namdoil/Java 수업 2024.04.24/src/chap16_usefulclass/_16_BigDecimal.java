package chap16_usefulclass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class _16_BigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. BigInteger 객체 생성
		// 1-1. 생성자를 통한 객체 생성	
		BigDecimal bigDecimal1 = new BigDecimal(1.99999999999999999999999999999999999999999999999);
		
		// 1-2. valueOf 메소드를 통한 객체 생성
		BigDecimal bigDecimal2 = BigDecimal.valueOf(3.141592);
		
		// 2. 반올림 모드	
		// BigDecimal 끼리 나눗셈 연산을 하게 되면 오차가 발생할 수 있기 때문에 반올리모드를 지정한다.
		// 반올림 모드는 MathContext 객체를 통해서 진행되는데
		// MathContext의 생성자를 통해 객체를 생성할 때 매개변수로
		// MathContext(int 자리수, 반올림모드(RoundingMode enum사용))를 전달한다.
		// 자리수는 정수자리까지 포함된 자리수이다.
		System.out.println(
				bigDecimal2.divide(bigDecimal1, new MathContext(4, RoundingMode.HALF_UP)));
	
		// 3. setScale: 소수점 자리수 재설정
		// setScale(int 소수점 자리수, 반올림 모드)
		// 현재 소수점 자리수보다 큰 소수점 자리수를 지정하면 뒤에 0이 자동으로 붙는다.(반올리모드 지정하지 않아도 된다.)
		// 현재 소수점 자리수보다 작은 소수점 자리수를 지정하면 반올림모드가 동작한다.
		System.out.println(bigDecimal2.setScale(20));
		
		System.out.println(bigDecimal2.setScale(4, RoundingMode.UP));
	}

}
