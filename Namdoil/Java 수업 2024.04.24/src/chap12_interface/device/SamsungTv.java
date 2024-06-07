package chap12_interface.device;

public class SamsungTv implements Tv {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 소리를 틉니다.");
		
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 전원을 켭니다.");
		
	}

	@Override
	public void poweroff() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 전원을 끕니다.");

		
	}

	@Override
	public void showDisplay() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 화면을 보여줍니다.");

		
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("삼성티비" + channel + "로 이동합니다.");

	}
	
	// default 메소드도 오버라이드 할수 있다
	@Override
	public void reset() {
		System.out.println("삼성티비 재부팅합니다.");
	}
	
	// static 메소드도 오버라이드 할 수 없다
//		@Override
//		public void warn() {
//			
//		}
	
}
