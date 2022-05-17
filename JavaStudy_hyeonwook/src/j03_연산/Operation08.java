package j03_연산;

import java.util.Scanner;

public class Operation08 {

	public static void main(String[] args) {
		/*
		 * num = 10
		 * num이 짝수면 짝수, 홀수면 홀수를 출력하는 프로그램을 작성하세요.
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 10;
		
		System.out.println("결과:");
		num = scanner.nextInt();
		
		String result = num % 2 == 0 ? "짝수":"홀수";
		
		System.out.println("결과:" + result);
		
		
	}
	

}
