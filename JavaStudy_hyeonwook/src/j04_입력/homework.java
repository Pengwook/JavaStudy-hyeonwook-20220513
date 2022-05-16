package j04_입력;

import java.util.Scanner;

public class homework {
// 스캐너를 이용해서 윤년
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도 입력:");
		int year = scanner.nextInt();
		boolean result = year%4==0
						&&year%100!=0
						||year%400==0;
		
		
		System.out.println(result);
		

	}

}
