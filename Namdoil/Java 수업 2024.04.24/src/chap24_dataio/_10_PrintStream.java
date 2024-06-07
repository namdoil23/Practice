package chap24_dataio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _10_PrintStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. PrintWriter 객체 생성
			PrintWriter printWriter = new PrintWriter(
				new FileWriter(
					"D:/lecture/Java/JavaProgramming/src/chap24_dataio/PrintStream.txt"
				)
			);
			
			char[] chArr = {'a', 'b', 'c', 'd', 'e'};
			
			for(int i = 0; i < chArr.length; i++) {
				// PrintStream은 출력 스트림에만 붙일 수 있는 보조 스트림으로
				// 출력기능만 가지고 있는 출력 스트림에서
				// 데이터들을 확인할 때 주로 사용한다.
				// 모니터로 직접 출력해주는 메소드는 아니고
				// 출력할 때 각각의 값을 확인할 때만 사용한다.
				// write메소드 대신 각각의 값을 출력할 때 사용한다.
				printWriter.println(chArr[i]);
			}
			
			printWriter.write(chArr);
			printWriter.flush();
			printWriter.close();
			
			
			
			
			
			
			
			
			
			
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}

}
