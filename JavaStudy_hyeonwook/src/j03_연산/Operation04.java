package j03_연산;

public class Operation04 {

	public static void main(String[] args) {
		/*
		 * num1, num2, num3
		 * 
		 * num1의 값이 3의 배수이면서
		 * num2의 값이 짝수여야하고
		 * num3의 값이 5의 배수이면서
		 * num3의 값에 num1을 나눈 나머지가 1이면 또는
		 * num3의 값에 num2를 나눈 나머지가 0이면 
		 * 
		 * true를 출력하라.
		 * 
		 */
		
		int num1 = 30;
		int num2 = 2;
		int num3 = 10; // 9면 false 나옴 9에다가 30을 나누면 몫은 0 나머지 9 되기때문
		
		boolean result = num1 % 3 == 0 
				&& num2 % 2 ==0 
				&& num3 % 5 == 0 
				&& num3 % num1 == 1 
				|| num3 % num2 == 0;
		// 조건들중 하나라도 false가 있으면 false가 나옴
		
		System.out.println(result);
	}

}
