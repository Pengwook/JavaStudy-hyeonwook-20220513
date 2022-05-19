package j06_반복;

// 옮기는건 드래그 하고 alt + 방향키
// 다음 반복으로 넘어가라라는 의미
public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {  //짝수일때 출력
				continue;
			}
			System.out.println(i);
		}

	}
	
}
