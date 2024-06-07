package chap99_homework.homework98;

import java.util.Scanner;

public class Page1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
//
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
//
//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//		    단, 원주율 3.14는 상수로 선언하세요.
//
//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
//
//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
//
//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
		
//		1.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.");
//		String name = sc.nextLine();
//		System.out.println("나이를 입력하세요.");
//		int age = sc.nextInt();
//		sc.nextLine();
//		System.out.println("성별을 입력하세요");
//		String sex = sc.nextLine();
//	 
//		System.out.println("이름:" + name); 
//		System.out.println("나이:" + age);
//		System.out.println("성별:" + sex);
//		sc.close();
		
		
//		2.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요.");
//		int a = sc.nextInt();
//		System.out.println("두번째 정수를 입력하세요.");
//		int b = sc.nextInt();
//		System.out.println("연산자를 입력하세요.(+, -, *, /)");
//		char operate = sc.next().charAt(0);
//
//		double result = 0;
//		
//		switch(operate) {
//			case '+':
//				result = a + b;
//				break;
//			case '-':
//				result = a - b;
//				break;
//			case '*':
//				result = a * b;
//				break;
//			case '/':
//				if(b != 0) {
//				result = (double)a / b;
//				}else {
//					System.out.println("0으로는 나눌수 없습니다.");
//					return;
//				}
//				break;
//			default:
//				System.out.println("보기의 연산자를 사용하세요.");
//				return;
//		
//		
//		
//		}
//		
//		System.out.println("연산하신 값은" + result + "입니다.");
//		
//		sc.close();
		
//		3.
		
//		final double PI;
//		PI = 3.14;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("원의 반지름을 입력하세요.");
//		double R = sc.nextInt();
//		double around = 2*PI*R*R;
//		double H = 4*PI*R;
//		System.out.println("입력하신 반지름의 원의 넓이는: " + around + " 둘레는 " + H);
		
//		4.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요.");
//		int a = sc.nextInt();
//		System.out.println("두번째 정수를 입력하세요.");
//		int b = sc.nextInt();
//		System.out.println("세번째 정수를 입력하세요.");
//		int c = sc.nextInt();
//		System.out.println("네번째 정수를 입력하세요.");
//		int d = sc.nextInt();
//		System.out.println("다섯번째 정수를 입력하세요.");
//		int e = sc.nextInt();
//		
//		int sum = a+b+c+d+e;
//		int avg = sum/5;
//		System.out.println("총합:" + sum + "평균:" + avg);
//		int min, max, middle;
//		min = a;
//		if(b < min) min = b;
//		if(c < min) min = c;
//		if(d < min) min = d;
//        if (e < min) min = e;
//
//        // 최대 값 찾기
//        max = a;
//        if (b > max) max = b;
//        if (c > max) max = c;
//        if (d > max) max = d;
//        if (e > max) max = e;
//
//        // 중간 값 찾기
//        if ((a >= b && a <= c || (a <= b && a >= c))) middle = a;
//        else if ((b >= a && b <= c) || (b <= a && b >= c)) middle = b;
//        else middle = c;
//        if (d >= middle && d <= e) {
//            middle = d;
//        } else if (e >= middle && e <= d) {
//            middle = e;
//        }        // 결과를 출력합니다.
//        System.out.println("최소 값: " + min);
//        System.out.println("중간 값: " + middle);
//        System.out.println("최대 값: " + max);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("출력할 단을 입력하세요.");
//		int dan = sc.nextInt();
//		
//		for(int i = 1; i < 10; i++) {
//			
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//			
//	7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int end = sc.nextInt();
//		long f = 1;
//		for(int i = 1; i <= end; i++) {
//			f *= i;
//		}
//		System.out.println(end +"의 팩토리얼은" + f);
		
		
//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("10개의 정수를 입력하세요:");
//        int primeCount = 0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + "번째 정수를 입력하세요: ");
//            int num = scanner.nextInt();
//            
//            // 소수 판별
//            boolean isPrime = true;
//            if (num <= 1) {
//                isPrime = false;
//            } else {
//                for (int j = 2; j <= Math.sqrt(num); j++) {
//                    if (num % j == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//            }
//
//            // 소수인 경우 소수 개수 증가
//            if (isPrime) {
//                primeCount++;
//            }
//        }

        // 결과를 출력합니다.
//        System.out.println("입력한 10개의 정수 중 소수의 개수는 " + primeCount + "개 입니다.");
//
//        scanner.close();
		
//        1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("첫번째 정수를 입력하세요. ");
//        String str1 = scanner.nextLine();      
//        System.out.println("두번째 정수를 입력하세요. ");
//        String str2 = scanner.nextLine();  
//        
//        int num1 = Integer.parseInt(str1);
//        int num2 = Integer.parseInt(str2);
//        
//        int result = num1 + num2;
//        System.out.println("결과값: " + result);
        
        
        
//        2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
//		  Scanner scanner = new Scanner(System.in);
//		  System.out.println("첫번째 정수를 입력하세요. ");
//          int a = scanner.nextInt(); 
//          System.out.println("두번째 정수를 입력하세요. ");
//          int b = scanner.nextInt(); 
//          
//          while(true){
//          if( b != 0 ) {
//        	double result = a / b;
//        	System.out.println(result);
//        	break; 
//          }else {
//        	  System.out.println("b는 0을 입력할 수 없습니다.");
//          }
//          }scanner.close();
          
//
//        3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
//		  Scanner scanner = new Scanner(System.in);
//		  System.out.println("실수를 입력하세요. ");
//          double a = scanner.nextDouble();
//          System.out.println("변환된 정수는:" + (int)a); 
//          scanner.close();
//
//        4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
//		  Scanner scanner = new Scanner(System.in);
//		  System.out.println("실수를 입력하세요. ");
//		  double a = scanner.nextDouble();
//		  double result = a*a;
//		  String result2 = Double.toString(result);
//		  System.out.println(result2);
		
//
//        5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
		
//		int iNum = 10;
//		long lNum = 20L;
//		
//		int iNum1 = (int)lNum; 
//		long lNum1 = (long)iNum;
//		
//		System.out.println(iNum1);
//		System.out.println(lNum1);
//
//        6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번째문자를 입력하세요. ");
//		String str1 = scanner.nextLine();
//		System.out.println("두번째문자를 입력하세요. ");
//		String str2 = scanner.nextLine();
//        
//		char[] cha1 = str1.toCharArray();
//		char[] cha2 = str2.toCharArray();
//		
//		System.out.println("입력하신 첫번재 문자의 유니코드:" + cha1);
//		System.out.println("입력하신 두번재 문자의 유니코드:" + cha2);

//		1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//		  (메소드로 따로 만들지 말고 메인메소드에서 구현)
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요. ");
//        int a = scanner.nextInt(); 
//        System.out.println("두번째 정수를 입력하세요. ");
//        int b = scanner.nextInt(); 
//        int sum = a + b;
//        int sub = a - b;
//        int mul = a * b;
//        int div = a / b;
//        
//        
//        System.out.println("두 수의 + 값:" + sum);
//        System.out.println("두 수의 - 값:" + sub);
//        System.out.println("두 수의 * 값:" + mul);
//        System.out.println("두 수의 / 값:" + div);
        
		
//
//		2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 21, 22, 22, 21, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
//
//		int a = 20;			
//		
//			System.out.println(++a);	//21	21	
//			System.out.println(++a);	//22	22
//			System.out.println(a);		//22	22
//			System.out.println(--a);	//21	21
//			System.out.println(--a);	//20	20
//			System.out.println(a--);
//			System.out.println(a++);
//		
//			System.out.println(a);
		
//		3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수를 입력하세요. ");
//		int a = scanner.nextInt(); 
//			if (a % 14 == 0) {
//				System.out.println("2와 7의 공배수");
//			}else {
//				System.out.println("2와 7의 공배수가 아님");
//			}	
//		4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
//		Scanner scanner = new Scanner(System.in);
//		System.err.println("문자열을 입력하세요");
//		String str = scanner.nextLine();
//		String str2 = "Hello";
//		if (str.equals(str2)) {
//			System.out.println("입력받은 문자열은 Hello입니다");
//		}else {
//			System.out.println("입력받은 문자열은 Hello가 아닙니다.");
//		}
	
//
//		5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수를 입력하세요. ");
//		int a = scanner.nextInt(); 
//		String result = (a % 2 == 0) ? "짝수" : "홀수";
//		System.out.println(a + "는" + result +"입니다");
//
//		6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수를 입력하세요. ");
//		int a = scanner.nextInt(); 
//		String result = (a > 100) ? "100보다 큼" : "100보다 작음";
//		System.out.println(a + "는" + result);
		
		
//		7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요. ");
//        double a = scanner.nextInt(); 
//        System.out.println("두번째 정수를 입력하세요. ");
//        double b = scanner.nextInt(); 
//        double sum = a + b;
//        double sub = a - b;
//        double mul = a * b;
//        double div = a / b;
//        
//        
//        System.out.println("두 수의 + 값:" + sum);
//        System.out.println("두 수의 - 값:" + sub);
//        System.out.println("두 수의 * 값:" + mul);
//        System.out.println("두 수의 / 값:" + div);
//
//		8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.	
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수를 입력하세요. ");
//		int a = scanner.nextInt(); 
//		scanner.nextLine();
//		System.out.println("문자열을 입력하세요");
//		String str = scanner.nextLine();
//		
//		
//		System.out.println("입력한 문자열은" + str + "입력한 숫자는" + a);
		
//		1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요. ");
//        int a = scanner.nextInt(); 
//        System.out.println("두번째 정수를 입력하세요. ");
//        int b = scanner.nextInt(); 
//        if (a > b) {
//        	System.out.println(a);
//        }else {
//        	System.out.println(b);
//        }
		
		
//
//		2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요. ");
//        int a = scanner.nextInt(); 
//        
//        if (a >=0 ) {
//        	System.out.println("양수");
//        }else {
//        	System.out.println("음수");
//        }
		
		
		
//
//		3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세 
//		     요."를 출력하세요.(switch~case~default 사용)
//		Scanner scanner = new Scanner(System.in);
//		System.err.println("문자열을 입력하세요");
//		String str = scanner.nextLine();
//		
//		switch(str) 
//		{
//		case "Java":
//			System.out.println("좋아하는 언어입니다.");
//			break;
//		case "Python":
//			System.out.println("공부중인 언어입니다.");	
//			break;
//		default :	
//			System.out.println("다른 언어를 공부해보세요.");
//			break;
//		}
		
		
//
//		4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
//
//		Scanner scanner = new Scanner(System.in);
//		System.err.println("숫자를 입력하세요");
//		int a = scanner.nextInt();
//		switch(a % 3) 
//		{
//		case 0:
//			System.out.println("3의 배수입니다.");
//			break;
//		default :	
//			System.out.println("3의 배수가 아닙니다.");
//			break;
//		}
		
		
//		5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수를 입력하세요. ");
//		int a = scanner.nextInt();
//		switch(a % 2) 
//		{
//		case 0:
//			System.out.println("짝수입니다.");
//			break;
//		default :	
//			System.out.println("홀수입니다.");
//			break;
//		}
		
		
//
//		6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번쨰 정수를 입력하세요. ");
//		int a = scanner.nextInt();
//		System.out.println("두번쨰 정수를 입력하세요. ");
//		int b = scanner.nextInt();
//		System.out.println("세번쨰 정수를 입력하세요. ");
//		int c = scanner.nextInt();
//		System.out.println("네번쨰 정수를 입력하세요. ");
//		int d = scanner.nextInt();
//		System.out.println("다섯번쨰 정수를 입력하세요. ");
//		int e = scanner.nextInt();
//		int max = a;
//		if (b > max) {
//			max = b;
//		}
//		if (c > max) {
//			max = c;
//		}
//		if (d > max) {
//			max = d;
//		}
//		if (e > max) {
//			max = e;
//		}
//		
//		System.out.println("입력값 중 최대값:" + max);
		
	
		
//
//		7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요");
//		String str = scanner.nextLine();
//		
//		switch(str) 
//		{
//		case "Yes":
//			System.out.println("예");
//			break;
//		case "No":
//			System.out.println("아니오");	
//			break;
//		default :	
//			System.out.println("잘못 입력하셨습니다.");
//			break;
//		}
		
	
//		8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요. ");
//        int a = scanner.nextInt(); 
//        System.out.println("두번째 정수를 입력하세요. ");
//        int b = scanner.nextInt(); 
//        
//        if (a == b) {
//            System.out.println("두 수가 같습니다.");
//        } else if (a > b) {
//            System.out.println("첫 번째 수가 더 큽니다.");
//        } else {
//            System.out.println("두 번째 수가 더 큽니다.");
//        }
		
		
//		9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요. ");
//        int a = scanner.nextInt(); 
//        System.out.println("두번째 정수를 입력하세요. ");
//        int b = scanner.nextInt(); 
//        System.out.println("세번째 정수를 입력하세요. ");
//        int c = scanner.nextInt(); 
//		
//        int evenCount = 0;
//        int oddCount = 0;
//        
//        if(a % 2 == 0) evenCount++; else oddCount++;
//        if(b % 2 == 0) evenCount++; else oddCount++;
//        if(c % 2 == 0) evenCount++; else oddCount++;
//        
//        if (evenCount == 3) {
//            System.out.println("모두 짝수입니다.");
//        } else if (oddCount == 3) {
//            System.out.println("모두 홀수입니다.");
//        } else {
//            System.out.println("짝수 : " + evenCount + "개, 홀수 : " + oddCount + "개 입니다.");
//        }
//		
//        1. 1부터 10까지의 정수의 합을 출력하세요.
//			int sum = 0;
//			for(int i = 0; i <=10; i++) {
//				sum += i;
//			} System.out.println(sum);
		
//
//        2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//
//			int sum = 1;
//			int i = 0;
//			while(i<10) {
//				sum *= 2;
//				i++;
//				System.out.println(sum);
//			}
		
//        3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("정수를 입력하세요.");
//			int a = scanner.nextInt();
//			
//			for(int i = 0; i <= a; i++)
//			if(i%i == 1) {
//				System.out.println(i);
//				break;
//			}
//		
		
//
//        4. 사용자가 입력한 정수의 약수를  출력하세요.
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("정수를 입력하세요.");
//			int a = scanner.nextInt();
//		
//			for(int i = 1; i <= a; i++)
//				if(a%i == 0) {
//					System.out.println(i);
//					
//				}
//
//        5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
//			Scanner scanner = new Scanner(System.in);
//			int[] numArr = new int[10];
//			for(int i = 0; i < numArr.length; i++) 
//			{
//				System.out.println("정수를 입력하세요.");
//				numArr[i] = scanner.nextInt(); 
//				
//			}
//						마지막인덱스 -1
//			for(int i = numArr.length-1; i >= 0; i--) 
//			{
//				System.out.println(numArr[i]);
//			}
	
		
//
//        6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("문자열을 입력하세요");
//			
//			String input = scanner.nextLine();
//			String reversed = "";
//			char[] strArr = input.toCharArray();
//			
//			for(int i = strArr.length -1; i >= 0; i--) {
//				reversed += input.charAt(i);
//			}
//			System.out.println(reversed);
//		
		
		
//
//        7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
//
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.println("정수를 입력하세요");
//			int a = scanner.nextInt();
//			
//			scanner.nextLine();
//			
//			System.out.println("정수를 입력하세요");
//			
//			int b = scanner.nextInt();
//			
//			int min = (a < b) ? a : b;
//			int gcd = 1;
//			for(int i = 1; i <= min; i++)
//				if(a%i == 0 && b%i == 0) {
//					gcd =i;
//				}
//			int lcm = ( a * b ) / gcd;
//			
//	
//			System.out.println("최소 공배수" + lcm);
//			System.out.println("최대 공약수" + gcd);
		
		
		
//        8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
//
		
		
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++ ) {
//				if(i >= j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		
//        8-1. *
//             **
//             ***
//             ****
//             *****
//
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <5; j++) {
//				if(i <= j) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//        8-2. *****
//              ****
//               ***
//                **
//                 *
//
//        9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
		Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        while (true) {
            System.out.println("정수를 입력하세요.(q를 입력시 종료)");
            			// 입력값에 대해서 정수인지 판단
            if (scanner.hasNextInt()) { // 입력이 정수인 경우
                int userNum = scanner.nextInt();
                sum += userNum;
            } else {
                String input = scanner.next(); // 다음 토큰을 문자열로 읽음
                if (input.equals("q")) { // 입력이 "q"인 경우
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("유효한 정수를 입력하세요."); // 정수가 아닌 입력에 대한 처리
                }
            }
        }
        
        System.out.println("합은 " + sum);
        scanner.close();
		
		
		
		
	}
}
