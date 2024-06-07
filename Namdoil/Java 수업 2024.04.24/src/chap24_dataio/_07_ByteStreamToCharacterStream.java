package chap24_dataio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class _07_ByteStreamToCharacterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. 바이트 출력 스트림을 문자 출력 스트림으로 변경해서 출력
//		String str = "abcedfg\n";
//		
//		write(str);
		
		// 4. 바이트를 입력 스트림을 문자 입력 스트림으로 변경해서 입력받기
		
		String readStr = read();
		
		System.out.println(readStr);
	}
	
	// 1. 바이트 출력 스트림을 문자 출력 스트림으로 변환하여 출력하는 메소드
	public static void write(String str) {
		try {
			// 1-1. 바이트 출력 스트림 객체 생성
			OutputStream os = new FileOutputStream(
				"D:/lecture/Java/JavaProgramming/src/chap24_dataio/ByteToChar.txt"
			);
			
			// 1-2. Writer를 상속받은 클래스중 바이트 스트림을 문자 스트림으로 변환해주는 기능을 가진
			// OutputStreamWriter라는 클래스가 존재한다.
			Writer writer = new OutputStreamWriter(os);
			
			writer.write(str);
			writer.flush();
			writer.close();
		} catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
	
	// 2. 바이트 입력 스트림을 문자 입력 스트림으로 변환하여 출력하는 메소드
	public static String read() {
		String returnStr = "";
		
		try {
			// 2-1. 바이트 입력 스트림 객체 생성
			InputStream is = new FileInputStream(
				"D:/lecture/Java/JavaProgramming/src/chap24_dataio/ByteToChar.txt"
			);
			
			// 2-2. Reader 클래스를 상속받은 클래스 중 바이트 입력 스트림을 문자 입력 스트림으로
			// 변환하는 기능을 가진 InputStreamReader라는 클래스가 존재한다.
			Reader reader = new InputStreamReader(is);
			
			char[] readData = new char[4096];
			
			while(true) {
				int cnt = reader.read(readData);
				
				if(cnt == -1) {
					break;
				}
				
				System.out.println("입력받은 문자 개수: " + cnt);
				for(char c : readData) {
					if(c != 0) {
						returnStr += c;
					}
				}
			}
			
			reader.close();
			
		} catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
		return returnStr;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
