package chap15_exception;

import java.util.Scanner;

public class _05_GenerateException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요.");
		String userId = sc.nextLine();		
		System.out.println("비밀번호를 입력하세요.");
		String userPw = sc.nextLine();	
		
		try {
			checkUserIdandUserPw(userId, userPw);
				
		}catch(Exception e) {
			if(e.getMessage().equalsIgnoreCase("id not exist")) {
				System.out.println("에러코드:201");
				System.out.println("존재하지 않는 아이디 입니다.");
			}else if(e.getMessage().equalsIgnoreCase("pw not collect")){
				System.out.println("에러코드:202");
				System.out.println("잘못된 비밀번호입니다.");
			}else
				System.out.println(e.getMessage());
				System.out.println("알 수 없는 에러 발생");
		}
	}

	public static void checkUserIdandUserPw(String userId, String userPw) {
		String dbUserId = "bit";
		String dbUserPw = "1111";
		
		if(!userId.equals(dbUserId)) {
			// 예외 발생시키기
			// throw new 예외클래스(getMessage메소드에서 표출할 메시지)
			throw new RuntimeException("id not exist");
			
		}
		
		if(!userPw.equals(dbUserPw)) {
			throw new RuntimeException("Pw not correct");
			
		}
		
		System.out.println(userId + "님 환영합니다.");
	}
	
}
