package j06_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		/*
		 * num = 0; -> num에 입력 횟수
		 * 반복 횟수를 입력하세요: 5
		 *  
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("반복 횟수를 입력하세요:");
		num = scanner.nextInt();
		
		int i = 0;
		// 몇번 반복할것인가!는 while() 괄호안 
		while(i < num ) {
			System.out.println(i+1);
			i++;
		}
		// 반대로 20을 입력하면 20 19 18 순으로 나오게 할려면
		i = 0;
		
		while(i < num ) {
			System.out.println(num-i);
			i++; // 가능하면 i--; 처럼 --는 쓰지말쟈
		}
	}

}
