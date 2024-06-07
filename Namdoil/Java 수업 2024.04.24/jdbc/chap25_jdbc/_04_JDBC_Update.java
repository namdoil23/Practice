package chap25_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _04_JDBC_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 입력한 sno에 해당하는 학생의 정보를
		// 사용자가 입력한 내용으로 JDBC를 이용해서 수정
		Connection conn = null;
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
			System.out.println("전공을 입력하세요.");
			String major = sc.nextLine();
			System.out.println("평점을 입력하세요.");
			double avr = sc.nextDouble();

			conn = JDBCUtil.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234"
			);

			// 수정 쿼리
			String updateStudent = "UPDATE STUDENT "
					+ "SET SNAME = ?, SEX = ?, SYEAR = ?, MAJOR = ?, AVR = ? "
					+ "WHERE SNO = ?";

			// PreparedStatement 객체 생성
			stmt = conn.prepareStatement(updateStudent);

			// ?로 지정한 파라미터에 들어갈 값들을 매핑
			stmt.setString(1, sname);
			stmt.setString(2, gender);
			stmt.setInt(3, syear);
			stmt.setString(4, major);
			stmt.setDouble(5, avr);
			stmt.setString(6, sno);

			// update, delete, insert는 executeUpdate() 메소드로 쿼리 실행
			int result = stmt.executeUpdate();

			if (result != 0) {
				System.out.println("학생 정보가 성공적으로 수정되었습니다.");
			} else {
				System.out.println("해당 학번의 학생이 없습니다.");
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
}
