package chap15_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			test();
			
			String[] strArr = new String[4];
			
			printStringArray(strArr);
		} catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		} catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	// throws는 해당 메소드가 호출되는 곳에 예외처리를 위임하는 것이다.
	// 메소드를 호출하는 곳에서 try ~ catch 구문으로 예외처리를 하던가 아니면 다시 한 번 throws로 
	// 예외처리를 위임할 수 있다.
	// throws의 위치는 매개변수의 소괄호 뒤, { 앞에 작성한다.
	public static void test() throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int age = 0;
		
		age = Integer.parseInt(in.readLine());
	}
	
	public static void printStringArray(String[] strArr) throws NullPointerException {
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i].length());
		}
	}
}
