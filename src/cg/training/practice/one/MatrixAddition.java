package cg.training.practice.one;

public class MatrixAddition {
	
	public static void main(String args[]) {
		int intArr[][] = { {22, 33}, {4, 45}};
		String strArr[][] = { {"A", "B"}, {"C", "D"} };
		
		add(intArr, strArr);
	}
	
	
	public static void add(int[][] intArr, String [][] strArr) {
		String newArr[][] = new String[intArr.length][intArr.length];
		
		for(int i=0; i<intArr.length; i++) {
			for (int j=0; j<intArr[i].length; j++) {
				newArr[i][j] = intArr[i][j] + strArr[i][j];
			}
		}
		
		System.out.println("Array Output:");
		for(int i=0; i<intArr.length; i++) {
			for (int j=0; j<intArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
