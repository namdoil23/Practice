package chap22_lambda;

import chap22_lambda.reference.Academy;
import chap22_lambda.reference.ComputerAcademy;
import chap22_lambda.reference.EnglishAcademy;
import chap22_lambda.reference.MathAcademy;

public class _10_ReferenceConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 생성자 참조하지 않고 람다식으로 구성
		Academy academy = createComputerAcademy(() -> new Academy());
		
		// 2. 생성자 참조
		// 생성할 객체의 클래스명::new
		// 함수형 인터페이스에 선언한 추상메소드의 매개변수의 개수, 타입, 순서가 같은 생성자를 참조해서 사용한다.
		Academy computerAcademy = createComputerAcademy(Academy::new);
		Academy englishAcademy = createEnglishAcademy(Academy::new);
		
		// 3. 함수형 인터페이스의 추상메소드의 매개변수 개수, 타입, 순서가 같은
		// 생성자가 존재하지 않으면 에러가 발생한다.
//		Academy mathAcademy = createMathAcademy(Academy::new);
		
		// 람다식으로는 구성할 수 있다.
		Academy mathAcademy = createMathAcademy((sub, sCnt, lTime) -> {
			Academy aca = new Academy(sub, sCnt);
			aca.setLectureTime(lTime);
			return aca;
		});
		
		computerAcademy.lectureInfo();
		englishAcademy.lectureInfo();
		mathAcademy.lectureInfo();
	}
	
	public static Academy createComputerAcademy(ComputerAcademy computerAcademy) {
		return computerAcademy.getComputerAcademy();
	}
	
	public static Academy createEnglishAcademy(EnglishAcademy englishAcademy) {
		return englishAcademy.getEnglishAcademy("영어", 30);
	}
	
	public static Academy createMathAcademy(MathAcademy mathAcademy) {
		return mathAcademy.getMathAcademy("수학", 50, 90L);
	}
	
	
	
	
	
	
	
	
	
}
