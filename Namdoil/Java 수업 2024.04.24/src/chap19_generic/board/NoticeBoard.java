package chap19_generic.board;

public class NoticeBoard {
	private int noticeBoardNo;
	private String noticeBoardTitle;
	
	public NoticeBoard() {
		
	}
	
	public NoticeBoard(int noticeBoardNo, String noticeBoardTitle) {
		this.noticeBoardNo = noticeBoardNo;
		this.noticeBoardTitle = noticeBoardTitle;
	}

	public int getNoticeBoardNo() {
		return noticeBoardNo;
	}

	public void setNoticeBoardNo(int noticeBoardNo) {
		this.noticeBoardNo = noticeBoardNo;
	}

	public String getNoticeBoardTitle() {
		return noticeBoardTitle;
	}

	public void setNoticeBoardTitle(String noticeBoardTitle) {
		this.noticeBoardTitle = noticeBoardTitle;
	}

	@Override
	public String toString() {
		return "NoticeBoard [noticeBoardNo=" + noticeBoardNo + ", noticeBoardTitle=" + noticeBoardTitle + "]";
	}
}
