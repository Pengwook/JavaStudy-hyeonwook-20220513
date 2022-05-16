package j03_연산;

public class Operation04 {

	public static void main(String[] args) {
		//
		
		int num1 = 30;
		int num2 = 2;
		int num3 = 10;
		
		boolean result = num1 % 3 == 0
				&& num2 % 2 == 0
				&& num3 % 5 == 0
				&& num3 % num1 == 0
				|| num3 % num2 == 0;
	}

}
