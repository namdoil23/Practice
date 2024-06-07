package chap10_polymorphism.tv;

public class LgTv extends Tv {

	@Override
	public void powerOn() {
		System.out.println("QLED");
		// super 키워드로 생성자를 호출할 때는 항상 최상단에서 사용해야하지만
		// 인스턴스 메소드를 사용할 때는 위치는 중요하지 않다.
		super.powerOn();
		
	}
	
	@Override
	public void powerOff() {
		System.out.println("QLED");
		super.powerOff();
	}
	
	@Override
	public void operate(int channel) {
		System.out.println("QLED");
		super.operate(channel);
	}
	
	public void testTv() {
		// 부모클래스에 public으로 선언된 메소드
		super.powerOn();
		// 부모클래스에 protected로 선언된 메소드
		super.powerOff();
		// 부모클래스에 defailt로 선언된 메소드
		super.operate(11);
		// 부모클래스에 private으로 선언된 메소드
		// super.chnnelUP();
		
	}
	

		
}
