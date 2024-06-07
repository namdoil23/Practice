package chap24_dataio.phoneInfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PhoneInfo {
	// 이름이 키, 전화번호가 밸류
	// 고기천, 010-1111-1111
	List<Map<String, String>> phoneInfoList = new ArrayList<>();
	
	public PhoneInfo() {
		// 생성자에서 저장된 파일을 입력받아 파일에 저장된 내용을 phoneInfoList에 저장
		try {
			// 1. FileReader 객체 생성
//			Reader reader = new FileReader(
//				"D:/lecture/Java/JavaProgramming/src/chap24_dataio/PhoneInfo.txt"	
//			);
			
			// 2. 성능이 향상된 BufferedReader 객체 생성
			// 이미 생성된 문자 입력 스트림에 붙여서 사용한다.
			// 생성자에 미리 생성된 문자 입력 스트림을 전달하여 문자 입력 스트림에 붙인다.
//			BufferedReader bufferedReader = new BufferedReader(reader);
			
			BufferedReader bufferedReader = new BufferedReader(
				new FileReader(
					"D:/lecture/Java/JavaProgramming/src/chap24_dataio/PhoneInfo.txt"	
				)
			);
			
			while(true) {
				// 3. readLine(): 파일의 한 줄을 문자열로 읽어오는 메소드
				// BufferedReader에서만 사용 가능한 메소드
				String line = bufferedReader.readLine();
				
				// 4. readLine() 메소드는 더 이상 읽을 데이터가 없을 때 null을 리턴한다.
				if(line == null) {
					break;
				}
				
				Map<String, String> phoneInfoMap = new HashMap<>();
				phoneInfoMap.put(line.split(",")[0], line.split(",")[1]);
				
				phoneInfoList.add(phoneInfoMap);
			} 
			
			bufferedReader.close();
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
	
	public void insertPhoneInfo(String name, String phoneNum) {
		Map<String, String> phoneInfoMap = new HashMap<>();
		phoneInfoMap.put(name, phoneNum);
		
		phoneInfoList.add(phoneInfoMap);
	}

	public void printAllPhoneInfo() {
		int cnt = 0;
		
		for(Map<String, String> phoneInfoMap : phoneInfoList) {
			for(Entry<String, String> phoneInfoEntry : phoneInfoMap.entrySet()) {
				System.out.println("이름: " + phoneInfoEntry.getKey() + 
						", 전화번호: " + phoneInfoEntry.getValue());
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		}
	}
	
	public void printPhoneInfo(String name) {
		int cnt = 0;
		
		for(Map<String, String> phoneInfoMap : phoneInfoList) {
			for(Entry<String, String> phoneInfoEntry : phoneInfoMap.entrySet()) {
				if(name.equals(phoneInfoEntry.getKey())) {
					System.out.println("이름: " + phoneInfoEntry.getKey() + 
							", 전화번호: " + phoneInfoEntry.getValue());
					cnt++;
				}
			}
		}
		
		if(cnt == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		}
	}
	
	// 문자 출력 스트림을 이용해서 데이터를 파일로 저장하는 메소드
	public void saveData() {
		try {
			// 1. BufferedWriter 보조 스트림 객체 생성
			BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter(
					"D:/lecture/Java/JavaProgramming/src/chap24_dataio/PhoneInfo.txt"
				)
			);
			
			String saveNameNumber = "";
			
			for(Map<String, String> phoneInfoMap : phoneInfoList) {
				for(Entry<String, String> phoneInfoEntry : phoneInfoMap.entrySet()) {
					saveNameNumber = phoneInfoEntry.getKey() + "," + phoneInfoEntry.getValue();
					bufferedWriter.write(saveNameNumber);
					
					// BufferedWriter에만 존재하는 newLine() 메소드
					// newLine(): 엔터값을 출력하는 메소드
					bufferedWriter.newLine();
				}
			}
			
			bufferedWriter.flush();
			bufferedWriter.close();
			
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
