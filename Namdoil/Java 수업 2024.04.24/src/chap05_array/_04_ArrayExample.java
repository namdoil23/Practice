package chap05_array;

import java.util.Random;

public class _04_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 자바에서 랜덤 값 생성방법 1: Random 클래스 사용
		// Random.nextInt(바운드): 0 ~ 바운드 - 1 까지의 숫자중 랜덤한 값 생성
		Random random = new Random();
		
		// 0, 1, 2 중 랜덤한 값
		int randomVal = random.nextInt(3);
		System.out.println(randomVal);
		
		// 1, 2, 3 중 랜덤한 값
		randomVal = random.nextInt(3) + 1;
		System.out.println(randomVal);
		
		// 1~100 중 랜덤한 값
		randomVal = random.nextInt(100) + 1;
		System.out.println(randomVal);
		System.out.println("---------------------");
		
		// 2. 자바에서 랜덤 값 생성방법 2: Math 클래스의 Random() 메소드 사용
		// 0 <= Math.random() < 1 의 실수 값을 램던으로 리턴
		// 0 * 10 <= Math.random() * 10 < 1 * 10
		// (int)0 * 10 <= (int)Math.random() * 10 < (int)1 * 10
		// (int)0 * 10 + 1 <= (int)Math.random() * 10 + 1 < (int)1 * 10 + 1
		randomVal = (int)(Math.random() * 10) + 1;
		System.out.println(randomVal);
		System.out.println("----------------------");
		
		// 3. 정수 10개를 저장하는 배열을 생성하고 1~100까지의 랜덤값을 10개 저장하고 출력하세요.
		int[] randArr = new int[10];
		
		for(int i = 0; i < randArr.length; i++) {
			randArr[i] = (int)(Math.random() * 100) + 1;
//			randArr[i] = random.nextInt(100) + 1;
			System.out.println(randArr[i]);
		}
		
		
		
		
		
		
	}

}
