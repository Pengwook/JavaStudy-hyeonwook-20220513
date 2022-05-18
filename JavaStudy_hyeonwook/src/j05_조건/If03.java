package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		/*
		 * 0보다 작거나 100보다 크면 계산 할 수 없는 점수입니다. 출력
		 * 위에 것을 먼저 하는게 좋음
		 * 백준 단계별 풀어보기 시험성적 문제!
		 * 
		 * 가능하면 초과미만으로 조건을 만드는게 좋음 >= 같은건 최대한 안쓰는게 나음
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		
		System.out.println("점수를 입력하세요:");
		score = scanner.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("계산 할 수 없는 점수입니다.");
		}else if(score > 89) {
			System.out.println("A");
		}else if(score > 79) {
			System.out.println("B");
		}else if(score > 69) {
			System.out.println("C");
		}else if(score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
