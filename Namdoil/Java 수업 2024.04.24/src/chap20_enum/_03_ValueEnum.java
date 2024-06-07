package chap20_enum;

import chap20_enum.enums.ValueMonth;

public class _03_ValueEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. enum 객체 생성
		// enum객체를 생성할 때 지정한 상수의 값이 생성자에 자동으로 전달된다.
		ValueMonth jan = ValueMonth.JAN;
		ValueMonth aug = ValueMonth.valueOf("AUG");
		
		System.out.println(jan + "는 " + jan.getMonthValue() + "월입니다.");
		System.out.println(aug + "는 " + aug.getMonthValue() + "월입니다.");
		
		// 2. enum 배열 생성
		ValueMonth[] valueMonthArr = ValueMonth.values();
		
		for(ValueMonth valueMonth : valueMonthArr) {
			System.out.println(valueMonth + "는 " + valueMonth.getMonthValue() + "월입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
 		
		
		
		
	}

}
