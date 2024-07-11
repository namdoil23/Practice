package com.bit.springboard.dao;

import com.bit.springboard.common.JDBCUtil;
import com.bit.springboard.dto.BoardDto;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Repository
public class NoticeDao {
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    private final String POST = "INSERT INTO NOTICE(TITLE, CONTENT, WRITER_ID) VALUES(?, ?, ?)";

    private final String MODIFY = "UPDATE NOTICE" +
            "                         SET" +
            "                               TITLE = ?," +
            "                               CONTENT = ?," +
            "                               MODDATE = ?" +
            "                         WHERE ID = ?";

    private final String GET_NOTICE_LIST = "SELECT N.ID" +
            "                                    , N.TITLE" +
            "                                    , N.CONTENT" +
            "                                    , N.WRITER_ID" +
            "                                    , M.NICKNAME" +
            "                                    , N.REGDATE" +
            "                                    , N.MODDATE" +
            "                                    , N.CNT" +
            "                                   FROM NOTICE N" +
            "                                   JOIN MEMBER M" +
            "                                     ON N.WRITER_ID = M.ID";

    private final String DELETE = "DELETE FROM NOTICE WHERE ID = ?";

    private final String GET_NOTICE = "SELECT N.ID" +
        "                                    , N.TITLE" +
        "                                    , N.CONTENT" +
        "                                    , N.WRITER_ID" +
        "                                    , M.NICKNAME" +
        "                                    , N.REGDATE" +
        "                                    , N.MODDATE" +
        "                                    , N.CNT" +
        "                                   FROM NOTICE N" +
        "                                   JOIN MEMBER M" +
        "                                     ON N.WRITER_ID = M.ID" +
            "                               WHERE N.ID = ?";

    public void post(BoardDto boardDto) {
        System.out.println("NoticeDao의 post 메소드 실행");

        try {
            conn = JDBCUtil.getConnection();

            stmt = conn.prepareStatement(POST);

            stmt.setString(1, boardDto.getTitle());
            stmt.setString(2, boardDto.getContent());
            stmt.setInt(3, boardDto.getWRITER_ID());

            stmt.executeUpdate();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(conn, stmt);
        }

        System.out.println("NoticeDao의 post 메소드 실행 종료");
    }

    public void modify(BoardDto boardDto) {
        System.out.println("NoticeDao의 modify 메소드 실행");

        try {
            conn = JDBCUtil.getConnection();

            stmt = conn.prepareStatement(MODIFY);

            stmt.setString(1, boardDto.getTitle());
            stmt.setString(2, boardDto.getContent());
            stmt.setString(3, boardDto.getModdate().toString());
            stmt.setInt(4, boardDto.getId());

            stmt.executeUpdate();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(conn, stmt);
        }

        System.out.println("NoticeDao의 modify 메소드 실행 종료");
    }

    public List<BoardDto> getNoticeList() {
        System.out.println("NoticeDao의 getNoticeList 메소드 실행");

        List<BoardDto> noticeList = new ArrayList<>();

        try {
            conn = JDBCUtil.getConnection();

            stmt = conn.prepareStatement(GET_NOTICE_LIST);

            rs = stmt.executeQuery();

            while(rs.next()) {
                BoardDto boardDto = new BoardDto();

                boardDto.setId(rs.getInt("ID"));
                boardDto.setTitle(rs.getString("TITLE"));
                boardDto.setContent(rs.getString("CONTENT"));
                boardDto.setWRITER_ID(rs.getInt("WRITER_ID"));
                boardDto.setNickname(rs.getString("NICKNAME"));
                boardDto.setRegdate(rs.getTimestamp("REGDATE").toInstant().atZone(ZoneId.of("UTC")).toLocalDateTime());
                boardDto.setModdate(rs.getTimestamp("MODDATE").toInstant().atZone(ZoneId.of("UTC")).toLocalDateTime());
                boardDto.setCnt(rs.getInt("CNT"));

                noticeList.add(boardDto);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(conn, stmt, rs);
        }

        System.out.println("NoticeDao의 getNoticeList 메소드 실행 종료");
        return noticeList;
    }
    
    public void delete(int id) {
        System.out.println("NoticeDao의 delete 메소드 실행");

        try {
            conn = JDBCUtil.getConnection();

            stmt = conn.prepareStatement(DELETE);

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(conn, stmt);
        }

        System.out.println("NoticeDao의 delete 메소드 실행 종료");
    }

    public BoardDto getNotice(int id) {
        System.out.println("NoticeDao의 getNotice 메소드 실행");

        BoardDto boardDto = new BoardDto();

        try {
            conn = JDBCUtil.getConnection();

            stmt = conn.prepareStatement(GET_NOTICE);

            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            if(rs.next()) {
                boardDto.setId(rs.getInt("ID"));
                boardDto.setTitle(rs.getString("TITLE"));
                boardDto.setContent(rs.getString("CONTENT"));
                boardDto.setWRITER_ID(rs.getInt("WRITER_ID"));
                boardDto.setNickname(rs.getString("NICKNAME"));
                boardDto.setRegdate(rs.getTimestamp("REGDATE").toInstant().atZone(ZoneId.of("UTC")).toLocalDateTime());
                boardDto.setModdate(rs.getTimestamp("MODDATE").toInstant().atZone(ZoneId.of("UTC")).toLocalDateTime());
                boardDto.setCnt(rs.getInt("CNT"));
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            JDBCUtil.close(conn, stmt, rs);
        }

        System.out.println("NoticeDao의 getNotice 메소드 실행 종료");
        return boardDto;
    }
}
