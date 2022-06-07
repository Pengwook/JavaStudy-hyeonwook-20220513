package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
		// 값 추가
		studentMap.put(20, "김준일");
		studentMap.put(10, "김준이");
		studentMap.put(22, "김준삼");
		studentMap.put(33, "김준사");
		studentMap.put(44, "김준오");		// key 값이 중복될 수 없기때문에 맨 마지막이 나옴.
		
		System.out.println(studentMap);
		
		// key 값으로 value 가져오기
		System.out.println(studentMap.get(10));	// 10번 인덱스가 아닌 10번 key임.
		
		// 수정
		studentMap.put(10, "김준육");	// 이렇게 해도 10번 key값에 덮어 씌울순 있음. 근데 별로 안좋음.	key 값이 없을 경우 추가가 됨.
		studentMap.replace(10, "김준칠");	// put은 값이 없을때 값이 추가가 되지만 replace는 값이 없으면 수정할 사항이 없는거임. 그러므로 수정만 원할때는 replace를 써야댐.
		
		studentMap.remove(10);
		
		Iterator<Integer> iterator = studentMap.keySet().iterator();	// keySet() 까지는 set임.
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
//			if(value.equals("김준오")) {
//				System.out.println(studentMap.get(key));
//			}
			System.out.println(value);	// 이렇게 전체 출력도 가능함.
		}
		
		// 람다식(함수형 프로그래밍) -> 함수 그 자체를 값으로 사용하는것.		// 함수명이 없기때문에 익명함수라고 함.	
		studentMap.forEach(		// forEach는 메소드		// void를 생략할 수 있는 이유: 
		(k, v) -> {	// 매개변수 안에는 값이 들어가야하는데 메소드가 들가있음
			System.out.println("key: " + k);
			System.out.println("value: " + v);
			}
		);
		
//		void test(Integer k, String v) {
//			System.out.println("key: " + k);
//			System.out.println("value: " + v);
//		}
		
		System.out.println(studentMap.containsKey(22));
		System.out.println(studentMap.containsValue("김준구"));
	}
}
