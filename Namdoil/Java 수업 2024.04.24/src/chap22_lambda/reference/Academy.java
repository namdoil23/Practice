package chap22_lambda.reference;

public class Academy {
	private String subject;
	private int studentCnt;
	private long lectureTime;
	
	// 1. 참조할 생성자 선언
	public Academy() {
		
	}
	
	public Academy(String subject) {
		this.subject = subject;
	}
	
	public Academy(String subject, int studentCnt) {
		this.subject = subject;
		this.studentCnt = studentCnt;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getStudentCnt() {
		return studentCnt;
	}

	public void setStudentCnt(int studentCnt) {
		this.studentCnt = studentCnt;
	}

	public long getLectureTime() {
		return lectureTime;
	}

	public void setLectureTime(long lectureTime) {
		this.lectureTime = lectureTime;
	}
	
	public void lectureInfo() {
		System.out.println("과목: " + this.subject);
		System.out.println("학생수: " + this.studentCnt);
		System.out.println("강의시간: " + this.lectureTime);
	}
}
