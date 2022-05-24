package j09_접근지정자.a;
// 앞으로 모든 변수는 private를 쓴다.
public class Student {   
	private String name;
	private String schoolName;
	
	// 밑에처럼 만드는 방식을 setter 라고 함	
	public void setName(String name) {
		this.name = name;
	}
	
	// 밑은 getter 라고 함		
	public String getName() {
		return name;
	}
}
