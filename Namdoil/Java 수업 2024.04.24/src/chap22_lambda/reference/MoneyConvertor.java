package chap22_lambda.reference;

public class MoneyConvertor {
	// 1. static 참조 메소드
	// 참조할 메소드의 형태는 추상메소드와 동일해야한다.
	// 리턴타입, 매개변수의 타입과 개수, 순서가 동일해야한다.
	public static int staticConvert(int money, char ch) {
		int convertMoney = 0;
		
		switch(ch) {
			case '$':
				convertMoney = money / 1400;
				break;
			case '€':
				convertMoney = money / 1500;
				break;
			default:
				convertMoney = money;
		}
		
		return convertMoney;
	}
	
	// 2. 일반 참조 메소드
	public int instanceConvert(int money, char ch) {
		int convertMoney = 0;
		
		switch(ch) {
			case '$':
				convertMoney = money / 1400;
				break;
			case '€':
				convertMoney = money / 1500;
				break;
			default:
				convertMoney = money;
		}
		
		return convertMoney;
	}
	
	public void otherConvert(int a, int b, String str) {
		System.out.println("" + a + b + str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
