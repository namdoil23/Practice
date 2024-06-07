package chap12_interface.board;

public class NoticeBoard implements Board {

	@Override
	public void post() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시글 등록");
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시글 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시글 삭제");
	}

}
