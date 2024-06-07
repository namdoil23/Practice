package chap99_homework.homework04;

public class ArrayUtility2 {
//	1. 다음 두 개의 static 메소드를 갖는 ArrayUtility2클래스를 만들어보고 사용하세요
//	  static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
//	  static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	
	public static int[] concat(int[] s1, int[] s2) {
		int[] concatArr = new int[s1.length + s2.length];
		int idx = 0;
		for(int num : s1) {
			concatArr[idx++] = num;
		}
		for(int num : s2) {
			concatArr[idx++] = num;
		}
		return concatArr;
	}
	
	public static int[] remove(int[] s1, int[] s2) {
		boolean[] isRemovedArr = new boolean[s1.length];
		int[] removeArr;
		int cnt = 0;
		
		// 숫자 제거
		for(int i = 0 ; i < s1.length; ++i) {
			for(int j = 0; j < s2.length; ++j) {
					if(s1[i] == s2[j]) {
						isRemovedArr[i] = true;
						break;
					}
			}
			// 같은 값 없다
			if(!isRemovedArr[i]) cnt++;
		}
		
		// 숫자 넣기
		removeArr = new int[cnt];
		int idx = 0;
		for(int i = 0; i < s1.length; ++i) {
			if(!isRemovedArr[i]) removeArr[idx++] = s1[i];
		}
		
		return removeArr;
		
	}
}
