package chap14_objectarray.car;

public class KiaCar extends CarStat implements CarInterface{
	public KiaCar() {
		super();
	}
	
	public KiaCar(String model, int price, String color) {
		super("기아", model, price, color);
	}
	
	@Override
	public void carInfo() {
		System.out.println("제조사: " + this.company);
		System.out.println("모델: " + this.model);
		System.out.println("가격: " + this.price);
		System.out.println("색상: " + this.color);
	}
}
