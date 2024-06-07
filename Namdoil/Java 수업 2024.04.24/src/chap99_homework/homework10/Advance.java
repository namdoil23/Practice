package chap99_homework.homework10;

import java.util.Scanner;

import chap99_homework.homework10.MONTH;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		1. 12달을 상수로 만들어서 enum을 선언하고 첫 번째 값은 월의 숫자
//		두 번째 값은 평년일 때 그 달의 일수 
//		세 번째 값은 윤년일 때 그 달의 일수로 설정하고 사용자가 년도를 입력하면 해당 년도의 
//		1, 2, 3, 4, 5월의 일수의 총합을 출력하는 메소드를 구현하세요. sumDays(int year)
		System.out.println("일수를 구하고 싶은 년도를 입력하세요.");
		int year = sc.nextInt();
		
//		MONTH[] monthArr = MONTH.values();
		
		MONTH month = MONTH.JAN;
		
		System.out.println(month.sumDays(2020));
		
//		for(MONTH m : monthArr) {
//			System.out.println(year + "년도의 1월~" + m.getMonth() + "월까지의 일수는 " 
//					+ m.sumDays(year) + "일입니다.");
//		}

		sc.close();
	}

}
