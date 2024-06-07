package chap05_array;

public class _06_ShallowCopy {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		// 1. 얕은 복사
		// 배열도 참조타입의 변수이기 때문에 stack 메모리에는 heap 메모리의 주소가 저장되어 있고
		// 대입연산자를 통해서 다른 배열에 원본 배열을 저장하게 되면
		// heap 메모리의 주소가 전달되어 같은 배열을 바라보게 된다.
		int[] copyArr = arr;
		
		// 배열은 참조타입이기 때문에 배열을 출력하면 주소 값이 출력된다.
		System.out.println(arr);
		System.out.println(copyArr);
		System.out.println(arr == copyArr);
		
		// 얕은 복사는 같은 메모리 주소를 가지기 때문에 동일한 배열의 값들을 사용한다.
		// 따라서 복사된 배열에서 값을 변경하면 원본 배열의 값이 변경된다.
		copyArr[0] = 1000;
		
		System.out.println(arr[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
