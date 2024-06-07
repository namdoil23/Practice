package chap11_abstract.tv;

public abstract class Tv {
	public int lastChannel;
	
	public Tv() {
		lastChannel = 1;
	}

	public abstract void powerOn();
//	{
//		System.out.println("TV의 전원을 켭니다.");
//	}
	
	public abstract void powerOff();
//	{
//		System.out.println("TV의 전원을 끕니다.");
//	}
	
	public abstract void operate(int channel); 
//	{
//		lastChannel = channel;
//		moveTo(channel);
//	}
	
//	public abstract void moveTo(int channel); 
//	{
//		System.out.println(channel + "로 이동합니다.");
//	}
	
	public abstract void channelUp(); 
//	{
//		lastChannel++;
//	}
	
	public abstract void channelDown(); 
//	{
//		lastChannel--;
//	}
}
