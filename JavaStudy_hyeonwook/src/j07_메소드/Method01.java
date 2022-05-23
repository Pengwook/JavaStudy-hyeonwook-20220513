package j07_메소드;

// 함수를 넣을려면 public static 필요
// 메소드라는 애는 호출과 반환이 있어야하는데 반환이 없는 경우도 있음
import java.util.Scanner;

public class Method01 {
	// 함수라고 하는 녀석들은 가능하면 동사형태로 만들어줘야댐. 변수들은 명사형태로 만들어줘야댐. 변수들은 값이 고유하게 들어있기때문에
	public static int calcformula1(int a, int b, int c, int d, int e) {   // 얘는 main이랑 별개로 class에 존재하는것 //입력
		int result = a + (b * c) - (d * e);
		return result; // 결과를 반환을 해줌 //출력
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d, e;
		int r1, r2, r3, r4 = 0;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		
		// x + y = z
		
		r1 = calcformula1(a, b, c, d, e);  // 위에서 반환을 해준것을 사용 //호출
		// 소스코드 만줄
		r2 = calcformula1(10, 20, 5, 30, 2); // 똑같은 공식이지만 들어오는 값에 따라 다르게 나타남. 얘는 직접 값을 넣은 경우
		// 소스코드 천줄
		r3 = calcformula1(a, b, c, d, e);
		// 소스코드 이천줄
		r4 = calcformula1(a, b, c, d, e);	
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
	}

}
