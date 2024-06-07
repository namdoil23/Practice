package chap09_inherit.board;

public class Board {
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
	
	public void post() {
		System.out.println("게시글을 저장한다.");
	}
}
