package chap99_homework.homework02;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. int 값을 하나 매개변수로 전달받아서 1부터 매개변수로 전달된 값까지의 총합을 구해서 
//		총합을 리턴하는 메소드를 구현하세요. 실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. 
//		static의 위치는 접근제어자와 리턴타입 사이입니다. 
//		(예시 public static void add(int a, int b) { return a + b; })
		System.out.println(getSum(11));
		
//		2. ConcatString 클래스를 하나 만들고 String 타입의 값 2개를 매개변수로 받아서 
		//문자열 결합을 진행하고 
//		결합된 문자열을 리턴하는 메소드를 구현하세요. 

//		3. 2번에서 만든 메소드를 오버로딩해서 String 타입의 값 2개와 int 타입의 값 1개를 
		//매개변수로 받아서 
//		문자열 결합을 진행하고 결합된 문자열을 리턴하는 메소드를 구현하세요.
		ConcatString concatString = new ConcatString();
		
		System.out.println(concatString.concat("abcd", "efg"));
		System.out.println(concatString.concat("aaa", "bbb", 11));

//		4. int 배열 한 개를 매개변수로 받아서 인덱스 역순으로 출력하는 메소드를 구현하세요. 
//		실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. static의 위치는 접근제어자와 리턴타입 사이입니다. 
//		(예시 public static void add(int a, int b) { return a + b; })
		int[] intArr = {1, 2, 3, 4, 5};
		
		printReverse(intArr);
	}
	
	public static int getSum(int num) {
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void printReverse(int[] arr) {
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
