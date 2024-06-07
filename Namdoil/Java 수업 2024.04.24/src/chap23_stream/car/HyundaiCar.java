package chap23_stream.car;

public class HyundaiCar {
	private String model;
	private int price;
	
	public HyundaiCar() {
		
	}
	
	public HyundaiCar(String model, int price) {
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "HyundaiCar [model=" + model + ", price=" + price + "]";
	}
	
	public void carInfo() {
		System.out.println("모델:" + this.model);
		System.out.println("가격:" + this.price);
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
