package chap99_homework.homework03;

public class UserBook {
	User[] users = new User[100];
	
	int index = 0;
	
	public void saveUserInfo(String username, String password) {
		User user = new User();
		
		user.setId(index + 1);
		user.setUsername(username);
		user.setPassword(password);
		
		users[index++] = user;
	}
	
	public void printUserInfo(int index) {
		if(users[index] != null) {
			System.out.println("id: " + users[index].getId() 
					+ ", username: " + users[index].getUsername()
					+ ", password: " + users[index].getPassword());
		} else {
			System.out.println("해당 인덱스에 저장된 데이터가 없습니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
