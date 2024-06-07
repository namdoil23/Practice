package chap99_homework.homework98;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static chap99_homework.homework98.ReturnClass.retuString;
import static chap99_homework.homework98.ReturnInt.IntMul;

public class Page2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		--------------------배열--------------------
//		1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
//
//		int[] intArr = new int[10];
//		for(int i = 0; i < intArr.length; i++) {
//			intArr[i] = i + 1;
//			
//			System.out.println(intArr[i]);
//		}
		
	


//		2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
//		
//		        Scanner sc = new Scanner(System.in);
//		        ArrayList<Integer> arrList = new ArrayList<>();
//		        제네릭 클래스 ArrayList<>는 객체 타입만을 허용합니다. 기본 타입인 int는 객체가 아니므로 ArrayList<int>는 사용할 수 없습니다. 
//		        대신, 기본 타입 int의 래퍼 클래스인 Integer를 사용해야 합니다.
//		        
//		        배열의 크기를 미리 정할 수 없으므로 동적으로 크기를 조정할 수 있는 ArrayList를 사용합니다.
//		        int[] arr = new int[2]; // 초기 배열 크기를 작게 설정
//		        int size = 0;
//
//		        while (true) {
//		            System.out.println("정수를 입력하세요 (q를 입력시 종료):");
//
//		            if (sc.hasNextInt()) {
//		                int userNum = sc.nextInt();
//
//		                // 배열이 꽉 찼으면 크기를 두 배로 늘림
//		                if (size == arr.length) {
//		                    int[] newArr = new int[arr.length * 2];
//		                    System.arraycopy(arr, 0, newArr, 0, arr.length);
//		                    arr = newArr;
//		                }
//
//		                arr[size++] = userNum;
//		            } else
//		        while (true) {
//		            System.out.println("정수를 입력하세요 (q를 입력시 종료):");
////					
//		            // 입력이 정수인지 확인
//		            if (sc.hasNextInt()) {
//		                int userNum = sc.nextInt();
//		                //ArrayList의 끝에 추가됩니다.
//		                arrList.add(userNum);
//		            } else {
//		                String input = sc.next();
//		                // 값 비교 (두 문자열의 실제 값이 같은지 비교)
//		                //만약 ==를 사용하면, 두 문자열이 같은 객체인지(참조가 동일한지)를 비교하게 되어
//		                if (input.equals("q")) {
//		                    System.out.println("프로그램을 종료합니다.");
//		                    break;
//		                } else {
//		                    System.out.println("유효한 정수를 입력하세요.");
//		                }
//		            }
//		        }
//
//		        // 배열의 모든 요소를 출력
//		        System.out.println("입력된 정수:");
////		        향상된 for 루프는 내부적으로 배열이나 컬렉션의 모든 요소에 대해 반복을 수행합니다.
//		        for (int num : arrList) {
//		            System.out.println(num);
//		        }
////		        일반 for 루프를 사용하여 ArrayList의 모든 요소 출력
//		        System.out.println("입력된 정수:");
//		        for (int i = 0; i < arrList.size(); i++) {
////		        	Integer 객체를 반환합니다. 그러나 int num 변수에 할당될 때, 자동 언박싱이 발생하여 
////		        	Integer 객체가 기본 타입 int로 변환됩니다.
//		            int num = arrList.get(i);
//		            System.out.println(num);
//		        }
//		        sc.close();
				
			
		

//
//		3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
//		Scanner sc = new Scanner(System.in);        
//        int[] intArr1 = new int[10];
//        int sum = 0;
//
//        System.out.println("10개의 정수를 입력하세요:");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print((i + 1) + "번째 정수: ");
//            intArr1[i] = sc.nextInt();
//            sum += intArr1[i];
//        }
//
//        double average = sum / 10.0;
//
//        System.out.println("입력한 정수들의 평균은: " + average);
		        
	
	
//
//		4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
//       Scanner sc = new Scanner(System.in);
//       ArrayList<Integer> arrList = new ArrayList<>();
//       int sum = 0;
//       
//       for(int i = 1; i <= 100; i++) {
//    	   if(i % 2 == 0) {
//    	     arrList.add(i);
//    	     sum += i;
//    	   }
//       }
//       System.out.println("1부터 100까지의 짝수 배열: " + arrList);
//       System.out.println("1부터 100까지의 짝수의 합: " + sum);
       
//
//		5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
//		  Scanner sc = new Scanner(System.in);
//        int[] intArr = new int[10];
//
//        System.out.println("10개의 정수를 입력하세요:");
//
//        // 사용자로부터 10개의 정수를 입력받아 배열에 저장
//        for (int i = 0; i < 10; i++) {
//            System.out.print((i + 1) + "번째 정수: ");
//            intArr[i] = sc.nextInt();
//        }
//
//        // 배열의 첫 번째 값을 최소값 및 최대값으로 초기 설정
//        int min = intArr[0];
//        int max = intArr[0];
//
//        // 배열을 순회하면서 최소값과 최대값을 찾음
//        for (int i = 1; i < intArr.length; i++) {
//            if (intArr[i] < min) {
//                min = intArr[i];
//            }
//            if (intArr[i] > max) {
//                max = intArr[i];
//            }
//        }
//
//        // 최소값과 최대값 출력
//        System.out.println("입력한 정수들의 최소값: " + min);
//        System.out.println("입력한 정수들의 최대값: " + max);
       
       
//
//		6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
//
//        Scanner sc = new Scanner(System.in);
//        String[] arrStr = new String[5];
//        
//        System.out.println("5개의 문자열을 입력하세요.");
//        for(int i = 0; i < 5; i++){
//        	arrStr[i] = sc.nextLine();        
//        }
//        int minLength = arrStr[0].length();
//        int maxLength = arrStr[0].length();
//        String min = arrStr[0];
//        String max = arrStr[0];
//        
//        for(int i = 1; i < arrStr.length; i++){
//        	if (arrStr[i].length() < minLength) {
//        		minLength = arrStr[i].length();
//        		min = arrStr[i];
//        	}
//        	
//        	if (arrStr[i].length() > maxLength) {
//        		maxLength = arrStr[i].length();
//        		max = arrStr[i];
//        	}
//        }
//        
//        
//        System.out.println("길이가 작은 문자열은:" + min);
//        System.out.println("길이가 긴 문자열은:" + max);
        
        
        
//		7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 
//        첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 
//        새로운 배열을 생성하세요.
//        int[] intArr1; 
//        int[] intArr2;		
//        
//        intArr1 = new int[4];
//        intArr2 = new int[3];
//        
//        for(int i = 0; i < intArr1.length; i++) {
//        	intArr1[i] = (int) (Math.random() * 100) + 1;
//        	System.out.println(intArr1[i] + " ");
//        }
//        System.out.println("--------------------");
//        for(int i = 0; i < intArr2.length; i++) {
//        	intArr2[i] = (int) (Math.random() * 100) + 1;
//        	System.out.println(intArr2[i] + " ");
//        }
////        System.out.println(intArr1);
////        System.out.println(intArr2);
////        System.out.println(Arrays.toString(intArr1));
////        System.out.println(Arrays.toString(intArr2));
//        int[] combinedArr = new int[intArr1.length + intArr2.length];
//        
//        // 첫 번째 배열의 요소를 새로운 배열에 복사
//        int index = 0;
//        for(int i = 0; i < intArr1.length; i++) {
//            combinedArr[index++] = intArr1[i];
//        }
//        
//        // 두 번째 배열의 요소를 새로운 배열에 복사
//        for(int i = 0; i < intArr2.length; i++) {
//            combinedArr[index++] = intArr2[i];
//        }
//        
//        // 합친 배열 출력
//        for(int num : combinedArr) {
//            System.out.print(num + " ");
//        
//        }
        
//		8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. 
//        -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
//		    가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
//        Scanner sc = new Scanner(System.in);
//        
//        // 사용자로부터 문자열 입력받기
//        System.out.println("문자열을 입력하세요 (구분자는 - 입니다):");
//        String userStr = sc.nextLine();
//        
//        // 입력받은 문자열을 '-'로 분할하여 배열 생성
//        String[] strArr = userStr.split("-");
//        
//        // 가장 긴 문자열과 그 인덱스를 저장할 변수 초기화
//        int maxLengthIndex = 0;
//        String maxLengthStr = strArr[0];
//        
//        // 배열을 순회하면서 가장 긴 문자열 찾기
//        for (int i = 1; i < strArr.length; i++) {
//            if (strArr[i].length() > maxLengthStr.length()) {
//                maxLengthIndex = i;
//                maxLengthStr = strArr[i];
//            }
//        }
//        
//        // 결과 출력
//        System.out.println("가장 긴 문자열의 인덱스: " + maxLengthIndex);
//        System.out.println("가장 긴 문자열: " + maxLengthStr);
//        
//        sc.close();
        
		
//
//		--------------------클래스--------------------
//		1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
//
//		Student student = new Student("고기천", 92959, "컴공");
//		student.printStudentInfo();

		
//		2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
//		Libary library = new Libary("고기천의 삶", "고기천", "고출판사", 500);
//		library.printLibaryInfo();
		
//
//		3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
//		String str1 = "gomahaera";
//		String str2 = "마이 묵읐다";
//		String result = retuString(str1,str2);
//		System.out.println(result);
		
		
//
//		4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
//		int i = 5;
//		double d = 3.1414;
//		double IntMulResult	= IntMul(i,d);
//		System.out.println(IntMulResult);


//		5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
//		double radios = 5.0;
//
//		Circle circle = new Circle(radios);
//
//		System.out.println("원의 반지름" + radios);
//		System.out.println("원의 넓이" + circle.getArea());
//		System.out.println("원의 둘레" + circle.getPerimeter());



//		6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.






//
//		7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요. 
//		    그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요. 
//
//
//		--------------------상속--------------------
//		1. 성씨, 혈액형, 키, 피부색을 속성으로 가지는 Parent 클래스를 생성하고 Parent를 상속받은 ChildA, ChildB 클래스를 만들어서
//		    ChildA에는 이름 속성을 추가하고 ChildB에는 지문 속성을 추가하세요.
//
//		2. 일한 시간, 시간당 급여를 속성으로 갖는 알바라는 클래스를 만들고 일한다(일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다. 라고 출력하는)를 메소드로 만드세요.
//		   알바를 상속받는 캐셔와 쿠팡맨 클래스를 만들고 일한다 메소드를 오버라이딩하여 캐셔는 "캐셔는 일한 시간동안 계산해서 일한 시간 * 시간당 급여를 받는다."
//		   쿠팡맨은  "쿠팡맨은 일한 시간동안 배송해서 일한 시간 * 시간당 급여를 받는다."라고 출력하도록 구현하세요. 일한 시간과 시간당 급여는 생성자에서 초기화합니다.
//
//		3. 근로자를 인터페이스로 생성하고 출근하다, 퇴근하다, 일한다. 메소드를 선언합니다. 근로자를 상속받은 개발자와 공무원 클래스 만들고 상속받은 세 개의 메소드를 
//		    본인이 원하는 대로 구현하세요.
//
//		4. 게시판 인터페이스를 구현하고 게시글 저장, 수정, 삭제, 조회 메소드를 만들고 게시판을 상속받는 자유게시판과 공지게시판 클래스를 만들어서 네 개의 메소드를 본인이
//		    원하는 대로 구현하세요.
//
//
//		--------------------컬렉션--------------------
//		1. Map을 이용하여 영어 단어와 뜻을 저장하고 사용자가 입력한 단어의 뜻을 출력하세요.
//
//		2. Map을 이용해서 음식 이름과 가격을 저장하고 사용자가 입력한 음식의 이름과 수량으로 최종 금액을 출력하세요.
//
//		3. Map을 이용해서 학생의 이름과 점수를 저장하고 점수가 90점 이상인 학생의 이름을 모두 출력하세요.
//
//		4. 3번에서 사용한 Map에서 점수가 가장 높은 학생의 이름과 점수를 출력하세요.
//
//		5. List에 문자열을 저장하고 사용자가 입력한 문자열을 검색하여 해당 문자열의 인덱스를 출력하세요.
//
//		6. List에 정수 10개를 저장하되 중복 값을 1개 이상 포함시키고 Set으로 옮겨서 모든 요소를 출력하세요.
//
//		7. 현대차의 차종과 판매량을 저장하는 Map 한 개와 기아차의 차종과 판매량을 저장하는 Map 한 개를 만들어서
//		    List에 둘 다 저장합니다. 회사별로 가장 판매량이 높은 차종의 Entry를 뽑아서 새로운 List에 저장하고 
//		    출력하세요. (현대 차종은 아반떼, 소나타, 그랜저 기아 차종은, k5, k7, k9, 판매량은 마음대로 정하시면 됩니다.)

	
	}
	
}
