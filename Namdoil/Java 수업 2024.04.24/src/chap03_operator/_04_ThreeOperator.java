package chap03_operator;

public class _04_ThreeOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 삼항 조건연산자
		int num1 = 111;
		int num2 = 10;
		
		int result = num1 / num2 < 0 ? num1 - 11 : num2 - 11;
		System.out.println(result);
		
		// 2. 삼항 조건연산자의 중첩
		result = num1 / num2 > 8
				 ?
					num1 - 11 == 100
					?
						num1 * 2
					:
						num1 / 2
				 :
					 num2 - 11 < 0
					 ?
						num2 * 2
					 :
						num2 / 2;
		System.out.println(result);
		
		// 3. 대문자는 소문자로 소문자는 대문자로 바꿔서 출력
		char ch = 'd';
		
		char convertChar = ch >= 'A' && ch <= 'Z'
						   ?
								(char)(ch + 32)
						   :
							   ch >= 'a' && ch <= 'z'
							   ?
							       (char)(ch - 32)
							   : ch;
		System.out.println(convertChar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
