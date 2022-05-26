package j11_배열;

public class Array02 {

	public static void main(String[] args) {
//		int size = 4;
//		int[] numbers = new int[size];		// 요기 들어가있는 size는 갯수, 인덱스가 아님.
//		
//		System.out.println(numbers.length);
		
		/*
		 * for문으로 0 ~ 99까지 반복을 한다.
		 * 변수 i의 값이 8의 배수이면 	
		 * 8의 배수 갯수만큼 배열을 생성하고 
		 * 8의 배수를 모두 배열에 대입한다.
		 * 배열에 들어있는 8의 배수들을 모두 출력하시오.
		 * 
		 */
		System.out.println(0 % 8);
		
		int size = 0;
		
		for(int i = 0; i < 100; i++) {
			if(i != 0 && i % 8 == 0) {	// i != 0 을 넣는 이유는 참이 안되게 하기 위해서 0 이 들어가면 0은 8의 배수가 아니므로	
				size++;		// 즉 8의 배수일때마다 size가 1씩 증가하므로 8의 배수의 갯수가 나옴.
			}
		}
		
		int[] numbers = new int[size];		// 8의 배수의 갯수만큼 배열만듦. 배열공간을 만드는것.
		
		for(int i = 0, j = 0; i < 100; i++) {		// 0부터 99까지 검사를 하면서 8의 배수면은 해당 배열에 집어넣어라
			if(i != 0 && i % 8 == 0) {
				numbers[j] = i;		// 0-99까지 넣었을때 i는 1씩 증가, 배열에 넣었을때만 j가 1씩 증가. 
				System.out.println(numbers[j]);
				j++;
			}
		}
		
//		for(int i = 0; i < numbers.length; i++) {		// 배열의 크기만큼 반복을 하면서 안에 0번 인덱스부터 하나씩 끄집어내서 출력.
//			System.out.println(numbers[i]);
//		}
	}

}
