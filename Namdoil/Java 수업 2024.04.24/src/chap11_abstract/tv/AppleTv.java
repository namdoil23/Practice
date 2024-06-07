package chap11_abstract.tv;

public class AppleTv extends Tv {
	@Override
	public void powerOn() {
		System.out.println("APPLE TV의 전원을 켭니다.");
		// super 키워드로 생성자를 호출할 때는 항상 최상단에서 사용해야하지만
		// 인스턴스 메소드를 사용할 때는 위치는 중요하지 않다.
//		super.powerOn();
		
	}
	
	@Override
	public void powerOff() {
		System.out.println("APPLETV의 전원을 끕니다.");
//		super.powerOff();
	}
	
	@Override
	public void operate(int channel) {
		this.lastChannel = channel;
		System.out.println("APPLE"+ this.lastChannel +"로 이동합니다.");
//		super.operate(channel);
	}
	
//	public void testTv() {
		// 부모클래스에 public으로 선언된 메소드
//		super.powerOn();
		// 부모클래스에 protected로 선언된 메소드
//		super.powerOff();
		// 부모클래스에 defailt로 선언된 메소드
//		super.operate(11);
		// 부모클래스에 private으로 선언된 메소드
		// super.chnnelUP();
		
//	}

//	@Override
//	public void moveTo(int channel) {
//		System.out.println(channel + "로 이동합니다.");
		// TODO Auto-generated method stub
		
//	}

	@Override
	public void channelUp() {
		System.out.println("APPLE"+ ++this.lastChannel +"로 이동합니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channelDown() {
		System.out.println("APPLE"+ --this.lastChannel +"로 이동합니다.");
		// TODO Auto-generated method stub
		
	}
	

		
}