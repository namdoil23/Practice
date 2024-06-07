package chap24_dataio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _02_ByteOutputStream02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream os = new FileOutputStream(
				"D:/lecture/Java/JavaProgramming/src/chap24_dataio/OutputStream02.txt"
			);
			
			// 1. byte 배열로 출력
			byte[] byteArr = new byte[5];
			
			for(byte i = 0; i < byteArr.length; i++) {
				byteArr[i] = i;
			}
			
			os.write(byteArr, 1, 3);
			
			os.flush();
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}

}
