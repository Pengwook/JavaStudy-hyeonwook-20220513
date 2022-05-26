package j11_배열;

// 반복문을 쓰기 위해서 배열을 쓰는것.
// 클래스들도 배열로 선언할수있다.

public class Array01 {

	public static void main(String[] args) {
		// 배열을 선언하기 위해서 해야하는것(배열을 만드는 방법)
		
		// 1. 배열의 공간(크기)을 정해서 생성
		int[] numbers = new int[10];	// 값이 들어있지 않음. 공간만 10개로 만든거기때문.
		
		// 2. 배열에 들어갈 값을 미리 정해서 생성
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};	// 0-9번째 인덱스까지 존재 // 그리고 그 각각에 값이 대입됨.
		char[] characters = {'a' , 'b', 'c', 'd', 'e' };
		boolean[] booleans = {true, true, true, false, false};
		
		String[] strArray = new String[5];
		String str = "test";	// 이렇게 쓰면 리터럴주소
		
		System.out.println("numbers의 길이: " + numbers.length);
		System.out.println("strArray의 길이: " + strArray.length);
		
		for(int i = 0; i < numbers.length; i++) {	// numbers.length -> 배열의 크기만큼 반복해라
			System.out.println("i: " + i);
			System.out.println("numbers: " + numbers[i]);
			System.out.println("numbers2: " + numbers2[i]);	
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);	// 주소가 없는것이 바로 null -> 0번째 주소값
		}
	}

}
