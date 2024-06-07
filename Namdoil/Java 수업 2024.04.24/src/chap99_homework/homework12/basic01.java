package chap99_homework.homework12;

public class basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요. 
//		PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.
        
		
        PrintNumber printNumber = (int[] numArr) -> {
            for (int num : numArr) {
                if (num % 2 == 0) { // 짝수인지 확인
                    System.out.println(num); // 짝수인 경우 출력
                }
            }
        };

        // 테스트 배열 정의
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // printEvenNum 메소드 호출
        printNumber.printEvenNum(numbers);
    }
    
    
}