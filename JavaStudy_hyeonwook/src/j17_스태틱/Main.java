package j17_스태틱;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t.count = 10;
		t2.count = 20;
		t3.count = 30;
		
		t.method();
		t2.method();
		t3.method();

//		StaticTest st = new StaticTest();		// 생성이 되고 메모리 영역을 차지하고있지만, 안은 텅 비어있다고 보면 됨.
//		StaticTest st2 = new StaticTest();
//		StaticTest st3 = new StaticTest();
//		
//		st.count = 10;
//		st2.count = 20;
//		st3.count = 30;
//		
//		
//		st.staticMethod();
//		st2.staticMethod();
//		st3.staticMethod();
		
		StaticTest.count = 100;	// 생성하지않고 쓰고있음.
		
		StaticTest.staticMethod();
	}

}
