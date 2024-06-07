package chap07_class;

import chap07_class.student.Student;

public class _04_UseOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("홍길동", 20, "컴퓨터공학");
		
		String[] strArr = new String[5];
		Student[] studentArr = new Student[3];
		
		studentArr[0] = new Student("홍길동", 20, "컴퓨터공학");
		studentArr[1] = new Student("임꺽정", 22, "화학공학");
		studentArr[2] = new Student("장길산", 23, "수학과");
		
		for(Student st : studentArr) {
			st.printStudentInfo();
		}
		
		student.printStudentInfo();
	}

}
