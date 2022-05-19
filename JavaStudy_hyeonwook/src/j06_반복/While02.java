package j06_반복;

public class While02 {

	public static void main(String[] args) {
		/*
		 * 구구단 2단 출력
		 * 
		 * 2 X 1 = 2   -> 2는 dan 1은 num
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * ...
		 * 2 X 9 = 18   -> 1~9 즉 9번 반복되게끔 만들어줘야댐
		 * 
		 * 문자열임
		 * 
		 */
		
		int dan = 2;
		int num = 0;
		
		
		
		while(num < 9) {
			System.out.println(dan + "X" + (num + 1) + "=" + dan * (num + 1)); // X라는걸 못읽기때문에 문자열로 만들어줘야댐
			num++;
		}
		
	}

}
