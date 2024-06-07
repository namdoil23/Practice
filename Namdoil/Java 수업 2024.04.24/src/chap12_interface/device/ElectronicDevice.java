package chap12_interface.device;



public interface ElectronicDevice {
	void powerOn();
	void poweroff();
	
	
	// default 메소드 선언
	// default 메소드도 상속받은 클래스에서 오버라이드할 수 있다.
	default void reset() {
		System.out.println("장치를 리셋한다.");
	}
	
	// 인터페이스에도 static 키워드로 정적 메소드를 생성할 수 있다.
	// static 메소드는 클래스를 로드하면서 바로 메모리에 저장, 사용할 수 있는 상태가 되기 때문에
	// 추상 메소드 형태로는 만들지 못하고 구현부까지 완벽한 메소드 형태로 만들어야한다.
	// static 메소드는 오버라이드할 수 없다.
	static void warn() {
		System.out.println("경고를 울린다.");
	}
}
