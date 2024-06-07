package chap16_usefulclass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 5개의 정수를 입력하고 배열에 저장
		// 배열에 저장된 정수 5개 중 최대값과 최소값을 구하세요.
		// Math.max와 Math.min 메소드를 이용하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("정수를 입력하세요.");
			intArr[i] = sc.nextInt();
		}
		int max = intArr[0];
		int min = intArr[0];
		
		
		for(int i = 1; i < 5; i++) {
			max = Math.max(max, intArr[i]);
			min = Math.min(min, intArr[i]);
			
		}
		
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		sc.close();
		
		

}
}
