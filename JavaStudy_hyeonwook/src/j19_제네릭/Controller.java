package j19_제네릭;

import j10_클래스기본정리.repository.User;
import j12_상속.동물.Animal;
import j12_상속.동물.Human;
import j12_상속.동물.Tiger;

public class Controller {
	
	public Object createUser() {
		return new CMRespDto<String>(1, "회원추가 성공", "aaaa, 1234");	// 데이터를 전달해줄수 있는 하나의 묶음.
	}
	
	public Object updateUser() {
		return new CMRespDto<Integer>(1, "회원정보(나이)수정 성공", 29);
	}
	
	// 제네릭의 와일드카드
	public CMRespDto<?> getUser() {	// 와일드카드 -> 어떤 자료형으로 반환댈지 모른다는뜻.
		User user = new User();
		user.setUsercode("1");
		user.setUsername("junil");
		user.setPassword("1234");
		user.setName("김준일");
		user.setEmail("skji1218@kakao.com");
		if(user.getUsercode().equals("1")) {
			return new CMRespDto<User>(1, "회원정보 가져오기 성공", user);
		}else {
			return new CMRespDto<String>(-1, "회원정보 가져오기 실패", "usercode = 2");
		}
	}
	
	public CMRespDto<? extends Animal> getAnimal() {	//Animal을 상속받은애만 와일드카드
		Animal animal = new Animal();
		
		if(animal instanceof Human) {
			return new CMRespDto<Human>(1, "사람입니다", (Human) animal);
		}else if(animal instanceof Tiger) {
			return new CMRespDto<Tiger>(1, "호랑이입니다", (Tiger) animal);
		}else {
			return new CMRespDto<>(-1, "찾을 수 없는 동물", animal);	
		}
	}
}
