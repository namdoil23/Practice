package chap12_interface.device;

public interface Tv extends Speaker, Display {
	void changeChannel(int channel);
	

}
