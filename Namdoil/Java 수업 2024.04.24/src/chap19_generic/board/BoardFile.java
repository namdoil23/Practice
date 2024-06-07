package chap19_generic.board;

public class BoardFile<T> {
	private int boardNo;
	private String fileNm;
	private T type;
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getFileNm() {
		return fileNm;
	}
	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}
	public String getType() {
		return type.getClass().getSimpleName();
	}
	public void setType(T type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "BoardFile [boardNo=" + boardNo + ", fileNm=" + fileNm + ", type=" + type.getClass().getSimpleName() + "]";
	}
}
