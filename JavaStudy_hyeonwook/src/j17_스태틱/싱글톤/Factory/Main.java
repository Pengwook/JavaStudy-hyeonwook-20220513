package j17_스태틱.싱글톤.Factory;

public class Main {

	public static void main(String[] args) {
		KIA kiaFactory1 = KIA.getInstance();	// 셋다 같은 객체
		KIA kiaFactory2 = KIA.getInstance();
		KIA kiaFactory3 = KIA.getInstance();
		
		Car k5_01 = kiaFactory1.createCar("k5");
		Car k5_02 = kiaFactory1.createCar("k5");
		
		kiaFactory1.carInfo(k5_01);
		kiaFactory1.carInfo(k5_02);
		
		Car k7_01 = kiaFactory1.createCar("k7");
		Car k7_02 = kiaFactory1.createCar("k7");
		
		kiaFactory2.carInfo(k7_01);
		kiaFactory2.carInfo(k7_02);	// 똑같은 클래스를 그대로 가져옴. 변수명만 다름.
	}

}
