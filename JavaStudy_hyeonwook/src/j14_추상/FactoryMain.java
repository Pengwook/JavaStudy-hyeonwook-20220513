package j14_추상;

public class FactoryMain {

	public static void main(String[] args) {
		Factory samsung = new SamsungFactory();	//
		Factory lg = new LGFactory();			
		
		// Factory클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성.	
		Factory[] factorys = new Factory[2];	// 업캐스팅하는 이유: 이렇게 배열로 묶기 위해서 
		
		factorys[0] = new SamsungFactory();	// 처음에 만들면 null이기 때문에 이렇게 대입해줌.	// 업캐스팅
		factorys[1] = new LGFactory();	// 업캐스팅	
		
		for(Factory factory : factorys) {	//foreach: 처음부터 끝까지 반복
			factory.start();
		}
		
		for(Factory factory : factorys) {
			factory.stop();
		}
	}

}
