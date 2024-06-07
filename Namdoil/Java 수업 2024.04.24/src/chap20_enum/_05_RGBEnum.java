package chap20_enum;

import chap20_enum.enums.RGB;

public class _05_RGBEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGB[] rgbArr = RGB.values();
		
		for(RGB rgb : rgbArr) {
			System.out.println(rgb.getColorStr() + "는 " + 
				rgb.getRedValue() + ", " + rgb.getGreenValue() + ", " + rgb.getBlueValue()
			);
		}
	}

}
