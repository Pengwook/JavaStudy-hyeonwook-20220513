package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.entity.Student;

public class HashSetEx2 {

	public static void main(String[] args) {
		/*
		 * HashSet<Student> 
		 * 20220001, 김준일, "부산대학교"
		 * 20220002, 김준이, "부경대학교"
		 * 
		 * 20220002의 코드를 가진 학생을 조회 -> 한명만 딱 나오게	iterator 사용
		 * 
		 * 20220001의 코드를 가진 학생을 삭제						iterator 사용
		 * 
		 */
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		studentSet.add(new Student(20220001, "김준일", "부산대학교"));
		studentSet.add(new Student(20220002, "김준이", "부경대학교"));
		
		Iterator<Student> iterator = studentSet.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220002) {	// 정수일때 == 문자열일때 equals
				System.out.println(student);   // 20220002의 코드를 가진 학생을 조회
			}
		}
		
		iterator = studentSet.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudentCode() == 20220001) {
				studentSet.remove(student);
			}
		}
		
		System.out.println(studentSet);
		
	}
	
}
