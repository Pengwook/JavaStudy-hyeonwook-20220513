package j03_연산;

public class Operation07 {

	public static void main(String[] args) {
		// 4의 배수 이면서(&&) 100의 배수가 아니거나(||) 400의 배수
		// 참이면 윤년
		// 거짓이면 윤년이 아님
		// 선언이라 하는것은 자료형과 변수명을 동시에 쓰는것 
		// 선언은 딱 한번! 그 이후로는 자료형 없이 사용
		
		int year = 1999;
		
		String result = null; // null은 클래스에서 자세한 설명. 일단은 빈값이라는 뜻
		result = year % 4 == 0 // String result = X, String을 한번 더 쓰는거 즉, 변수 선언을 2번하는거는 안댐 
				&& year % 100 != 0 
				|| year % 400 == 0 ?
				"윤년":"윤년이 아님";
		
		// year = 2000; 이면 윤년이 나옴
		
		
		System.out.println("결과: " +result);

	}

}
