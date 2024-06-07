package chap23_stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _07_FilesToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. hyundaicar.txt 파일의 경로 객체 생성(Path 객체)
			Path path = Paths.get(
					_07_FilesToStream.class.getResource("hyundaicar.txt").toURI()
				//절대경로
//				"D:\\lecture\\Java\\JavaProgramming\\src\\chap23_stream\\hyundaicar.txt"
					
			);
			
			// 2. 위에서 얻은 Path 객체를 통해서 Stream 생성하기
			// Files.lines(Path객체, 인코딩될 캐릭터셋)
			// 텍스트 파일의 한 행을 String 값으로 가져와서 Stream으로 구성
			Stream<String> fileStream = Files.lines(path, Charset.defaultCharset());
			
			fileStream.forEach(str -> System.out.println(str));
		}catch(URISyntaxException e) {
			System.out.println(e.getMessage());
		
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
	}

	}
}
