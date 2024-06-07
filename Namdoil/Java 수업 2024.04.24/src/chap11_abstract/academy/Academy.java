package chap11_abstract.academy;

// abstract 키워드를 사용해서 추상클래스를 생성한다.
// 추상클래스는 인스턴스 변수, 인스턴스 메소드, 추상메소드를 가질 수 있는 클래스이다
// 추상메소드가 완전하지 않은 메소드이기 때문에 추상클래스는 객체를 만들 수 없다.
public abstract class Academy {
	public int classCnt;
	public int studentCnt;
	public int teacherCnt;
	public int subjectCnt;
	
	public void academyInfo() {
		System.out.println("강의수:" + this.classCnt);
		System.out.println("학생수:" + this.studentCnt);
		System.out.println("강사수:" + this.teacherCnt);
		System.out.println("과목수:" + this.subjectCnt);
	}
	
	// 추상메소드 선언
	// 추상메소드는 선언만 해놓은 메소드(껍데기(형태)만 존재한다.)
	// abstract 키워드를 이용해서 추상메소드를 선언한다.
	public abstract void teach();
	public abstract void solveHomework();
	public abstract void rest();
	public abstract void attend();

	
}
