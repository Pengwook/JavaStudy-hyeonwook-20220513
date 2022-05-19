package j06_반복;

// for문 별찍기!
public class Star {
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * 반복문 안에서 반복문이 돈다
	 * j--로 하면 반복횟수가 꼬여서 힘들수 있음
	 * 
	 * 
	 * 숙제
	 *    *  스페이스4번후 별
	 *   *   스페이스3번후 별
	 *  *
	 * *
	 **      
	 *
	 *다음 숙제
	 * *****  스페이스1번후 별
	 *  ****  스페이스2번후 별
	 *   ***
	 *    **     
	 *     *
	 *     
	 *그 다음 숙제
	 *     *
	 *    ***     
	 *   *****
	 *  *******
	 * *********     
	 * 
	 *     
	 */

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
