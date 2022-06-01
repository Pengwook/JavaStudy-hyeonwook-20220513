package j18_최상위클래스;

import java.util.Objects;

/*
 * 
 * Object class(최상위 클래스) 
 * Object : 모든 객체를 말함
 * 모든 클래스에 다 있지만 생략되어있음.
 * 
 * 
 */

public class Teacher extends Object {
	private String name;
	private String subject;
	private int age;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	
	//@Override
	//public boolean equals(Object obj) {
	//	if(obj instanceof Teacher) {	// instanceof가 없을땐 teacher 대신 student가 들어오면 오류가 뜸
	//		Teacher teacher = (Teacher) obj;	// 다운캐스팅
	//		
	//		if(this.name.equals(teacher.name) && this.subject.equals(teacher.subject) && this.age == teacher.age) {	// 문자열 비교일때는 equals를 씀.
	//			return true;
	//		}
	//	}
	//	return false;
	//	}
	
	@Override	// 위에 오버라이드 한것과 같음.
	public int hashCode() {	// hashCode -> 주소값. 기본적으로 int 자료형임.
		return Objects.hash(age, name, subject);	
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	// 서로 같은지 먼저 확인
			return true;
		if (obj == null)	// 무조건 다른 객체
			return false;
		if (getClass() != obj.getClass())	// ObjectClass 안에 들어있는 getClass를 뜻함. 클래스정보를 가지고있음. 자료형. 클래스내부에 있는 정보들을 말함.
			return false;					// (getClass() != obj.getClass()) -> instanceof랑 똑같은 역할을 함.
		Teacher other = (Teacher) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	public void classInfo() {
		//System.out.println(Teacher.class.);
		//System.out.println(this.getClass()); // 위와 동일함.
		System.out.println();
	}
	
//	@Override
//	public String toString() {
//		return super.toString();	 부모의 toString 메소드를 호출해옴  즉, 상속되있음.
//		return "이름: " + name + ",과목: " + subject;
//	}
	
}
