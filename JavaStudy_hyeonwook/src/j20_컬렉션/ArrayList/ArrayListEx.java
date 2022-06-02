package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		String[] strArray = new String[5];
		strArray[0] = "a";
		strArray[1] = "a";
		strArray[2] = "a";
		strArray[3] = "a";
		strArray[4] = "a";
		
		strArray[2] = null; // 값을 지우는것
		
		for(String str : strArray) {	//foreach
			System.out.println(str);
		}
		
		for(int i = 0; i < strArray.length; i++) {	// 그냥 for문으로 한것
			System.out.println(strArray[i]);
		}
		ArrayList<String> strArrayList = new ArrayList<String>();	// ArrayList는 size를 정하지않아도 유동적으로 늘었다 줄었다함. 배열처럼 정해진것이 아님.
		strArrayList.add("b1");										// 어느 인덱스에 들어갈지도 안정했지만 알아서 들어감.
		strArrayList.add("b2");
		strArrayList.add("b3");
		strArrayList.add("b4");
		strArrayList.add("b5");
		strArrayList.add("b6");
		
		System.out.println(strArrayList.size());
		
		strArrayList.remove("b1");
		strArrayList.remove(0);
		
		for(String str : strArrayList) {
			System.out.println(str);
		}
		
		for(int i = 0; i < strArrayList.size(); i++) {
			System.out.println(strArrayList.get(i));
		}
	}

}
