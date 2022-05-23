package j08_클래스;

// 참조하겠다 -> 주소를 참조하겠다.
public class FishBunMain {

	public static void main(String[] args) {
		FishBun fishBun = new FishBun();  // 참조자료형 + 변수명 = 값. FishBun(); -> 메소드로 치면 호출. 생성자  // 객체 생성 // 생성해서 어딘가에 보관하는데 보관하는 위치가 바로 메모리 주소
										  // 메모리 주소란 여기선 fishBun	
		fishBun.showInfo();
		fishBun.material = "팥";
		fishBun.dough = "부드러운 반죽";
		fishBun.showInfo();
		
		System.out.println("====================");
		
		FishBun fishBun2 = new FishBun();  // 참조자료형 + 변수명 = 값. FishBun(); -> 메소드로 치면 호출. 생성자  // 객체 생성 
		
		fishBun2.showInfo();
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		fishBun2.showInfo();
		fishBun.showInfo();   // 클래스파일은 하나지만 fishBun 과 fishBun2는 서로 다른존재  
		
		System.out.println(fishBun);
		System.out.println(fishBun2);
	}

}
