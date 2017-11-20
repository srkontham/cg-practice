package cg.training.practice.two;

import java.util.Scanner;

public class PrintTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows = scan.nextInt();
		
		System.out.println("Triange is:");
		int num = 0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<rows-i; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++) {
				if(i==0) {
					System.out.print("1" + "  ");	
				}
				else {
					num = num+2;
					System.out.print(num + "  ");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}

