package chap99_homework.homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고 
//		List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), 
//		(5, 이순신, 95)를 저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.

// 		2. 1번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
		List<Student> sList = 
					new ArrayList<Student>();
		
		sList.add(new Student(1, "홍길동", 100));
		sList.add(new Student(2, "임꺽정", 75));
		sList.add(new Student(3, "장길산", 86));
		sList.add(new Student(4, "정도전", 97));
		sList.add(new Student(5, "이순신", 95));
		
//		Stream<Student> sStream = sList.stream();
//		
//		Stream<Student> aPlusStream =
//				sStream.filter(student -> 
//								student.getScore() >= 95);
//		
////		aPlusStream.forEach(student -> 
////				System.out.println(student.toString()));
//		System.out.println("----------------------------");
//		
//		Stream<Student> aStream =
//				aPlusStream.map(student -> {
//					student.setGrade("A+");
//					return student;
//				});
//		
//		aStream.forEach(student ->
//				System.out.println(student.toString()));
		
		//체이닝기법
		sList.stream()
			 .filter(s -> s.getScore() >= 95)
//			 .map(s -> {
//				 s.setGrade("A+");
//				 return s;
//			 })
			 .forEach(s -> {
				s.setGrade("A+");
	 			s.studentInfo();
			  });
		System.out.println("----------------------------");


// 		3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 
//		스트림을 이용해서 영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
		Scanner sc = new Scanner(System.in);

		List<Character> charList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("영문자 하나를 입력하세요.");
			charList.add(sc.nextLine().charAt(0));
		}
		System.out.println(charList);
		
//		Stream<String> strStream =
//					strList.stream();
//		
//		Stream<String> strStream2 = 
//					strStream.filter(str -> {
//						for(int i = 0; i< str.length(); i++) {
//							if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ||
//								(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
//								return true;
//							}
//						}
//						return false;
//					});
//		
//		strStream2.forEach(str ->
//				System.out.println(str));
		
		//체이닝기법
		charList.stream()
			   .map(ch -> {
				   if(ch >= 'A' && ch <= 'Z') {
					   ch = (char)(ch + 32);
				   } else if(ch >= 'a' && ch <= 'z') {
					   ch = (char) (ch - 32);
				   }
				   
				   return ch;
			   })
			   .forEach(ch -> System.out.println(ch));
			   
		System.out.println("--------------------------");
		
		sc.close();
	}
}
