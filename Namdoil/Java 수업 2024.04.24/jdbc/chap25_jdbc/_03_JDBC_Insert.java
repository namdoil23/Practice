package chap25_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _03_JDBC_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		// Statement를 상속받은 PreparedStatement 객체
		// PreparedStatement는 쿼리에 파라미터를 추가할 수 있다.
		PreparedStatement stmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("학번을 입력하세요.");
			String sno = sc.nextLine();
			System.out.println("이름을 입력하세요.");
			String sname = sc.nextLine();
			System.out.println("성별을 입력하세요.");
			String gender = sc.nextLine();
			System.out.println("학년을 입력하세요.");
			int syear = sc.nextInt();
			sc.nextLine();
			System.err.println("전공을 입력하세요.");
			String major = sc.nextLine();
			System.out.println("평점을 입력하세요.");
			double avr = sc.nextDouble();
			
			conn = JDBCUtil.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234"
			);
			
			// 물음표(?)를 이용해서 파라미터 지정
			String insertStudent = "INSERT INTO STUDENT"
					+ "	VALUES(?, ?, ?, ?, ?, ?)";
			
			// Statement 객체는 Connection의 createStatement()메소드를 통해 생성
			// PreparedStatement 객체는 Connection의 preparedStatement() 메소드를 통해서 생성
			stmt = conn.prepareStatement(insertStudent);
			
			// ?로 지정한 파라미터 들어갈 값들을 매핑
			// 쿼리문이기 때문에 index 1부터 시작
			stmt.setString(1, sno);
			stmt.setString(2, sname);
			stmt.setString(3, gender);
			stmt.setInt(4, syear);
			stmt.setString(5, major);
			stmt.setDouble(6, avr);
			
			// update, delete, insert는 영향받은 행의 개수를 리턴
			// update, delete, insert는 executeUpdate() 메소드로 쿼리 실행
			int result = stmt.executeUpdate();
			
			if(result != 0) {
				System.out.println("쿼리가 잘 동작했습니다.");
			} else {
				System.out.println("영향받은 행이 없습니다.");
			}
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

}
