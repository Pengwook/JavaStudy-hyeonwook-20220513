package j09_접근지정자.a;

import j09_접근지정자.b.Test2;
// 다른 패키지에 있는걸 끌어써줌. 그럴때 import. 
// public -> 접근지정자 // 다른 패키지에 있어도 접근을 가능하게 해주겠다는 뜻. 접근 제한 없음.
// default -> 동일 패키지 내에서만 접근 가능
// private -> 동일 클래스 내에서만 접근 가능
// protected -> 다른 패키지의 자식 클래스에서까지 접근 가능함. 다른 패키지에 있지만 '상속'을 받아서 접근이 가능하게 할수있음. default 와 동일한 특성을 가짐
// 모든 접근 지정자는 동일 클래스 내에서는 접근 가능함. public 외에는 다른 패키지에서는 접근 불가
// 일단은 public과 private를 외워야댐.
public class TestMain {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.aaa = "안녕";
		
		
		Test2 t2 = new Test2();
		t2.ccc = "바이";

	}

}
