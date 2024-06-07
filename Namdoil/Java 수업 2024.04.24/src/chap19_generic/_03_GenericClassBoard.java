package chap19_generic;

import chap19_generic.board.BoardFile;
import chap19_generic.board.FreeBoard;

public class _03_GenericClassBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardFile<FreeBoard> freeBoardFile = new BoardFile<>();
		
		freeBoardFile.setType(new FreeBoard(1, "자유게시판 제목1"));
		freeBoardFile.setFileNm("자유게시판 첨부파일1");
		freeBoardFile.setBoardNo(1);
		
		System.out.println(freeBoardFile);
	}

}
