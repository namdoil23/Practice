package chap12_interface.multiinherit;

public class ChildInterface implements FatherInterface, MotherInterface {

	@Override
	public void calm() {
		// TODO Auto-generated method stub
		System.out.println("침착하다.");
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("잘 고친다.");
	}

}
