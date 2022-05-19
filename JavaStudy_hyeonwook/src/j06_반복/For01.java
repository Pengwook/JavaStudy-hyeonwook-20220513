package j06_반복;

// ;을 잘 주시할것 ;은 벽이라 생각하면 댐. 구분시키는거
// for(선언; 조건; 조건변환수식)
// for문은 선언을 1 조건을 2 실행을 3 조건변환수식을 4로 치면
// 1->2->3->4->2->3->4->2 이런순으로 됨
//while이든 for든 i++; 생략가능 int i = 0; 또한 생략가능 true만 되면 됨
//while은 내마음대로(자유롭게) 반복을 하고싶을때 주로 사용, for문은 규칙적인 반복을 할때 사용
public class For01 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1); 
		}
		
		//while을 줄어둔것이라 생각하면 댐. 밑은 예시
		
		int i = 0;
		while(i < 5) {
			System.out.println(i + 1);
			i++;
		}
		
		for ( i = 0; i < 10; i++) { // 10번 반복해라
			System.out.println(10-i);
		}
	}
}
