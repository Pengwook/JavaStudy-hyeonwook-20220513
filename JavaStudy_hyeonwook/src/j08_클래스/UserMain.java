package j08_클래스;

public class UserMain {

	public static void main(String[] args) {
		//User user1 = new User();
		//user1.name = "김준일";
		//User user2 = new User();
		//user2.age = "29";
		
		//System.out.println(user1.name);
		//System.out.println(user1.age);
		//System.out.println(user2.name);
		//System.out.println(user2.age);
		User user1 = new User();  // 생성자는 반환자료형이 없을뿐 메소드랑 같음. // 즉 메소드오버로딩처럼 생성자오버로딩이 가능함. 변수명이 같아도 매개변수나 자료형이 다르면 오버로딩됨
		System.out.println("첫번째:" + user1.name);
		System.out.println("메인메소드에서 호출:" + user1);
		//user1.name = "길현욱";
		user1.setName("aaaa");
		System.out.println("두번째:" + user1.name);
		
		User user2 = new User("길현욱", "26", "01072347219", "부산");
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.phone);
		System.out.println(user2.address);
	}

}
