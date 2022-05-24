package j07_메소드;
// class 안에 정의된 함수를 메소드라고 함. -> 자바에서 모든 함수는 메소드
// 프로그램은 메인함수가 먼저 실행됨.
// 반환이 없으면 void가 들어감. 즉 return 할게없다라는것.
// 매개변수와 반환은 전혀 상관없음.
public class Method02 {
	
	// 매개변수가 없으면서 반환도 없는 메소드  // 괄호 안에 아무것도 없고 void
	public static void test1() {
		System.out.println("test1 메소드 실행");
	}
	
	// 매개변수는 있고 반환이 없는 메소드
	public static void test2(int age, int year) {  // 괄호 안에 들어있는 int age같은것들이 매개변수라고 함. 
		System.out.println("나이:" + age);
		System.out.println("출생년도:" + year);
	}
	
	// 매개변수가 없고 반환이 있는 메소드
	public static String test3() {   // 여기에 void 대신 String을 넣은건 String을 return 하였기 때문, 즉 문자열만 return 가능
		return "김준일";      // return 문자열  // 이거자체가 값임. 그러니 test3(); 자체가 값이므로 출력도 가능함
	}						// 값이니 변수에도 담을수가 있다.
	
	public static int test4() {  // 리턴자료형(반환자료형), 클래스도 반환이 가능함. 
		return 10000;  
	}
	
	// 매개변수도 있고 반환도 있는 메소드      // 매개변수는 갯수가 상관이 없고 return은 무조건 하나
	public static String test5(String name, int num) { // 문자열과 숫자를 더하면 문자열
		return name + num;
	}
	
	// 리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법  // i가 6이 되는 시점에 메소드가 탈출을 한다 // 반복을 쭉하다가 if에서 return을 만나게 되어서
	public static void test6() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return; //break; 을 넣으면 반복문만 멈추는것이니까 밑에 정상종료되었다라는게 뜨지만
						//return; 은 메소드를 멈춰버리니까 완전히 멈춰버리는것이므로 안뜸. return은 어느구간에서든 사용할수있음.
			}
		}
		System.out.println("test6가 정상 종료되었습니다.");
	}
	
	public static void main(String[] args) {
		System.out.println("메인함수 시작");
		test1(); //호출
		test2(29, 1994);
		String name = test3();
		System.out.println(test3());
		System.out.println(test5("김준일", 1));
		test6();
		System.out.println("메인함수 끝");

	}

}
