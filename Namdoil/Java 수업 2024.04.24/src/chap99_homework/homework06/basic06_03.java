package chap99_homework.homework06;

public class basic06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx), Math.round 메소드 이용
		double num1 = 16.459;
		
		double roundNum1 = (double)Math.round(num1*100.0)/100;
		// double을 꼭 써야하나?
		System.out.println(roundNum1);
	
	}

}
