package chap99_homework.homework98;

public class Student {
//	1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
	public String sname;
	
	public int sno;
	
	public String major;
	
	public Student() {
		
	}
	
	public Student(String sname, int sno, String major) {
		this.sname = sname;
		this.sno = sno;
		this.major = major;
	}
	public void printStudentInfo() {
		System.out.println("이름:" + this.sname);
		System.out.println("학번:" + this.sno);
		System.out.println("학과:" + this.major);
	}
}
