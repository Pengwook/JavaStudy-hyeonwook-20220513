package j23_예외처리;

/*
 * 프로그램의 오류
 * 1. 예외(프로그램이 실행 중) RuntimeException -> 실행 도중에 일어나는 거
 * 2. 컴파일 에러 -> ex) 드라이버 IOException (프로그램이 실행전에 컴파일 되는 과정중에서 오류가 나는것)
 * 3. 버그
 *	컴파일이 끝나야지만 실행이 됨.
 * 
 */
public class ArrayException01 {

	public static void main(String[] args) {
		// RuntimeException
		// 오류가 날법한 곳을 try로 묶어줘야댐.
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		try {
			for(int i = 0; i < numbers.length + 1; i++) {
				System.out.println("index" + i + ": " + numbers[i]);	// 원래는 8번 인덱스까지만 하지만 length +1 때문에 없는 9번 인덱스까지 하므로 오류가 일어남.
			}
		}catch (StringIndexOutOfBoundsException e) {	// (IndexOutOfBoundsException으로 하면 업캐스팅 개념과 비슷
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
		}catch (Exception e) {			// catch(Exception e) { 는 항상 뒤에 있어야함
			System.out.println(e);		
		}
		System.out.println("지금까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
	}

}
