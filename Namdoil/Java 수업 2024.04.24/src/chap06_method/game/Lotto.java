package chap06_method.game;

public class Lotto {
	// 1. 1~45까지 숫자 중 랜덤 값 7개를 저장해서 배열로 리턴하는 메소드 generateLottoArray를 구현하세요.
	// 매개변수 없음
	public int[] generateLottoArray() {
		int[] lotto = new int[7];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			if(isDuplicated(lotto, i)) {
				i--;
			}
		}
		
		return lotto;
	}
	
	// 2. 정수형 배열과 int 타입의 인덱스를 매개변수로 받아서 중복체크하는 메소드 isDuplicated를 구현하세요.
	// 리턴타입 boolean => 중복이 됐으면 true 리턴, 중복이 없으면 false 리턴
	public boolean isDuplicated(int[] arr, int index) {
		for(int i = 0; i < index; i++) {
			if(arr[index] == arr[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
}
