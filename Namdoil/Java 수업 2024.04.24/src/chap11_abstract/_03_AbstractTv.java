package chap11_abstract;

import chap11_abstract.tv.LgTv;
import chap11_abstract.tv.SamsungTv;
import chap11_abstract.tv.Tv;

public class _03_AbstractTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.operate(11);
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
		
		tv = new SamsungTv();
		
		tv.powerOn();
		tv.operate(23);
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
	}

}
