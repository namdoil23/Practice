package chap99_homework.homework03;

public class Rect {
	public int width;
	public int height;
	
	public Rect() {
		
	}
	
	public Rect(int width) {
		
	}
	
//	public Rect(int height) {
//		
//	}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int round() {
		return 2 * (width + height);
	}
	
	public int area() {
		return width * height;
	}
}
