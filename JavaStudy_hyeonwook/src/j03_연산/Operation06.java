package j03_연산;

// 조건연산자
// 조건식?결과1:결과2
public class Operation06 {

	public static void main(String[] args) {
		int num = 80;
		
		String result = num % 4 == 0 ? "4의 배수": "4의 배수가 아님";
		boolean result2 = num % 4 == 0 ? true : false;
		int result3 = num % 4 == 0 ? 1 : 0;
		boolean result4 = num % 4 == 0;
		
		// 조건식은 같지만 첫번째는 결과값이 문자열 즉 String
		// 두번째는 boolean
		// 세번째는 int 
		// 즉 해당 결과에 따라서 변수는 자료형이 달라진다 
		// 결과의 자료형과 변수의 자료형은 같아야한다 
		// 삼항연산자에서 결과1,2의 자료형이 서로 다를수는 없다
		// 물론 업캐스팅 되는 경우는 상관없다
		
		
		System.out.println(num % 4 == 0 ? "4의 배수": "4의 배수가 아님");
		
		//num % 4 == 0이 참이니?
		// 참이면 :의 왼쪽 거짓이면 :의 오른쪽
	}

}
