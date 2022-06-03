package j20_컬렉션.ArrayList;

import java.util.ArrayList;

import j20_컬렉션.entity.Student;

public class ArrayListEx3 {

	public static void main(String[] args) {

	/*
	 * 
	 * 1.Student 자료형을 담을 수 있는 ArrayList를 생성.	// 학생 student객체를 담을수 있는 ArrayList 만들기
	 * 
	 * 2.학생정보 추가
	 * studentCode name schoolName
	 * 20220001 김준일 부산교육대학원
	 * 20220002 곽나경 부산대학교
	 * 20220003 정현경 부경대학교
	 * 20220004 한재안 부산대학교
	 * 20220005 전주홍 동아대학교
	 * 
	 * 3.전체 학생 정보 출력 -> 리스트 그냥 출력
	 * 
	 * 4.인덱스 3의 위치에 삽입
	 * 	20220006 한대경 서울대학교
	 * 
	 * 5.인덱스 2의 위치에 있는 학생의 학교명을 고려대학교로 바꾸기	
	 * 
	 * 6.인덱스 5의 위치에 있는 학생의 정보를 수정 set
	 * 20220007 김나예 부산여자중학교
	 * 
	 * 7.인덱스 0의 위치에 있는 학생의 정보를 삭제
	 * CRUD 해봐따
	 */
		ArrayList<Student> studentList = new ArrayList<Student>();	// 1. Student 자료형을 담을 수 있는 ArrayList를 생성. 학생 student객체를 담을수 있는 ArrayList 만들기
		
		studentList.add(new Student(20220001, "김준일", "부산교육대학원"));	// 2. 학생정보 추가
		studentList.add(new Student(20220002, "곽나경", "부산대학교"));
		studentList.add(new Student(20220003, "정현경", "부경대학교"));
		studentList.add(new Student(20220004, "한재안", "부산대학교"));
		studentList.add(new Student(20220005, "전주홍", "동아대학교"));
		
		System.out.println(studentList);	// 3. 전체 학생 정보 출력
		
		studentList.add(3, new Student(20220006, "한대경", "서울대학교")); // 4. 인덱스 3의 위치에 삽입
		
		
		studentList.get(2).setSchoolName("고려대학교");	// 5. 인덱스 2의 위치에 있는 학생의 학교명을 고려대학교로 바꾸기	// getter setter

		
		studentList.set(5, new Student(20220006, "김나예", "부산여자중학교")); // 6. 인덱스 5의 위치에 있는 학생의 정보를 수정	// 새로운 객체로 바꿔치기한것
		
	
		studentList.remove(0);	// 7. 인덱스 0의 위치에 있는 학생의 정보를 삭제
		
		System.out.println(studentList);
	}
}