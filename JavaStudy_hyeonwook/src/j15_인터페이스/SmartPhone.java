package j15_인터페이스;

public class SmartPhone {
	
	private final Hdmi hdmi;	// final을 붙이는 이유: 상수 // 상수는 선언을 하고나서 초기화를 안할수없음. 
								// private -> 외부에서 건들수없게 만듦.	// final이라 되있는 애들은 보통 getter, setter를 주지않고 setter는 어차피 못만듦.
	public SmartPhone(Hdmi hdmi) {	
		this.hdmi = hdmi;
	}
	
	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다.");
		hdmi.connect();
	}
	
	public void powerOff() {
		System.out.println("스마트폰의 전원을 끕니다.");
		hdmi.disconnect();
	}
}
