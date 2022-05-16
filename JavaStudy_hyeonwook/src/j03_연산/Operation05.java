package j03_연산;

public class Operation05 {

	public static void main(String[] args) {
		int num = 10;
		num = num + 2; // 나 자신에게 2를 더하고싶다!
		num += 2; // 복합대입연산, 위에것과 같음!
		num %= 3;
		System.out.println(num);
		//10 더하기 2 더하기 2 하고 나누기 3을 한것이기때문에
		//하면 나머지 2 그래서 결과는 2

	}

}
