package chap10_polymorphism.tv;

public class AppleTv extends Tv {
	@Override
	public void powerOn() {
		System.out.println("AppleTv");
		super.powerOn();
	}
	
	@Override
	public void powerOff() {
		System.out.println("AppleTv");
		super.powerOff();
	}
	
	// Tv와 AppleTv가 다른 패키지에 속해있기 때문에
	// Default 접그제어자로 선언된 operate메소드는
	// Override 할 수 없다.
//	@Override
//	public void operate(int channel) {		
//	}

	public void testTv() {
		super.powerOn();
		
		super.powerOff();
		
//		super.operate(11);
//		
//		super.channelUp();
	}
}
