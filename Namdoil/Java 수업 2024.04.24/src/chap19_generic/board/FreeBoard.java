package chap19_generic.board;

public class FreeBoard {
	private int freeBoardNo;
	private String freeBoardTitle;
	
	public FreeBoard() {
		
	}
	
	public FreeBoard(int freeBoardNo, String freeBoardTitle) {
		this.freeBoardNo = freeBoardNo;
		this.freeBoardTitle = freeBoardTitle;
	}

	public int getFreeBoardNo() {
		return freeBoardNo;
	}

	public void setFreeBoardNo(int freeBoardNo) {
		this.freeBoardNo = freeBoardNo;
	}

	public String getFreeBoardTitle() {
		return freeBoardTitle;
	}

	public void setFreeBoardTitle(String freeBoardTitle) {
		this.freeBoardTitle = freeBoardTitle;
	}

	@Override
	public String toString() {
		return "FreeBoard [freeBoardNo=" + freeBoardNo + ", freeBoardTitle=" + freeBoardTitle + "]";
	}
}
