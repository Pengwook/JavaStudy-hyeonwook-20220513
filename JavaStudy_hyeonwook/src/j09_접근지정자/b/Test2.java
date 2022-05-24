package j09_접근지정자.b;

import j09_접근지정자.a.Test1;

// 생성자는 기본적으로 public으로 잡혀있음.
// 다른 패키지에서도 생성은 되어야됨.
public class Test2 {
	public String ccc;  // 개별적으로 접근을 지정할수있음
	String ddd;
	
	public Test2() {
		Test1 t1 = new Test1();
	}
}
