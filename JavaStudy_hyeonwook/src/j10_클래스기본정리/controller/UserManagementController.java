package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	
	private UserService userService;	// 클래스가 생성될때 = 필요할때
	private User[] users;	// user 생성주소의 값을 담는 공간
	
	public UserManagementController(UserService userService) {
		this.userService = new UserService();	// 주니어 개발자단계일땐 클래스 안에 선언되어지는 변수는 private 외에는 쓸 일이 거의 없음
		users = new User[5];
	}
	
	
	public void createUser() {		// 실체가 있어야 실행이 되는데 // 실체가 있을려면 생성이 되어야함.
		int indexResult = findEmptyInUsers();
		if(indexResult != -1) {
			users[indexResult] = userService.insertUser();
			
			System.out.println("[새로 추가된 사용자]");
			System.out.println(users[indexResult].toString());
		}else {
			System.out.println("더 이상 사용자를 추가할 수 없습니다.");
		}
//		User user = userService.insertUser();	// 메소드의 반환값은 리턴에서 반환됨.	리턴을 해주면서 user라는 변수에 주소를 반환해줌.
//		
//		System.out.println("[새로 추가된 사용자]");
//		System.out.println(user.toString());		// 이 주소에 가서도 toString을 리턴을 할것. // String형태로 값을 리턴해주는것.	}
	}
//	
	private int findEmptyInUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				return i;
			}
		}
		
		return -1;		// 빈공간 못찾아따
	}
	
	public void updateUser() {
		
	}
	
}
