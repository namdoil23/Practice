package chap99_homework.homework13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요. 
//		PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.
		action((arr)-> {
			for(int i : arr) {
				if(i % 2 == 0)
					System.out.println(i);
			}
		});
	}

	public static void action(PrintNumber pn) {
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
//			System.out.print(arr[i] + ", ");
		}
		
		
		pn.printEvenNum(arr);
	}
}
