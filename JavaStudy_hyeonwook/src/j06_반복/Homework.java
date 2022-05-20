package j06_반복;

/* 숙제
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
*/     

public class Homework {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 5 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	


		
		
	
	