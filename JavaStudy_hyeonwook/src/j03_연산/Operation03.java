package j03_연산;

public class Operation03 {

	public static void main(String[] args) {
		/*
		 * year = 1999
		 *  
		 * result = False 가 되게끔
		 *  
		 * 년도가 4의 배수이면 True 아니면 False
		 * 
		 * year를 4로 나누었을때 0이면 true 아니면 false
		 * 
		 * 풀이
		 * 
		 * int year = 1999;
		 * boolean result = year % 4 == 0;
		 * System.out.println(result); 
		 * year이 2000이면 true
		 * 
		 * result = 공식이 들어갈 자리
		 * 
		 * 윤년이면 true 아니면 false
		 * 윤년은 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
		 * 
		 */
		
		int year = 2000;
		boolean result1 = year % 4 == 0; // <4의 배수
		boolean result2 = year % 100 != 0; // 100의 배수가 아닐때
		boolean result3 = year % 400 == 0; // 400의 배수일때> 요기까지는 관계연산자
		boolean result4 = result1 && result2 || result3; // 논리연산자
		
		//한번에 쓸려면?
		boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(result4);
		System.out.println(result);
		
		// 년도가 1999면 윤년이 아님 false
		
	}

}
