package chap99_homework.homework98;

public class Libary {

//	2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
	public String bookname;
	
	public String writer;
	
	public String editer;
	
	public int bookprice;
	
	public Libary () {
		
	}
	
	public Libary(String bookname, String writer, String editer, int bookprice) {
		this.bookname = bookname;
		this.writer = writer;
		this.editer = editer;
		this.bookprice = bookprice;
	}
	public void printLibaryInfo() {
		System.out.println("제목:" + this.bookname);
		System.out.println("저자:" + this.writer);
		System.out.println("출판사:" + this.editer);	
		System.out.println("가격:" + this.bookprice);
	}
}	

