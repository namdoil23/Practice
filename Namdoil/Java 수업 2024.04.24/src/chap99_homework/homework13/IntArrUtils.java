package chap99_homework.homework13;

import java.util.Arrays;

public class IntArrUtils {
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		for(int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr) {
		int min = arr[0];
		
		for(int i : arr) {
			if(i < min) {
				min = i;
			}
		}
		
		return min;
	}

	public static int getMid(int[] arr) {
		Arrays.sort(arr);
		
//		for(int i : arr) {
//			System.out.print(i + ", ");
//		}
//		System.out.println();
		
		int mid = arr[arr.length / 2];
		
		return mid;
	}
}
