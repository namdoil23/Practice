package chap02_variables;

public class _07_BooleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자 id 지정
		String userId = "java";
		
		// 2. boolean 타입의 변수 선언 및 초기화
		// boolean 타입은 true, false 두 가지 값만 저장할 수 있다.
		// 유효성 검사 플래그로 사용할 boolean 변수
		boolean isValidated = false;
		
		// 3. 사용자 id 유효성 검사
		// 사용자 id가 8자리 이상 20이하면 유효한 id로 판단
		// 문자열변수.length()=> 문자열의 길이
		if(userId.length() >= 8 && userId.length() <= 20) {
			// 유효성 검사에서 통과하면 플래그 변수의 값을 true로 변경
			isValidated = true;
		}
		
		// 4. 유효성 검사 결과 출력
		// if(isValidated) == if(isValidated == true)
		// if(!isValidated) == if(isValidated == false)
		if(isValidated) {
			System.out.println("사용가능한 아이디입니다.");
		} else {
			System.out.println("아이디는 8자리에서 20자리 사이로 지정해주세요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
