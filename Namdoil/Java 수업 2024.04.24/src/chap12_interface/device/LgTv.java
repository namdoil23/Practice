package chap12_interface.device;

public class LgTv implements Tv {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("LGTV 소리를 틉니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LGTV 전원을 끕니다.");
	}

	@Override
	public void poweroff() {
		// TODO Auto-generated method stub
		System.out.println("LGTV 전원을 끕니다.");
	}

	@Override
	public void showDisplay() {
		// TODO Auto-generated method stub
		System.out.println("LGTV 화면을 보여줍니다.");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("LGTV" + channel + "로 이동합니다.");
	}

	
}
