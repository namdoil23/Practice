package chap11_abstract;

import chap11_abstract.board.Board;
import chap11_abstract.board.FreeBoard;
import chap11_abstract.board.NoticeBoard;

public class _02_AbstractBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new FreeBoard(1, "안녕하세요.", "추상화", "고기천", "2024-05-02",
				"첨부파일1");
		board.post();
		board.modify();
		board.delete();
		
		board = new NoticeBoard(1, "공지사항", "공지사항입니다.", "관리자", "2024-05-02",
				true);
		board.post();
		board.modify();
		board.delete();
				
				
	}

}
