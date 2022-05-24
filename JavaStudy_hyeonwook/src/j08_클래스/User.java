package j08_클래스;

public class User {
	String name;
	String age;
	String phone;
	String address;
	
	User() {		//아무것도 들어있지 않은것을 기본생성자 라고함.
		System.out.println("생성.");
	}
	
	User(String name) {		//사용자정의 생성자
		//System.out.println(name);\
		this.name = name;
	}
	
	User(String name, String age, String phone, String address) {	//  생성하는 시점에 값을 넣겠다.
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	void setName(String name) {
		System.out.println("setName 메소드 안에서 호출:" + this);
		this.name = name;  // this.은 나 자신의 주소
	}
}
