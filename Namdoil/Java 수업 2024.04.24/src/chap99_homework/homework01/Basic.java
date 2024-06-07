package chap99_homework.homework01;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 출력된 값은 모두 증감연산자가 포함된 상태입니다.
//		    11
//		    12
//		    12
		
//		    10
		
//		    10
		
//		     8
//		
		int num = 10;
		
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println("-------------------");
		
//		2. 관계연산자(<, >) 두 개를 사용하여 int a = 10; int b = 20; 의 관계를 다음과 같이 출력하세요.
//		    true
//		    false
		
		int a = 10;
		int b = 20;
		
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println("-------------------");
//	
//		3. 10 ~ 1까지 거꾸로 while문으로 출력
		num = 10;
		
		while(num >= 1) {
			System.out.println(num--);
		}
		System.out.println("-------------------");
//	
//		4. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		num = 10;
		
		do {
			System.out.println(num--);
		} while(num >= 1);
		System.out.println("-------------------");
//	
//		5. 10 ~ 1까지 거꾸로 for문으로 출력
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("-------------------");
//	
//		6. 1 ~ 100까지 합을 while문으로 출력
		int sum = 0;
		num = 1;
		
		while(num <= 100) {
			sum += num++;
		}
		System.out.println("1~100까지 합(while): " + sum);
		System.out.println("-------------------");
//	
//		7. 1 ~ 100까지 합을 do ~ while문으로 출력
		sum = 0;
		num = 1;
		
		do {
			sum += num++;
		} while(num <= 100);
		System.out.println("1~100까지 합(do ~ while): " + sum);
		System.out.println("-------------------");
//	
//		8. 1 ~ 100까지 합을 for문으로 출력
		sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
//				
//		9.int 10개짜리 배열 생성하여
//		 int배열에 3의 배수를 차례대로 저장하세요.
//		 그리고 거꾸로 출력하세요.
		int[] nums = new int[10];
		num = 1;
		int count = 0;
		
		while(true) {
			if(num % 3 == 0) {
				nums[count++] = num;
			}
			num++;
			
			if(count == 10) {
				break;
			}
		}
		
		for(int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
//		 
//		10.int배열을 10개 생성해라 
//		  사용자로부터 10개의 값을 입력받고
//		  순서대로 출력하고 
//		  총합을 구하세요.
		Scanner sc = new Scanner(System.in);
		nums = new int[10];
		sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요.");
			nums[i] = sc.nextInt();
		}
		
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println(nums[i]);
		}
		
//		for(int i : nums) {
//			sum += i;
//			System.out.println(i);
//		}
		
		System.out.println("배열의 총합 : " + sum);
		
//		11.int 배열로 10개의 공간을 생성하세요.
//		  1 ~ 10까지의 임의의 수를 저장하고
//		  홀수만 골라서 출력하세요.
		nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 10) + 1;
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 != 0) {
				System.out.println(nums[i]);
			}
		}
		
//		for(int i : nums) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
//		  
//		12. 정수 10개를 입력받아 배열에 저장하고, 
//		    이 정수중에서 2의 배수와 3의 배수를 출력하세요.
		nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요.");
			nums[i] = sc.nextInt();
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0 || nums[i] % 3 == 0) {
				System.out.println(nums[i]);
			}
		}
		
//		for(int i : nums) {
//			if(i % 2 == 0 || i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
		

		sc.close();
	}

}
