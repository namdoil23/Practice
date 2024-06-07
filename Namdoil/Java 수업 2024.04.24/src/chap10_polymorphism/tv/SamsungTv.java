package chap10_polymorphism.tv;

public class SamsungTv extends Tv {
	@Override
	public void powerOn() {
		System.out.println("OLED");
		super.powerOn();
	}
	@Override
	public void powerOff() {
		System.out.println("OLED");
		super.powerOff();
	}
	@Override
	public void operate(int channel) {
		System.out.println("OLED");
		super.operate(channel);
	}
	
}
