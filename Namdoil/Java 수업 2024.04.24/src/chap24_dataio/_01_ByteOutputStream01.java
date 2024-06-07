package chap24_dataio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _01_ByteOutputStream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. OutputStream 객체 생성
			// 추상 클래스인 OutputStream을 상속받아 구현된 클래스의 객체를 사용해야 한다.
			// FileOutputStream 클래스
			// FileOutputStream 클래스의 생성자에는 저장될 파일의 경로와 파일명을 지정해줘야 한다.
			OutputStream os = new FileOutputStream(
				"D:/lecture/Java/JavaProgramming/src/chap24_dataio/ByteOutputStream01.txt"
			);
			
			// 2. 1 byte씩 출력
			byte num1 = -128;
			byte num2 = 0;
			byte num3 = 127;
			
			os.write(num1);
			os.write(num2);
			os.write(num3);
			
			// 3. 버퍼에 담긴 내용 출력하기
			os.flush();
			
			// 4. OutputStream 메모리에서 해제
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}

}
