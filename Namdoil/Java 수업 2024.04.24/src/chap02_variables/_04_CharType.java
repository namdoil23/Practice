package chap02_variables;

public class _04_CharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. char 타입의 변수 선언 및 초기화
		char ch1 = 'A';
		
		// 유니코드 값을 알고 있으면 유니코드 값으로 저장가능
		char ch2 = 65;
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// 2. 유니코드 값을 모르는 문자의 유니코드 값 추출
		char ch3 = '자';
		
		System.out.println((int)ch3);
		
		int unicode = '자';
		System.out.println(unicode);
		
		// 문자 하나는 작은 따옴표로 표시하고 char 타입의 변수에 할당하지만
		// 문자열(String 클래스 사용)은 큰 따옴표로 표시한다(참조 타입 변수에 저장).
		String str = "java";
		
		// 3. 유니코드에는 완전한 빈칸이 없어서 빈칸을 char 타입의 변수에 저장하면 에러가 발생한다.
//		char ch4 = '';
		// char 타입에서 빈 칸을 사용하려면 스페이스 값을 저장해야 한다.
		char ch5 = ' ';
		// 문자열(String) 타입에서는 완전 빈 칸을 사용할 수 있다.
		String empty = "";
		
		
		
		
		
		
		
		
		
	}

}
