package j11_배열;

public class Foreach {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		/*
		 * 1,2,3,4,5,6,7,8 로 출력이 되게끔 만들어보기.
		 */
		for(int i = 0; i < numbers.length; i++) {	// numbers.length -> 배열의 길이
			System.out.print(numbers[i]);
			if(numbers.length-1 != i) {		// 서로 같을땐 (,) 동작안함
				System.out.print(", ");
			}
		}
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length-1 != i? ", " : ""));
		}
		System.out.println();
		
		int i = 0;		// foreach는 이렇게 해줘야댐
		for(int num : numbers) {	// 처음부터 끝까지 반복.	// 인덱스번호도 따로 안줘도 됨.	
			System.out.print(num + (numbers.length-1 != i ? ", " : ""));
			i++;
		}
	}
	
}
