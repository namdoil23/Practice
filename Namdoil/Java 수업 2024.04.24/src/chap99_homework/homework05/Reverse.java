package chap99_homework.homework05;

public class Reverse {
	public String reverseString(String str) {
		String reverse = "";
		
		// abcde
		for(int i = str.length() - 1; i >= 0; i--) {
			// e
			// d
			// c
			// b
			// a
			reverse += str.charAt(i);
		}
		
		return reverse;
	}
}
