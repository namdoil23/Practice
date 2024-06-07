package chap02_variables;

public class _01_Variables {
	static int classCnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 변수의 선언
		// 1-1. 변수의 선언은 자료형 + 변수명
		// 좋아요 개수를 저장하는 변수
		int likeCnt;
		// 로그인한 사용자가 좋아요를 눌렀는지 여부를 저장하는 변수
		boolean isUserLike;
		
		
		// 1-2. 변수명 첫 글자는 문자, $, _만 허용된다.
		int price;
		int _bit;
		int $company;
		
		// 문자, $, _가 아닌 다른 기호, 숫자가 첫 글자로 오면 에러가 발생한다.
		// 단일 행 주석처리: ctrl + /
		// 다중 행 주석처리: ctrl + shift + /
		/*
		 * int 1price; int @bit; int %company;
		 */
		
		// 1-3. 카멜케이스 표기법 사용
		// 게시물 개수
		int boardCnt;
		// 출력횟수
		int printCnt;
		
		
		// 1-4. 대소문자를 구분한다.
		int lunchTime;
		int luNchTime;
		int lunchtime;
		
		// 1-5. 본인만 알아볼수 있는 변수명을 사용하지 않는다.
		int nuri;
		int aaa;
		int bbb;
		
		// 2. 변수의 사용
		// 2-1. 변수에 값 저장(할당)
		// 변수에 값을 최초로 저장하는 것을 초기화라고 한다.
		likeCnt = 1500;
		// syso + ctrl + space + enter
		// sout(인텔리제이)
		// 변수에 저장되어 있는 값을 사용
		System.out.println(likeCnt);
		
		// 변수의 값 재할당(값의 변경)
		likeCnt = 100;
		System.out.println(likeCnt);
		
		// 2-2. 변수의 선언과 동시에 초기화
		int studentCnt = 29;
		
		// 2-3. 선언된 변수에는 지정된 자료형의 값만 저장할 수 있다.
//		studentCnt = 11.11;
		
		// 2-4. 초기화(값이 저장되지 않은)되지 않은 변수를 사용하면 에러가 발생한다.
		int errorVal;
//		System.out.println(errorVal);
		
		
		classCnt = 100;
		
		
		
		
		
		
		
		
	}
	
//	static void sub() {
//		System.out.println(studentCnt);
//		System.out.println(classCnt);
//	}
}
