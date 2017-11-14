package cg.practice.one;

import java.util.Arrays;

public class Array2DEquals {
	
	public static void main(String args[]) {
		int intArr1[][] = { {1, 3}, {5, 6} };
		int intArr2[][] = { {2, 3}, {4, 5} };
		
		System.out.println("Arrays Equal (True/False): " + arraysEqual(intArr1, intArr2));
		
	}
	
	public static boolean arraysEqual(int[][] arr1, int[][] arr2) {
		boolean flag = false;
		for(int i=0; i<arr1.length; i++) {
			flag = Arrays.equals(arr1[i], arr2[i]);
			
			if(!flag)
				break;
		}
		
		return flag;
	}
}
