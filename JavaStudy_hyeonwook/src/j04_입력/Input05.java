package j04_입력;

import java.util.Scanner;

public class Input05 {

	public static void main(String[] args) {
		// 연습하고싶을땐 백준사이트 이용, 단계별로 풀어보기에서 1~11번까지만 해도 좋음
		//강의 알고리즘 기초 1,2 중급 1쪽 문제 풀어보는거 추천 다되면 코딩테스트는 앵간하면 가능
		//문제를 풀다가 막히면 문제번호를 java문제번호 검색하면 풀이가 나옴-> 10분을 넘겨도 모르겠다 싶으면 답지보기
		//이스케이프문자
		
		//백준 단계별문제 입출력과 사칙연산 a+b
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * int a = 0;
		 * int b = 0;
		 * 
		 * System.out.print("두 수를 입력하세요:");
		 * a = scanner.nextInt();
		 * b = scanner.nextInt();
		 * 
		 * System.out.println("두 수의 합은; " + (a+b));
		 */
		
		
		// 백준 단계별문제 조건문 두 수 비교하기
		// 삼항연산자 중첩
		// System.out.println(a>b? ">": a<b?"<": "==");
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.print("두 수를 입력하세요:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(a>b? ">": a<b?"<":"==");
		
		
		
	}

}
