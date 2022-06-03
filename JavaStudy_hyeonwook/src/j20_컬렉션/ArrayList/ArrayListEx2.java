package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>(); 
		ArrayList<String> nameList2 = nameList;
		
		//리스트에 값 추가 -> add()
		nameList.add("김준일");
		nameList.add("곽나경");
		nameList.add("김서홍");
		nameList.add("최보성");
		nameList.add("박준형");
		nameList.add("강주현");
		nameList.add("유재원");
		
		//리스트 중간에 값 삽입 -> add() 두번째꺼
		nameList.add(0, "이동영");
		
		//리스트 내의 해당 인덱스 값 수정
		nameList.set(1, "정유진");
		
		//리스트 내에서 인덱스로 값 삭제. 얜 remove(인덱스)
		nameList.remove(3);
		
		//리스트 내에서 값을 바로 삭제. 얜 remove(오브젝트)
		nameList.remove("강주현");
		
		//리스트에서 리스트로 값 옮기기(깊은 복사 -> 통째로 옮기는거) addAll 첫번째꺼	//얇은 복사 -> 주소값만 옮기는거,
		
		nameList.addAll(nameList2);
		
		
		//리스트 내의 모든 값 확인 -> toString()
		System.out.println(nameList);	// -> toString() 생략되어있음.
		
		//리스트에서 값 가져오기 -> get(인덱스 번호)
		System.out.println(nameList.get(3));
		
		//리스트 내에서 원하는 값이 있는지 확인
		System.out.println(nameList.contains("김준일"));
		System.out.println(nameList.contains("이동영"));
		
		//리스트내에 값이 하나라도 있으면 비우기, 비어있으면 true임. 그러니 비어있지 않을때 실행되야댐
		if(!nameList.isEmpty()) {	// isEmpty() -> 안이 비었니?
			nameList.clear();
		}
		
		System.out.println(nameList);
		System.out.println(nameList2);
		
		//리스트를 배열로 전환
		Object[] objs = nameList2.toArray();
		for(Object obj : objs) {	// foreach로 다운캐스팅
			System.out.println((String) obj);
		}
		
	}
}
