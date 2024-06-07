package chap20_enum.enums;

public enum RGB {
	// RED, GREEN, BLUE 상수선언
	// 값은 4개를 갖는다 
	// 첫 번째 값은 소문자 색상이름
	// 두 번째, 세 번째, 네 번째 값은 int
	// 두 번째 값은 빨간색 농도(255가 최대값)
	// 세 번째 값은 초록색 농도(255가 최대값)
	// 네 번째 값은 파란색 농도(255가 최대값)
	// enum을 구현하세요.
	RED("red", 255, 0, 0) {
		public void printColorNum() {
			
		}
	},
	GREEN("green", 0, 255, 0) {
		public void printColorNum() {
			
		}
	},
	BLUE("blue", 0, 0, 255) {
		public void printColorNum() {
			
		}
	};
	
	private String colorStr;
	private int redValue;
	private int greenValue;
	private int blueValue;
	
	RGB(String colorStr, int redValue, int greenValue, int blueValue) {
		this.colorStr = colorStr;
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}
	
	public String getColorStr() {
		return this.colorStr;
	}
	
	public int getRedValue() {
		return this.redValue;
	}
	
	public int getGreenValue() {
		return this.greenValue;
	}
	
	public int getBlueValue() {
		return this.blueValue;
	}
	
	public abstract void printColorNum();
}
