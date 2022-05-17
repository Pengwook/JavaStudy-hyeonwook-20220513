package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 
		 * 문자열1 입력: nextLine()		hi
		 * 문자열2 입력: next()         안녕	
		 * 문자 입력: next().charAt(0)	A
		 * 정수 입력: nextInt()			10
		 * 실수 입력: nextDouble()		3.14
		 * 
		 * nextLine()과 next()의 차이
		 * nextLine에는 띄워쓰기두 댐!
		 * 
		 * next는 스페이스바랑 엔터를 무시함
		 * nextLine은 스페이스바랑 엔터를 허용함
		 */
		
		Scanner scanner = new Scanner(System.in);
		String a = null;
		String b = null;
		char c = 0;
		int d = 0;
		double e = 0;
		
	   System.out.print("문자열1 입력:");
	   a = scanner.nextLine();
	   System.out.print("문자열2 입력:");
	   b = scanner.next();
	   System.out.print("문자 입력:");
	   c = scanner.next().charAt(0);
	   System.out.print("정수 입력:");
	   d = scanner.nextInt();
	   System.out.println("실수 입력:");
	   e = scanner.nextDouble();
	   
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
	   System.out.println(d);
	   System.out.println(e);
	   
		
		
		
	}

}
