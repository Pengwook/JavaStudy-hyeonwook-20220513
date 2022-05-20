package j07_메소드;

//메소드 오버로딩 -> 매개변수가 다른것, 리턴자료형이 다르다고 오버로딩이 되진않음. 오버로딩을 결정하는건 매개변수임.
//메소드명은 원래 똑같은 메소드명을 쓸수없지만 메소드 오버로딩이라는것을 쓰면 같은 메소드명이 가능함.
//변수명은 전혀 상관이 없고 자료형이 중요함.
//매개변수는 들어오는 순서가 중요함.
public class Method03 {
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");
	}
	
	public static void test1(int num) {
		System.out.println("int 자료형 매개변수가 하나인 test1 호출");
	}
	public static void test1(int num1, int num2) {
		System.out.println("int 자료형 매개변수가 둘인 test1 호출");
	}
	public static void test1(double a) {
		System.out.println("double자료형 매개변수가 하나인 test1 호출");
	}
	public static void test1(int num, double dNum) {
		System.out.println("int 자료형 다음에 double자료형 매개변수가 둘인 test1 호출");
	}
	public static void test1(double dNum, int num) {
		System.out.println("double 자료형 다음에 int자료형 매개변수가 둘인 test1 호출");
	}

	public static void main(String[] args) {     // 호출할때 어떤 자료형이 나오는지 어떤 순서로 나오는지 중요
		test1();  		// 매개변수가 없는게 나옴
		test1(10); 		// 매개변수가 하나인게 나옴
		test1(10,20); 	// 매개변수가 두개인게 나옴
		test1(3.14);
		test1(10,3.14);
		test1(3.14,10);

	}

}
