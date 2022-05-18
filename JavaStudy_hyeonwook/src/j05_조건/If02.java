package j05_조건;

//실행 명령문이 하나면 중괄호{} 생략가능
public class If02 {

	public static void main(String[] args) {
		//int num = 5;
		
		//if(num > 5) System.out.println("5보다 큽니다.");
		//else System.out.println("5보다 크지 않습니다");
		
		int score = 85;
		
		if(score == 100) {
			System.out.println("만점입니다.");
		}else if(score > 89) {
			System.out.println("90점 이상입니다.");
		}else if(score > 79) {
			System.out.println("80점 이상입니다.");
		}else {
			System.out.println("...");
			}
		}
	}
 // 위는 else if 예시		
