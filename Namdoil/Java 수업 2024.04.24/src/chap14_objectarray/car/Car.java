package chap14_objectarray.car;

public class Car {
	public String company;
	public String model;
	public int price;
	public String color;
	
	public Car() {
		
	}
	
	public Car(String company, String model, int price, String color) {
		this.company = company;
		this.model = model;
		this.price = price;
		this.color = color;
	}
	
	public void carInfo() {
		System.out.println("제조사: " + this.company);
		System.out.println("모델: " + this.model);
		System.out.println("가격: " + this.price);
		System.out.println("색상: " + this.color);
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", price=" + price + ", color=" + color + "]";
	}
}
