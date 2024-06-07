package chap05_array;

public class _01_CreateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열의 선언
		// 자료형[] 변수명(배열명) = new 자료형[배열의 길이(저장될 값의 개수)];
		// 기본 자료형 또는 참조타입의 자료형으로도 배열을 생성할 수 있다.
		int[] numArr = new int[5];
		
		// 2. 배열의 초기화
		// 2-1. 인덱스(순번)으로 접근해서 초기화
		// 인덱스는 0부터 시작한다. 마지막 인덱스는 배열의 길이 - 1.
		// { 1, 2, , , 5}
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[4] = 5;
		
		// 배열 값의 사용
		// 각각의 인덱스로 접근해서 사용한다.
		// 변수명[인덱스] 인덱스번째에 저장되어 있는 값을 꺼내서 사용
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		System.out.println(numArr[2]);
		System.out.println(numArr[4]);
		System.out.println("-------------------");
		
		int[] bigArr = new int[1000];
		
		// 2-2. 반복문을 이용한 배열의 초기화
		for(int i = 0; i < 1000; i++) {
			bigArr[i] = i + 1;
		}
		
		System.out.println("bigArr의 길이: " + bigArr.length);
		 
		// 반복문을 통한 배열값의 사용
		for(int i = 0; i < bigArr.length; i++) {
			System.out.println(bigArr[i]);
		}
		
		// 2-3. 배열의 선언과 동시에 초기화
		// 길이가 4인 배열 생성, 인덱스는 0~3
		int[] intArr = {10, 20, 30, 40};
		
		System.out.println(intArr[0]);
		//존재하지 않는 인덱스에 접근하면 out of bound 에러가 발생한다.
//		System.out.println(intArr[4]);
		
		// 3. 참조타입의 배열 선언
		String[] strArr = new String[5];
		strArr[0] = "a";
		strArr[1] = "b";
		
		System.out.println(strArr[0]);
		System.out.println(strArr[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
