package j05_조건;

// 자료형이 같아야함
// 괄호 안에 찾고자하는 값이 들어가야댐
// 스위치는 중괄호가 없기 때문에 구분이 안되서 쭉 실행된것
// 스위치 안에 수식도 들어갈 수 있음 ex) switch(num / 10)
//default는 else라 생각하면 좋음 -> 찾고자하는 값이 없을때 default로 오는것
public class SwitchCase {

	public static void main(String[] args) {
		int num = 29;
		char c = 'd';
		String str = "강주현";
		
		switch(num / 10) {
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			default:
				System.out.println("찾을 수 없음");
		}
		switch(c) {
			case 'a':
				System.out.println("case a");
				break;
			case 'b':
				System.out.println("case b");
				break;
			case 'c':
				System.out.println("case c");
				break;
			default:
				System.out.println("찾을 수 없음");
		}
		switch(str) {
			case "김준일":
				System.out.println("case 김준일");
				break;
			case "박준형":
				System.out.println("case 박준형");
				break;
			case "한재안":
				System.out.println("case 한재안");
				break;
			default:
				System.out.println("찾을 수 없음");
		}

	}

}
