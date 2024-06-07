package chap04_controlstatement;

public class _01_IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lunchPrice = 7500;
		
		if(lunchPrice > 10000) {
			System.out.println("비싸다");
		} else if(lunchPrice > 8500) {
			System.out.println("조금 비싸다");
		} else if(lunchPrice > 6000) {
			System.out.println("적정하다");
		} else if(lunchPrice > 5000) {
			System.out.println("조금 싸다");
		} else {
			System.out.println("싸다");
		}
		
		System.out.println("--------------");
		
		int num = 0;
		
		// num가 짝수인 홀수인지 출력하는 조건문을 작성하세요.
		// 2로 나눴을 때 나머지가 0이면 짝수, 아니면 홀수
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
