package j12_상속;

public class Test1 extends Test{
	
	public Test1() {
		super();	// 부모클래스 생성. 즉 부모임. 부모의 주소를 알려줄땐 super();를 씀. this.는 나자신의 주소	// super는 항상 젤 위, 기본적으로는 super가 생략되어있음.
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인: " + super.toString());	// 부모의 주소값 출력.
	}
}
