package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력] 
		 * 이름: 길현욱          		문자열 name  	 String
		 * 나이: 26				 		정수   age	 	 int
		 * 연락처: 010-7234-7219		문자열 phone	 String
		 * 주소: 부산 동래구 사직동		문자열 address	 String
		 * 성별: 남						문자   gender	 char
		 * 
		 * [개인정보 출력]
		 * 이름=> 길현욱          			문자열
		 * 나이=> 26				 		정수
		 * 연락처=> 010-7234-7219			문자열
		 * 주소=> 부산 동래구 사직동		문자열
		 * 성별=> 남						문자
		 * 
		 * \n 표시는 엔터이다
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String phone = null ;
		String address = null;
		char gender = 0;
		
		System.out.println("[사용자 정보 입력]"); //길현욱\n29\n010-7234-7219\n
		System.out.print("이름:");	//길현욱\n -> nextInt때 엔터키 한번 날라감
		name = scanner.next();     
		System.out.print("나이:"); //29\n
		age = scanner.nextInt();
		System.out.print("연락처:");	//010-7234-7219\n
		phone = scanner.next();
		scanner.nextLine();
		System.out.print("주소:");
		address = scanner.nextLine();
		System.out.print("성별:");
		gender = scanner.next().charAt(0);
		
		
		//nextLine은 엔터가 들어오면 한번은 날림
		//그래서  next(); 이후에 그 밑에 nextLine()이 쓰여진다면
		//scanner.nextLine();으로 한번 날려주고 다음줄부터 다시 이어가야댐
		
		
		
		
		//주소 풀이 
		//System.out.print("주소:")
		//address1 = scanner.next();
		//address2 = scanner.next();
		//address3 = scanner.next();
		//System.out.println("주소:" address1+address2+address3);
		
		
		
		System.out.println("[사용자 정보 출력]");
		System.out.println("이름:"+ name);
		System.out.println("나이:"+ age);
		System.out.println("연락처:"+phone);
		System.out.println("주소:"+ address);
		System.out.println("성별:"+ gender);
			
	}

}
