package chap99_homework.homework08;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
//	    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
//	    2022년의 결혼기념일 날짜를 구하세요.
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2001, 11, 19);
		
		for(int i = 2001; i <= 2022; i++) {
			if(isLeap(i)) {
				cal1.add(Calendar.DATE, 1);
			}
		}
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM월 dd일");
		
		Date d1 = new Date(cal1.getTimeInMillis());
		
		System.out.println("2022년 결혼기념일 날짜는 " 
				+ sdf1.format(d1)
				+ "입니다.");
		System.out.println("------------------------------");
//		    
//		2. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//		    두 날짜 사이의 날짜를 모두 출력하세요.
//		    ex) 2023-01-29 2023-02-05 입력
//			출력  =>  2023-01-29
//		             2023-01-30
//		             2023-01-31
//		             2023-02-01
//		             2023-02-02
//		             2023-02-03
//		             2023-02-04
//		             2023-02-05
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
//		
//		System.out.print("첫 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
//		String inputDate1 = sc.nextLine();
//		System.out.print("두 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
//		String inputDate2 = sc.nextLine();
//		
//		String[] dateArr1 = inputDate1.split("-");
//		String[] dateArr2 = inputDate2.split("-");
//		
//		Calendar cal2 = Calendar.getInstance();
//		Calendar cal3 = Calendar.getInstance();
//		
//		cal2.set(Integer.parseInt(dateArr1[0]), (Integer.parseInt(dateArr1[1]) - 1), Integer.parseInt(dateArr1[2]));
//		cal3.set(Integer.parseInt(dateArr2[0]), (Integer.parseInt(dateArr2[1]) - 1), Integer.parseInt(dateArr2[2]));
//
//		if(cal2.getTimeInMillis() - cal3.getTimeInMillis() > 0) {
//			long diff = cal2.getTimeInMillis() - cal3.getTimeInMillis();
//			
//			long day = diff / (1000 * 60 * 60 * 24);
//			
//			System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
//			
//			for(long i = 1; i < day; i++) {
//				cal3.add(Calendar.DATE, 1);
//				System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
//			}
//			
//			System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
//		} else if(cal2.getTimeInMillis() - cal3.getTimeInMillis() < 0) {
//			long diff = cal3.getTimeInMillis() - cal2.getTimeInMillis();
//			
//			long day = diff / (1000 * 60 * 60 * 24);
//			
//			System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
//			
//			for(long i = 0; i < day; i++) {
//				cal2.add(Calendar.DATE, 1);
//				System.out.println(sdf2.format(new Date(cal2.getTimeInMillis())));
//			}
//			
//			System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
//		} else {
//			System.out.println("두 날짜는 같습니다.");
//		}
		
//		System.out.print("첫 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
//		String inputDate3 = sc.nextLine();
//		System.out.print("두 번째 날짜를 입력하세요.\n(년도4자리-월2자리-일2자리 형식으로 작성)\n");
//		String inputDate4 = sc.nextLine();
//		
//		String[] dateArr3 = inputDate3.split("-");
//		String[] dateArr4 = inputDate4.split("-");
//		
//		Calendar cal4 = Calendar.getInstance();
//		Calendar cal5 = Calendar.getInstance();
//		
//		cal4.set(Integer.parseInt(dateArr3[0]), (Integer.parseInt(dateArr3[1]) - 1), Integer.parseInt(dateArr3[2]));
//		cal5.set(Integer.parseInt(dateArr4[0]), (Integer.parseInt(dateArr4[1]) - 1), Integer.parseInt(dateArr4[2]));
//		
//		long diff = 0;
//		
//		Date first;
//		Date last;
//		
//		if(cal4.getTimeInMillis() > cal5.getTimeInMillis()) {
//			diff = cal4.getTimeInMillis() - cal5.getTimeInMillis();
//			first = new Date(cal5.getTimeInMillis());
//			last = new Date(cal4.getTimeInMillis());			
//		} else {
//			diff = cal5.getTimeInMillis() - cal4.getTimeInMillis();
//			first = new Date(cal4.getTimeInMillis());
//			last = new Date(cal5.getTimeInMillis());
//		}
//		
//		if(diff != 0) { 
//			long day = diff / (1000 * 60 * 60 * 24);
//			System.out.println(day);
//			
//			System.out.println(sdf2.format(first));
//			cal3.setTime(first);
//			
//			for(long i = 1; i < day; i++) {
//				cal3.add(Calendar.DATE, 1);
//				System.out.println(sdf2.format(new Date(cal3.getTimeInMillis())));
//			}
//			
//			System.out.println(sdf2.format(last));
//		} else {
//			System.out.println("둘 날짜는 같습니다.");
//		}

//	    3. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
//	    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
//	    ex) [1, 2, 3, 4, 5] => 4, 5 출력
//		List<Integer> intList = 
//					new ArrayList<Integer>();
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.print("정수를 입력하세요.");
//			intList.add(sc.nextInt());
//		}
//		
//		int sum = intList.get(0) + intList.get(1);
//		
//		int a = intList.get(0);
//		int b = intList.get(1);
//		
//		// 배열에서 합이 제일 커지는 구간의 값
////		for(int i = 0; i < intList.size(); i++) {
////			for(int j = i + 1; j < intList.size(); j++) {
////				if(intList.get(i) + intList.get(j) > sum) {
////					sum = intList.get(i) + intList.get(j);
////					a = intList.get(i);
////					b = intList.get(j);
////				}
////			}
////		}
//		// 배열에서 연속된 두수의 합이 제일 커지는 구간의 값
//		for(int i = 0; i < intList.size() - 1; i++) {
//			if(intList.get(i) + intList.get(i + 1) > sum) {
//				sum = intList.get(i) + intList.get(i + 1);
//				a = intList.get(i);
//				b = intList.get(i + 1);
//			}
//		}
//		
//		System.out.println("합 : " + sum 
//						+ ", " + a + ", " + b);

//	    4. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//	    두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//	    ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)
		List<Integer> intList2 = 
				new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
			
			for(int j = 0; j < i; j++) {
				if(intList2.get(i) == intList2.get(j)) {
					System.out.println("중복된 값입니다.");
					intList2.remove(i);
					i--;
				}
			}
		}
 		
		List<Integer> sumList = new ArrayList<>();
		
		List<Integer> cntList = new ArrayList<>();
		
		List<Integer> valueList = new ArrayList<>();
		
		for(int i = 0; i < intList2.size(); i++) {
			for(int j = i + 1; j < intList2.size(); j++) {
				if(j != i) {
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		}
		
		System.out.println(sumList);
		for(int i = 0; i < sumList.size(); i++) {
			int sumCnt = 1;
			
			for(int j = 0; j < sumList.size(); j++) {
				if(i != j) {
					if(sumList.get(i) == sumList.get(j)) {
						//System.out.println(sumList.get(i));
						sumCnt++;
					} 
				}
			}
			
			if(sumCnt > 0) {
				cntList.add(sumCnt);
				valueList.add(sumList.get(i));
			}
		}
		
		System.out.println(cntList);
		System.out.println(valueList);
		
		int sumCnt = 0;
		
		System.out.print("합이 유일한 합의 값: ");
		for(int i = 0; i < sumList.size(); i++) {
			if(cntList.get(i) == 1) {
				sumCnt++;
				System.out.print(valueList.get(i) + ", ");
			}
		}
		
		System.out.println("유일한 합의 개수: " + sumCnt);
		
		sc.close();
	}
	
	public static boolean isLeap(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

}
