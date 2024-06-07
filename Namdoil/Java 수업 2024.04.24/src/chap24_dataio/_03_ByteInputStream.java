package chap24_dataio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class _03_ByteInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. InputStream 객체 생성
		// FileInputStream 클래스 사용
		try {
			InputStream is = new FileInputStream(
					"D:/lecture/Java/JavaProgramming/src/chap24_dataio/ByteOutputStream01.txt"
					);
			
			// 2. 모든 바이트를 읽기 위해서 while문 선언
			while(true) {
				// 3. byte 단위로 출력했기 때문에
				// byte 타입으로 받아줘야 정확한 숫자가 입력된다.
				byte data = (byte)is.read();
				
				// 4. read() 메소드는 더 이상 읽은 데이터가 없으면 -1을 리턴한다.
				if(data == -1) {
					break;
				}
				
				// 5. 입력받은 데이터 출력
				System.out.println(data);
			}
			// 6. 입력스트림 메모리에서 해제
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
				
	}

}
}
