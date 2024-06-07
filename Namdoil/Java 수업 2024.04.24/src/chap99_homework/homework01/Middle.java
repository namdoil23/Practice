package chap99_homework.homework01;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 1~100까지의 숫자 중 2와 3의 공배수를 출력하세요.
//		for(int i = 1; i <= 100; i++) {
//			if()  {
//				System.out.print(i + ", ");
//			} => if문의 조건만 완성
//		}
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 3 == 0)  {
				System.out.print(i + ", ");
			} 
		}
		System.out.println();
		
		//
		//		3. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요.
		int num1 = 1;

		while(num1 <= 10) {
			if(num1 % 2 == 0) {
				System.out.println(num1);
			}
			num1++;
		}
		
		System.out.println("------------------");
		//
		//		4. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,
		//		   그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요.
		int sum = 0;

		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
				sum += i;
			}
		}

		System.out.println("1000이하인 2와 7의 공배수의 합 : " + sum);
		//
		//		5. 20개 배열을 선언하세요.
		//		    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
		//		    인덱스의 홀수번째는 앞에서부터 출력하고
		//		    짝수번째는 뒤에서부터 출력하세요.
		int[] nums = new int[20];

		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 101);
		}

		for(int j = 0; j < nums.length; j++) {
			if(j % 2 == 1) {
				System.out.println("index: " + j);
				System.out.println(nums[j]);
			} else {
				System.out.println("index: " + (nums.length - 2 - j));
				System.out.println(nums[nums.length - 2 - j]);
			}
		}

		// 6. 중첩 for문을 이용해서 아래와 같이 출력하세요.
		// 6-1) 
		//    01234
		// 0  *
		// 1  **
		// 2  ***
		// 3  ****
		// 4  *****
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// 6-2)
		//  01234
		//4     *
		//3    **
		//2   ***
		//1  ****
		//0 *****
		for(int i = 4; i >= 0; i--) {
			for(int j = 0; j < 5; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// 6-3)
		//  01234
		//4 *****
		//3 ****
		//2 ***
		//1 **
		//0 *
		for(int i = 4; i >= 0; i--) {
			for(int j = 0; j <5; j++) {
				if(i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// 6-4)
		//  01234
		//0 *****
		//1  ****
		//2   ***
		//3    **
		//4     *
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <5; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


}
