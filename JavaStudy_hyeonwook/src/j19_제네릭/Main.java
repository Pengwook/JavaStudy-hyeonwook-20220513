package j19_제네릭;

import j10_클래스기본정리.repository.User;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.updateUser());
		System.out.println(controller.getUser().getData());	// 다운캐스팅을 해놓은애한테 .을 찍어야댐
		controller.getAnimal().getData().move();
		
//		((CMRespDto<User>) controller.getUser()). // 다운캐스팅을 해놓은애한테 .을 찍어야댐
	}
}
