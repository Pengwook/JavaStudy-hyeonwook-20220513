package j06_반복;

// 반복문 1~100까지 더하세요
// 핵심: 이게 조건이 참일때만 반복을 하겠다. 즉 거짓일때는 멈춤.
// 반복은 대부분 1씩 증가
// 보통은 후증가(i++;)을 마니 씀
// 프로그램은 항상 0부터 시작함
public class While01 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		
		
		while(i < 100) {
			//i = i + 1;
			//i += 1;
			//i++;
			//++i;
			// 밑에 2개는 무조건 1씩 증가
			// 위에 2개는 잘 안쓰고 주로 밑에 2개를 씀 i++ 과 ++i
			
				result = result + (i + 1);
				i++; // 이것은 항상 젤마지막에 붙여주면 댐, 조건 변화 수식
				System.out.println(result);
		}
	}
}
