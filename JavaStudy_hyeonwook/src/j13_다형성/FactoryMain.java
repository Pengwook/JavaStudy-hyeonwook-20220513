package j13_다형성;

public class FactoryMain {

	public static void main(String[] args) {
		Factory smartPhoneFactory = new SmartPhoneFactory();
		Factory computerFactory = new ComputerFactory();
		// 위는 아래를 업캐스팅을 한것
		//	SmartPhoneFactory smartPhoneFactory = new SmartPhoneFactory();
		//	ComputerFactory computerFactory = new ComputerFactory();
		
		smartPhoneFactory.start();
		computerFactory.start();
	}

}
