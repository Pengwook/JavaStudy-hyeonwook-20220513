package j22_람다식;
// 람다식도 익명클래스에서 파생된것.
// 인터페이스는 생성할수 없음.	-> 구현을 해야댐.
// 람다는 무조건 하나의 메소드만 가짐.
public class Main {

	public static void main(String[] args) {
		Math2 m2_1 = new Math2Impl();
		Math2 m2_2 = new Math2() {
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1 * value2;
			}
		};
		// 결과가 return 밖에 없을 때 중괄호({}) 생략 
		Math2 m2_3 = (v1, v2) -> v1 / v2;	// 람다식
		
		Math2 m2_4 = (v1, v2) -> {return v1 % v2;};	// 요기 중괄호{}는 메소드임. 그리고 구현체이기 때문에 ;가 필요함.	위아래 같은 방식임.
//	
//		Math2 m2_4 = (v1, v2) -> {
//			v1 += 2;
//			v2 -= 1;
//			return v1 % v2;	위와 같음.
//	};
		double t = m2_3.calc(10, 3);			
		System.out.println(t);
	}
}