package j17_스태틱.싱글톤;

public class Singleton {
	private static Singleton instance = new Singleton();	// 메소드는 외부에서 static으로 가져올수있음.
	private int count;	// 스태틱 메소드에서는 일반 변수를 사용할 수 없음. 무조건 스태틱 변수여야만 함
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {	// getInstance 의 반환자료형이 Singleton
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트" + count);
	}
}
