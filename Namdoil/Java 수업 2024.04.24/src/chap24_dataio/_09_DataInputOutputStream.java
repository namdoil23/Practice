package chap24_dataio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_DataInputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. DataOutputStream 객체 생성
			// DataOutputStream은 바이트 출력 스트림인 OutputStream에만 존재하는 보조 스트림
			// 기본자료형 데이터들을 출력할 수 있는 보조 스트림이다.
			DataOutputStream dataOutputStream = new DataOutputStream(
				new FileOutputStream(
					"D:/lecture/Java/JavaProgramming/src/chap24_dataio/DataOutputStream.txt"
				)
			);
			
			// 2. writeUTF(String 타입의 매개변수): String 타입으로 전달받은 매개변수를 출력
			dataOutputStream.writeUTF("현대");
			dataOutputStream.writeUTF("제네시스");
			
			// 3. write기본타입(기본타입의 매개변수): 기본타입으로 전달받은 매개변수를 출력
			dataOutputStream.writeInt(6000);
			dataOutputStream.writeDouble(220.5);
			
			dataOutputStream.writeUTF("현대");
			dataOutputStream.writeUTF("소나타");
			dataOutputStream.writeInt(4000);
			dataOutputStream.writeDouble(200.10);
			
			dataOutputStream.writeUTF("현대");
			dataOutputStream.writeUTF("아반떼");
			dataOutputStream.writeInt(3000);
			dataOutputStream.writeDouble(190.07);
			
			dataOutputStream.flush();
			dataOutputStream.close();
			
			// 4. DataInputStream 객체 생성
			// 바이트 입력 스트림인 InputStream의 보조 스트림으로 기본 자료형을 입력받을 수 있는 보조 스트림
			DataInputStream dataInputStream = new DataInputStream(
				new FileInputStream(
					"D:/lecture/Java/JavaProgramming/src/chap24_dataio/DataOutputStream.txt"
				)
			);
			
			for(int i = 0; i < 3; i ++) {
				// 5. readUTF(): String 타입으로 데이터를 읽어온다.
				String company = dataInputStream.readUTF();
				String model = dataInputStream.readUTF();
				
				// 6. read기본타입(): 기본타입으로 데이터를 읽어온다.
				int price = dataInputStream.readInt();
				double maxSpped = dataInputStream.readDouble();
				
				System.out.println("제조사: " + company + ", 모델: " + model + 
						", 가격: " + price + ", 최고속도: " + maxSpped);
			}
			
			dataInputStream.close();
			
		} catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}

}
