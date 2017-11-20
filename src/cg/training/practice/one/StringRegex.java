package cg.training.practice.one;

import java.util.Scanner;

public class StringRegex {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//Input String: ABCD$1234  679_  4k ODC
		System.out.println("Input your String: ");
		String inputStr = scan.nextLine();
		
		System.out.println("Replaced String: " + inputStr.replaceAll("[^a-zA-Z0-9]+", ""));
		scan.close();
		
	}
}
