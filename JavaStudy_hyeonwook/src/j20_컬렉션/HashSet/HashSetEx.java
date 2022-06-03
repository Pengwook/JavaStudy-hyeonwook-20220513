package j20_컬렉션.HashSet;
// set 인터페이스	- 순서x , 중복x , 수정 불가 -> 기준값이 없기 때문에 수정할려면 값을 삭제하고 추가해야댐. remove 한뒤 add
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<String> name = new HashSet<String>();
		
		name.add("김준일");
		name.add("김준이");
		name.add("김준삼");
		name.add("김준사");
		name.add("김준일");
		name.add("김준일");
		
		System.out.println(name);
		
		Iterator<String> iterator = name.iterator();	// 값을 꺼낼때 사용. iterator 줄세워서 나타남.	iterator는 한번밖에 못씀.
		while(iterator.hasNext()) {	// true가 되면 반복이됨. // false가 되면 iterator.next() // hasNext() -> 다음 객체가 존재하는지 확인하는 메소드
			String name2 = iterator.next();
			if(name2.equals("김준이")) {	
				System.out.println(name2);	
			}
		}
		
		name.remove("김준사");
		System.out.println(name);
		
	}

}
