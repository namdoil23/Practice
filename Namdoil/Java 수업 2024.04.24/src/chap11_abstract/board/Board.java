package chap11_abstract.board;

// board 클래스를 추상화
// post 메소드도 추상메소드로 변경
// modify 메소드와 delte 메소드를 추상메소드로 선언하고 Freeboard와 NoticeBoard에서 각각 구현

public abstract class Board {
	long id;
	String title;
	String content;
	String writer;
	String creDate;
	
	public Board() {
		
	}

	public Board(long id, String title, String content, String writer, String creDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.creDate = creDate;
	}
	
	public abstract void post();
		
	public abstract void modify();
	
	public abstract void delete();

	
	
	
}
