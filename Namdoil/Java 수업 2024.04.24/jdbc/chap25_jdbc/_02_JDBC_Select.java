package chap25_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_JDBC_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDBC를 이용해서 과목별 기말고사의 평균 성적 조회
		// (과목번호, 과목이름, 교수번호, 교수이름, 기말고사 성적의 평균점수) 
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Connection 객체 얻기
			conn = JDBCUtil.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234"
			);

			// Statement 객체 얻기
			stmt = conn.createStatement();

			// 8. 실행 시킬 쿼리를 문자열로 작성
			String selectStudentInfo = "SELECT CO.CNO"
					+ "						 , CO.CNAME"
					+ "						 , ROUND(AVG(SC.RESULT), 2) AS AVG_RES"
					+ "						 , P.PNO"
					+ "						 , P.PNAME"
					+ "						FROM PROFESSOR P"
					+ "						JOIN COURSE CO"
					+ "						  ON P.PNO = CO.PNO"
					+ "						JOIN SCORE SC"
					+ "						  ON SC.CNO = CO.CNO"
					+ "						GROUP BY CO.CNO,P.PNO,P.PNAME,CO.CNAME" ;
			rs = stmt.executeQuery(selectStudentInfo);

			// 10. 쿼리 결과 출력
			while(rs.next()) {
				// 11. ResultSet에서 각각의 타입에 맞게 값을 꺼낸다.
				// 문자열은 getString 메소드, 정수형은 getInteger 메소드, 실수형은 getDouble 메소드
				String CNO = rs.getString("CNO");
				String CNAME = rs.getString("CNAME");
				String PNO = rs.getString("PNO");
				String PNAME = rs.getString("PNAME");
				double avgRes = rs.getDouble("avg_res");

				System.out.println("과목번호: " + CNO + ", 과목이름: " + CNAME +
						"교수번호: " + PNO + ", 교수이름: " + PNAME + ", 기말고사 평균점수: " + avgRes);
			}

		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, rs, conn);
		}











	}

}
