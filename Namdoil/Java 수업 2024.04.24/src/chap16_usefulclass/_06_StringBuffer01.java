package chap16_usefulclass;

public class _06_StringBuffer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. StringBuffer 객체 생성
		// 버퍼 크기가 16인 StringBuffer 객체 생성
		StringBuffer sb1 = new StringBuffer();
		
		// 버퍼 크기가 32인 StringBuffer 객체 생성

		StringBuffer sb2 = new StringBuffer(32);
		

		// bitcamp라는 문자열 값을 갖는 StringBuffer 객체 생성
		StringBuffer sb3 = new StringBuffer("bitcamp");
		StringBuffer sb4 = new StringBuffer("bitcamp");
		
		// capacity(): StringBuffer에 버퍼의 크기를 리턴하는 메소드
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());

		// length(): StringBuffer에 저장되어 있는 문자열의 길이를 리턴하는 메소드
		System.out.println(sb3.length());
		
		// 2. StringBuffer에서는 equals메소드가 오버라이드 되어 있지 않아서
		// 같은 객체인지를 비교한다.
		System.out.println(sb3.equals(sb4));
		
		// StringBuffer의 문자열 값을 비교하려면 String타입으로 변환 후에 equals 메소드를 사용해서 비교한다.
		// StringBuffer를 String타입으로 변환할 때는 toString() 메소드 사용
		System.out.println(sb3.toString().equals(sb4.toString()));
		
		

	}

}
