package chap99_homework.homework03;

public class PhoneInfo {
	String[] names = new String[100];
	String[] phoneNums = new String[100];
	
	int index = 0;
	
	public void insertPhoneInfo(String name, String phoneNum) {
		//매개변수로 전달된 이름과 번호를 각각의 배열에 저장하는 기능 구현
		this.names[index] = name;
		this.phoneNums[index] = phoneNum;
		index++;
	}

	public void printAllPhoneInfo() {
		 //배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현
		for(int i = 0; i < names.length; i++) {
			if(names[i] != null) {
				System.out.print("이름 : " + names[i] + ", 번호 : " + phoneNums[i] + "\n");
			}
		}
	}
	
	public void printPhoneInfo(int index) {
		//매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현
		if(names[index] != null) {
			System.out.print("이름 : " + names[index] + ", 번호 : " + phoneNums[index] + "\n");
		} else {
			System.out.println("해당 번호로 저장된 정보가 없습니다.");
		}
	}
}
