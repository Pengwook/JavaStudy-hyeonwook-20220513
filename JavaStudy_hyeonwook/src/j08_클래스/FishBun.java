package j08_클래스;
// 변수와 메소드로 이루어짐.
// 틀. 인스턴스를 찍어낼수있음.
// 클래스는 대문자로 시작. 참조자료형임.
// 메소드 밖에 선언한것
// 메인이랑 다른게 뭐냐면 static이 없음
// 클래스에서부터는 배우기 전까지 static을 쓰면 안됨
public class FishBun {  
	String material; //재료   //변수 선언   // 자료형 + 매개변수 리턴 있으면 리턴까지
	String dough; 
	
	FishBun() {  // 생성자 	// 모든 클래스는 이렇게 생성자가 생략되어있다.  // 생성자가 호출을 하면 메모리 주소가 반환되기때문에 생략되어있음
		System.out.println("생성자 호출");
	}
	
	void test() { // 반환자료형이 하나 없고 메소드는 변수처럼 소문자로 시작되어야함
		
		
	}
	void showInfo() {
		System.out.println("재료: " + material);    //변수 사용한것
		System.out.println("반죽: " + dough);
	}
}

