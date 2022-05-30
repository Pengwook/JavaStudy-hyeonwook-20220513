package j14_추상;
/*
 * abstract(추상)
 * 
 * 추상 메소드 특징
 * 1. return type 앞에 abstract 키워드가 붙는다.
 * 2. 추상 메소드는 일반 클래스 안에 선언할 수 없다.
 * 3. 상속 또는 구현된 클래스에서 무조건 override(재정의)가 되어야한다.
 * 
 * 추상 클래스 특징
 * 1. 클래스 type 앞에 abstract 키워드가 붙는다.
 * 2. 추상 클래스는 생성할 수 없다.		// 추상 클래스는 new 할 수 없음 단순히 설계도 역할.
 * 3. 추상 메소드를 포함 할 수 있다. 하지만 추상 메소드를 꼭 포함하지는 않아도 된다.
 * 
 */


// 추상 클래스	
public abstract class Factory {
	
	// 추상 메소드	// 꼭 override 해야함
	public 	abstract void start();
	
	// 일반 메소드	// 꼭 override 할 필요는 없음.
	public void stop() {
		System.out.println("공장을 멈춥니다.");
	}
	
//	private void test() {	// private 메소드 또는 변수들은 상속 받을수 없음.
//		
//	}
}
