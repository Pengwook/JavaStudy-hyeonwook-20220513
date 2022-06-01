package j18_최상위클래스;

public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("김준일", "웹개발"); 
		Teacher t2 = new Teacher("김준일", "웹개발");
		
		System.out.println(t1.toString());	// toString은 생략이 가능하다.
		System.out.println(t2);
		System.out.println(t1== t2);	// == 는 주소값이 같은지 비교할때 사용한다
		System.out.println(t1.equals(t2));	
		System.out.println(t1.hashCode() == t2.hashCode());
	}
	
//	public void test(Object obj) {
//		System.out.println(obj.toString());
//		if(obj instanceof Teacher) {
//			Teacher teacher = (Teacher) obj;	// 다운캐스팅 시킨것. 
//		}
//	}
}
