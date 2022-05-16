package j03_연산;

public class Operation01 {

	public static void main(String[] args) {
		// int num = 10;
		// System.out.println(num); 하였을때 결과값이 10인데 11로 나오게 하기
		
		int num = 10;
		num= num+1; //이렇게 넣으면 11로 출력
		// num++; 이렇게 해도 11로 출력-> 선증가
		//++num; 이것도 되긴함-> 후증가
		System.out.println(num++); //후증가는 지금 현재는 1증가 x 그 다음줄부터 1증가
		System.out.println(num);
		
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(num);
		
		// --num -> 선감소
		// num-- -> 후감소
	}

}
