package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모,필기
		 * 
		 * 1.문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 이름: 길현욱
		 * 나이: 26
		 * 연락처: 010-7234-7219
		 * 주소: 부산 동래구 사직동
		 */
		
		char name1 = '길';
		char name2 = '현';
		char name3 = '욱';
		
		int age = 26;
		
		String phone = "010-7234-7219";
		String address = "부산 동래구 사직동";
		

		
		System.out.print("이름:");
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		System.out.print("나이:");
		System.out.println(age);
		//나이 또한 합쳐서 System.out.print("나이:"+ age);로 가능
		System.out.print("연락처:");
		System.out.println(phone);
		System.out.print("주소:");
		System.out.println(address);
		
		//System.out.print("이름:"+ name1 + name2 + name3); 이렇게도 가능
		
		//System.out.print("이름:");
		//System.out.print(name1+name2+name3); -> 이건 안댐 16진수 유니코드 AC01 --> 10진수 
		//System.out.print(""+ name1 + name2 + name3); -> 이건 가능
		
		System.out.println("세수의 합:" + (10 + 20 + 30));
		//("세수의 합:" + 10 + 20 + 30); 으로 하면 문자 그대로 102030으로 나옴
		
	}

}
