package j02_변수와_상수;

public class MaxMin {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		//선언과 초기화를 한번에 한것
		//원래는 final int MAX_NUMBER;
		//       MAX_NUMBER = 100;
		final int MIN_NUMBER;
		MIN_NUMBER = 10;
		// final int MAXNUMBER = 100; 이건 안되고
		// final int MAX_NUMBER는 가능 전부다 대문자는 상수이기 때문
		// maxNumber -> 변수는 소문자로 시작해야댐
		// 대문자로 시작하는건 class
		
		//final int 100 = 100; -> 100이라고 하는 이 상수 안에 들어잇는 값은 고정되어 있구나 그 값때문에 변하지 않는구나
		//100 = 102;
		
		final String PATH = "C:\\junil\\hyeonwook\\workspace";
		
		final double PI = 3.14;
		
		
		
		System.out.println(MAX_NUMBER);
		System.out.println(MIN_NUMBER);
		
	}

}
