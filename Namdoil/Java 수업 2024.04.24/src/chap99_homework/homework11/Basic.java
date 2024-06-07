package chap99_homework.homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		3. 공유객체로 사용될 클래스 NumberPrinter를 만들고 멤버변수로 int num을 가지고 정수형 매개변수를 받아 매개변수로 받아온 값은 num에 저장하고 num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 num~100까지 숫자 중 5와 7의 공배수를 출력하는 메소드 numPrint2(int num)를 구현하세요. 그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 호출하는 스레드 클래스 1개를 구현하고 메인스레드에서 두 개의 스레드를 실행하세요.
//		NumberPrinter np = new NumberPrinter();
//		
//		Thread1 t1 = new Thread1();
//		Thread2 t2 = new Thread2();
//		
//		t1.setNp(np);
//		t2.setNp(np);
//		
//		t1.start();
//		t2.start();

// 		4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.
//		 NumberPrinterSync np = new NumberPrinterSync();
//		
//		 Thread1 t1 = new Thread1();
//		 Thread2 t2 = new Thread2();
//		
//		 t1.setNp(np);
//		 t2.setNp(np);
//		
//		 t1.start();
//		 t2.start();

// 		5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.
//		 NumberPrinterWaitNotify np = new NumberPrinterWaitNotify();
//		
//		 Thread1 t1 = new Thread1();
//		 Thread2 t2 = new Thread2();
//		
//		 t1.setNp(np);
//		 t2.setNp(np);
//		
//		 t1.start();
//		 t2.start();
	}
}
