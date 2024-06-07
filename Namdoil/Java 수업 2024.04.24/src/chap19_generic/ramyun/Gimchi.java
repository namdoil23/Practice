package chap19_generic.ramyun;

public class Gimchi {
	private String color;
	
	public Gimchi() {
		this.color = "red";
	}
	
	public Gimchi(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "김치의 색상은 " + color + "입니다.";
	}
}
