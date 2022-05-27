package j13_다형성;

public class FactoryMain2 {

	public static void main(String[] args) {
		Factory[] factorys = new Factory[100];
		
//		factorys[0] = new SmartPhoneFactory();	// 둘다 업캐스팅이 가능하기 때문에 이렇게 들어갈수있음. 업캐스팅을 하면 부모의 메소드 밖에 사용못함
//		factorys[1] = new ComputerFactory();
//		
		for(int i = 0; i < factorys.length; i++) {
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();	// i 가 짝수면은 스마트폰팩토리에 생성하여 담고 아니면 컴퓨터팩토리에 생성하여 담음. 
																						// 삼항연산자 조건연산자
		}
		// foreach
		for(Factory factory : factorys) {
			factory.start();
		}
		// 다운캐스팅
		
		int i = 10;
		double d = i;
		int ii = (int) d;
		
		System.out.println();
		
		for(Factory factory : factorys) {	// 스마트폰팩토리를 팩토리로 바꾸고 다시 그 팩토리를 스마트폰팩토리로 바꿈.
			//인스턴스오브	// 생성된 객체 -> 인스턴스
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;
				spf.showSmartPhone();
				
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
				
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
		}
	}

}
