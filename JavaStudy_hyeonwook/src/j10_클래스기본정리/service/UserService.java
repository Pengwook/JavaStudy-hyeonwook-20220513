package j10_클래스기본정리.service;

import java.util.Scanner;

import j10_클래스기본정리.repository.User;

public class UserService {		// 이 클래스를 생성하는 시점에 스캐너를 생성하여 공유하며 쓰겠다.
	
	private Scanner scanner;	// 이거 대신에 private Scanner scanner = new Scanner(System.in); 을 써도됨.
	
	public UserService() {
		scanner = new Scanner(System.in);
	}
	
	public User insertUser() {  // 메소드명: insertUser // 앞에 User라고 쓰는 이유는 리턴을 받기 위하여 반환자료형을 같게함
		showInsertView();
		String usercode = null;
		String email = null;
		String name = null;
		String username = null;
		String password = null;
		
		System.out.print("사용자번호입력:");
		usercode = scanner.nextLine();
		System.out.print("이메일:");
		email = scanner.nextLine();
		System.out.print("이름:");
		name = scanner.nextLine();
		System.out.print("사용자이름:");
		username = scanner.nextLine();
		System.out.print("비밀번호:");
		password = scanner.nextLine();
		
		User user = new User(usercode, email, name, username, password);		// 주소를 리턴하는것.
		return user;
	}
	
	private void showInsertView() {		// 캡슐화 해본것	// 메소드 호출 -> 명령어 실행	
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
	}
}
