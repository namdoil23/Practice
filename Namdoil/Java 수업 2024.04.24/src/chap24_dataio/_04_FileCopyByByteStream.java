package chap24_dataio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _04_FileCopyByByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. InputStream, OutputStream 객체 생성
			InputStream is = new FileInputStream(
				"D:/lecture/Java/images/eclipse 구조.jpg"
			);
			OutputStream os = new FileOutputStream(
				"D:/lecture/Java/eclipse 구조 copy.jpg"
			);
			
			// 2. 출력될 바이트 배열 생성
			// read 메소드로 읽은 바이트를 저장할 배열
			byte[] readData = new byte[1024];
			
			
			while(true) {
				int cnt = is.read(readData);
				
				if(cnt == -1) {
					break;
				}
				
				// 3. InputStream에서 읽어온 데이터 OutputStream의 버퍼에 저장
				os.write(readData);
			}
			
			// 5. Java 9 버전부터는 InputStream의 transferTo 메소드로 파일을 복사할 수 있다.
//			is.transferTo(os);
			
			// 4. OutputStram 버퍼에 있는 내용 출력
			os.flush();
			
			is.close();
			os.close();
		} catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}

}
