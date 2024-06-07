package chap99_homework.homework04.m1;

import java.util.Scanner;
//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.

class Median {
	static int med3(int a, int b, int c) {
		//여기를 완성하세요.
		int[] numArr = new int[3];
		numArr[0] = a;
		numArr[1] = b;
		numArr[2] = c;
		
		for(int i = 0; i < numArr.length - 1; ++i) {
			for(int j = i+1; j < numArr.length; ++j) {
				if(numArr[i] > numArr[j]) {
					int temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		return numArr[1];
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
}
