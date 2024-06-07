package chap05_array;

public class _07_DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		
		// 2. 깊은 복사
		// 깊은 복사는 heap 메모리 영역에 새로운 배열을 생성해서 전달하기 때문에
		// 서로 다른 배열을 바라보게 하는 것이다.
		// 2-1. clone메소드 사용
		// heap메모리 영역에 {1, 2, 3, 4, 5}라는 새로운 배열을 생성하고 그 주소를 전달
		int[] copyArr1 = arr.clone();
		
		System.out.println(arr);
		System.out.println(copyArr1);
		System.out.println(arr == copyArr1);
		
		// 2-2. System.arraycopy() 사용
		int[] copyArr2 = new int[5];
		
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		System.out.println(arr);
		System.out.println(copyArr2);
		System.out.println(arr == copyArr2);
		
		for(int num : copyArr2) {
			System.out.println(num);
		}
		
		// 다른 배열을 참조해서 사용하기 때문에 서로에게(원본배열, 복사된배열) 영향을 끼치지 않는다.
		copyArr1[0] = 100;
		copyArr2[0] = 1000;
		arr[0] = 10000;
		
		System.out.println(arr[0]);
		System.out.println(copyArr1[0]);
		System.out.println(copyArr2[0]);
		
		
		
		
		
		
	}

}
