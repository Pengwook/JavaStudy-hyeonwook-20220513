package j16_인터페이스_활용;

import j16_인터페이스_활용.controller.ApiController;
import j16_인터페이스_활용.service.OAuth2UserService;

public class Main {

	public static void main(String[] args) {
		
		ApiController CompanyA = new ApiController(new OAuth2UserService());	// 바로 그냥 주소 적어준것.
		CompanyA.addUser();
		CompanyA.getUser();
		CompanyA.modifiUser();
		CompanyA.removeUser();
	}

}
