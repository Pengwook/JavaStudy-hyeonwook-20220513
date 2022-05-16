package j04_입력;

import java.util.Scanner;

public class homework {
// 스캐너를 이용해서 윤년
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도 입력:");
		int year = scanner.nextInt();
		String result= year % 4 == 0 // String result = X, String을 한번 더 쓰는거 즉, 변수 선언을 2번하는거는 안댐 
						&& year % 100 != 0 
						|| year % 400 == 0 ?
						"윤년":"윤년이 아님";
			
		
		
		System.out.println(result);
		

	}

}
