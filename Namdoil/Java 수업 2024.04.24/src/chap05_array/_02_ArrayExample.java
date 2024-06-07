package chap05_array;

public class _02_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 10개의 정수를 저장하는 배열을 생성하고 3의 배수만 10개 저장하세요.
		int[] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (i + 1) * 3;
			System.out.println(intArr[i]);
		}
		
		System.out.println("------------------");
		
		int j = 0;
		
		while(j < intArr.length) {
			intArr[j] = (j + 1) * 3;
			System.out.println(intArr[j]);
			j++;
		}
	}

}
