package chap20_enum.enums;

// 1. enum의 정의는 클래스의 정의와 동일하다.
public enum DefaultMonth {
	// 2. 상수 변수 생성
	// 값을 지정하지 않으면 0부터 1씩 증가하는 값이 자동으로 지정된다.
	// 기본적으로 public static final 형태로 만들어지기 때문에 값이 자동으로 지정되고 값을 변경할 수 없다.
	// 사용할 때는 enum 클래스의 이름.상수변수명
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}
