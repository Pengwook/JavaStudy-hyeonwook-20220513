package j03_연산;

public class Operation02 {

	public static void main(String[] args) {
		// 논리연산자
		// AND => && -> 곱 -> 모든 조건이 참일때 True의 결과를 가짐, 하나라도 거짓이면 False의 결과를 가짐
		// OR => || -> Enter키 위의 키 shift 누른거 -> 합 -> 모든 조건이 거짓일때 False의 결과를 가짐, 하나라도 참이면 True의 결과를 가짐
		// NOT => ! -> 부정
		//0(false)
		//!0(true)
		
		//t(1) && t(1) => t(1)         -> 곱
		//t(1) && f(0) => f(0)
		
		//t(1) || t(1) => t(2)         -> 합   
		//t(1) || f(0) => t(1)
		//f(0) || f(0) => f(0)
		
		//!(t&&t) => f                 -> 부정
		//!(f||f) => t

		int num = 10;
		
		boolean result1 = num > 5;
		boolean result2 = num == 10;
		
		System.out.println("result1:"+result1);
		
	}

}
