package chap25_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _05_JDBC_Delete {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 사용자가 입력한 sno에 해당하는 학생의 정보를
        // 사용자가 입력한 내용으로 JDBC를 이용해서 수정
        Connection conn = null;
        PreparedStatement stmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("삭제할 학번을 입력하세요.");
            String sno = sc.nextLine();

            conn = JDBCUtil.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234"
            );

            // 수정 쿼리
            String DeleteStudent = "DELETE FROM STUDENT"
                    + "                   WHERE SNO = ?";

            // PreparedStatement 객체 생성
            stmt = conn.prepareStatement(DeleteStudent);

            // ?로 지정한 파라미터에 들어갈 값들을 매핑
            stmt.setString(1, sno);

            // update, delete, insert는 executeUpdate() 메소드로 쿼리 실행
            int result = stmt.executeUpdate();

            if (result != 0) {
                System.out.println( sno + "학생 정보가 성공적으로 삭제되었습니다.");
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

