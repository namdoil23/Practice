package chap14_objectarray.car;

public class HuyndaiCar extends CarStat implements CarInterface {
	public HuyndaiCar() {
		super();
	}
	
	public HuyndaiCar(String model, int price, String color) {
		super("현대", model, price, color);
	}
	
	@Override
	public void carInfo() {
		System.out.println("제조사: " + this.company);
		System.out.println("모델: " + this.model);
		System.out.println("가격: " + this.price);
		System.out.println("색상: " + this.color);
	}
}
