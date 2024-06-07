package chap19_generic.ramyun;

public class Danmuji {
	private String color;
	
	public Danmuji() {
		this.color = "yellow";
	}
	
	public Danmuji(String color) {
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
		return "단무지의 색상은 " + color + "입니다.";
	}
}
