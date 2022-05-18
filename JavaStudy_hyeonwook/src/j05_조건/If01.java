package j05_조건;

// if와 else 
// if문
// 들여쓰기는 tab으로 구분
// 반대로 들여쓰기는 shift tab
//개발사 필독서:클린코드
// if else를 변형시킨게 else if

public class If01 {

	public static void main(String[] args) {
		int num = 10;
		
		System.out.println("프로그램 시작");
		
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		}else {
		if(num < 5) {
			System.out.println("5보다 작습니다.");
		}else {
			System.out.println("num이 5입니다.");
		}
		// if() 이렇게 if 다음 if를 또 쓰는건 안됨
	}
		System.out.println("프로그램 종료");
		// 이 위에 작성예시가 한묶음임
		// 위 부분은 경우의 수가 3가지인 경우
	}

}
