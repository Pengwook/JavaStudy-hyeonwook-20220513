package j09_접근지정자;

import j09_접근지정자.a.Student;
import j09_접근지정자.b.Teacher;

public class UserMain {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		student.setName("길현욱");
		System.out.println(student.getName()); // 해당 클래스한테 해당 클래스에 있는 getter setter에 부탁을 하는것. 값을 넣을때도 가져올때도
		
		teacher.setName("김준일");
		teacher.setAddress("부산");
		teacher.setPhone("010-9918-1916");
		teacher.showInfo();
	}

}
