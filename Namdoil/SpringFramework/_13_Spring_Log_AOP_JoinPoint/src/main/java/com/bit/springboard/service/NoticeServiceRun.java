package com.bit.springboard.service;

import com.bit.springboard.dto.BoardDto;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.time.LocalDateTime;

public class NoticeServiceRun {
    public static void main(String[] args) {
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("root-context.xml");

        BoardService boardService = factory.getBean("noticeServiceImpl", BoardService.class);

        BoardDto boardDto = new BoardDto();
        boardDto.setTitle("공지사항1");
        boardDto.setContent("공지사항 1번입니다.");
        boardDto.setWRITER_ID(1);

        boardService.post(boardDto);

        BoardDto modifyBoardDto = new BoardDto();
        modifyBoardDto.setTitle("공지사항1 수정");
        modifyBoardDto.setContent("공지사항 1번입니다.-수정됨");
        modifyBoardDto.setModdate(LocalDateTime.now());
        modifyBoardDto.setId(1);

        boardService.modify(modifyBoardDto);

        boardService.delete(2);

        boardService.getBoardList().forEach(notice -> {
            System.out.println(notice);
        });

        System.out.println(boardService.getBoard(4));
    }
}
