package j10_클래스기본정리;

import j10_클래스기본정리.controller.UserManagementController;
import j10_클래스기본정리.service.UserService;



public class UserMangementApplication {

	public static void main(String[] args) {
		
		UserManagementController userManagementController = new UserManagementController(new UserService()); // UserManagementController를 쓰고싶은데 같은공간이 아니라서 불러와야함(import)
		userManagementController.createUser();			// 위는 객체 생성. 얘는 객체안의 메소드 실행
		
		
		
	}

}
