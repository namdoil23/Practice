package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.reference.Convertor;
import chap22_lambda.reference.MoneyConvertor;

public class _08_ReferenceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 기존에 배웠던 람다식으로 구성
//		convertMoney((a, b) -> MoneyConvertor.staticConvert(a, b));
		
		// 2. 위의 내용을 메소드 참조형식으로 구성
		// 메소드를 참조해서 람다식으로 구현하려면
		// 참조하는 메소드의 형태가 함수형 인터페이스에 선언한 추상메소드의 형태와 동일해야 한다.
		// 리턴타입, 매개변수의 순서, 개수, 타입이 모두 동일해야 메소드를 참조해서 사용할 수 있다.
		// 메소드명은 달라도 된다.
		// 3. static 메소드를 참조해서 사용할 때는 클래스명::참조할 메소드명으로 메소드를 참조한다. 
//		convertMoney(MoneyConvertor::staticConvert);
		
		// 4. 일반(인스턴스) 메소드를 참조하려면 참조할 메소드를 사용할 객체를 먼저 생성해야한다.
		MoneyConvertor moneyConvertor = new MoneyConvertor();
		// 참조방식은 클래스타입의 변수명::참조할 메소드명
//		convertMoney((a, b) -> moneyConvertor.instanceConvert(a, b));
		convertMoney(moneyConvertor::instanceConvert);
		
		// 5. 추상메소드와 형태가 다른 메소드는 참조해서 사용할 수 없다.
//		convertMoney(moneyConvertor::otherConvert);
		
		// 6. 추상메소드와 형태가 다른 메소드는 람다식으로 구성해서 사용한다.
//		convertMoney((a, b) -> {
//			moneyConvertor.otherConvert(a, b, "aaaa");
//			return 1000;
//		});
	}
	
	public static void convertMoney(Convertor convertor) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("환전할 원화를 입력하세요.");
		int money = sc.nextInt();
		sc.nextLine();
		
		System.out.println("환전할 통화의 기호를 입력하세요.('$', '€')");
		String str = sc.nextLine();
		
		int result = convertor.convert(money, str.charAt(0));
		
		System.out.println("환전 결과: " + str.charAt(0) + result);
		
		sc.close();
		
		
		
		
		
		
	}
}
