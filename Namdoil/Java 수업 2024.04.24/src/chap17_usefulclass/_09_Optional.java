package chap17_usefulclass;

import java.util.Optional;

public class _09_Optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Optional 클래스
		// NullPointerException을 피하기 위해서 만들어진 클래스
		// 참조타입의 변수들은 예기치 못하게 null이 되는 겨우가 있는데
		// Optional 클래스에 참조타입의 변수들을 담아서 상요하면
		// Null로 발생하는 예외를 피할 수 있다.
		
		// 1-1. Optional 객체 생성
		String str = null;
		
		Optional<String> optionalStr = Optional.ofNullable(str);
		
//		for(int i = 0; i < str.length(); i++){
//		
//		}
		
		// 2. isPresent 메소드
		// 현재 Optional 객체에 담겨있는 참조타입의 값이 존재하는지 검사하는 메소드
		// 값이 존재하면 true, null이면 false
		if(optionalStr.isPresent()) {
			for(int i = 0; i < optionalStr.get().length(); i++) {
				
			}
		}
		
		// 3. isEmpty 메소드 
		// 현재 Optional 객체에 담겨있는 참조타입의 값이 비었는지 검사는 메소드
		// 값이 null이면 true, null이면 false
		if(optionalStr.isEmpty()){
			System.out.println("null입니다.");
			
		}
		
		// 4. get 메소드
		// Optional 객체에 담겨있는 참조타입의 값을 리턴하는 메소드
		// 만약에 참조타입의 값이 null이면 예외가 발생한다.
		String str2 = "aaa";
		Optional<String> optionalStr2 = Optional.of(str2);
		if(optionalStr.isPresent()) {
			System.out.println(optionalStr2.get());
		}else{
			System.out.println("값이 null입니다.");
		}
		
	}

}
