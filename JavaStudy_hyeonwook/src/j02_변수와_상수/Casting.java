package j02_변수와_상수;

public class Casting {

	public static void main(String[] args) {
		// 업캐스팅 - 문자 -> 정수 -> 실수
		char a = 'A';
		System.out.println(a);
		int b = a;
		System.out.println(b);
		// 문자에서 숫자로 자료형태가 바뀜
		double c = b;
		System.out.println(c);
		int d = (int) c; 
		// c라고하는 변수를 int로 바꾼다는 명시, 컴파일러가 해석하다가 개발자가 의도한거라고 알고 그대로 실행시켜줌
		//int d = c; 이렇게는 안댐,c는 안댐, 데이터의 손실이 일어나기 때문에 
		  
		System.out.println(d);
		char e = (char) d;
		System.out.println(e);
		 
		// 다운캐스팅 - 실수 -> 정수 -> 문자

	}

}
