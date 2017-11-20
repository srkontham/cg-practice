package cg.training.practice.one;

public class ArrayNRowsSumEqual {
	
	public static void main(String args[]) {
		int intArr1[][] = { {2, 3}, {4, 5} };
		int intArr2[][] = { {4, 9}, {5, 5} };
		
		System.out.println("Arrays Equal (True/False): " + arraySumEqual(intArr1, intArr2));
		
	}
	
	public static boolean arraySumEqual(int[][] arr1, int[][] arr2) {
		int n = arr1.length;
		boolean flag = true;
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=0; j<n; j++) {
				sum += arr1[i][j];
			}
			System.out.println(arr2[n-1-i][n-1] + " " + sum);
			
			if(arr2[n-1-i][n-1] != sum) {
				flag = false;
				break; 
			}
		}
		return flag;
	}
}
