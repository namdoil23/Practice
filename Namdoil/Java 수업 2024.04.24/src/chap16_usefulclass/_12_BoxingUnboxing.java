package chap16_usefulclass;

import java.util.ArrayList;
import java.util.List;

public class _12_BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		
		// 1. 박싱(boxing): 기본 타입의 값을 래퍼클래스의 객체형태로 포장해주는 작업
		Integer objNum1 = (Integer)num1;
		
		// 2. 자동 박싱: 컴파일러가 알아서 기본 타입의 값을 래퍼클래스의 객체로 변환하는 기능
		Integer objNum2 = objNum1 + num1;
		
		// 3. 언박싱(boxing): 래퍼클래스 객체에 저장되어 있는 값을 포장을 해체하여 기본타입의 값으로 변환하는 작업
		int num2 = (int)objNum2;
		
		// 4. 자동 언박싱: 컴파일러가 알아서 래퍼클래스의 객체에 저장되어 있는 값을 기본타입 값으로 변환해주는 기능
		int num3 = num2 + objNum2;
		
		// 5. 메소드에서의 박싱, 언박싱
		printObjNum(1000);
		
		printPrimitiveNum(objNum2);
		
		// 6. 제네릭에서의 박싱
		List<Integer> intList = new ArrayList<>();
		
		intList.add(30);
		
		System.out.println(intList.get(0).getClass().getSimpleName());
		
	}
	
	public static void printObjNum(Integer integer) {
		System.out.println(integer);
	}
	
	public static void printPrimitiveNum(int intVal) {
		System.out.println(intVal);
	}

}
