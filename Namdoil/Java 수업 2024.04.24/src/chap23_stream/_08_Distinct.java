package chap23_stream;

import java.util.Arrays;

public class _08_Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.random() * 10) + 1;
		}
		
		// 1. distinct(): 중복값이 제거된 새로운 Stream을 리턴. 중간 단계 메소드
		// 객체의 경우에는 주소값이 같으면 중복으로 인식
		Arrays.stream(intArr)
			  .distinct()
			  .forEach(num -> System.out.println(num));
		
		
	}

}
