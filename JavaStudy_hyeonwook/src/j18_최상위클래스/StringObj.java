package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		String name = "김준일";	// 리터럴 주소 
		String name2 = "김준일";
		
		System.out.println(name == name2);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름1: ");
		name = scanner.nextLine();	// 각각 생성이 되었기 때문에 주소값 다름. 그래서 false
		System.out.print("이름2: ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);
		
		name = new String("김준일");	// 얘 또한 각각 생성이 되어서 주소값 다름. 얘들도 false
		name2 = new String("김준일");		
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));	// name이랑 name2가 같니?(equals) 라고 물어보는것.
		
	}

}
