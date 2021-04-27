/**
 *  program that takes three numbers as input to calculate and 
 *  print the average of the numbers.
 */
package com.hcl;

import java.util.Scanner;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment3 {

	public static void main(String[] args) {
		int input1;
		int input2;
		int input3;
		float average;
		Scanner scanner = new Scanner(System.in);
		input1 = scanner.nextInt(); // User-input1
		input2 = scanner.nextInt(); // User-input2
		input3 = scanner.nextInt(); // User-input3

		average =((float) (input1 + input2 + input3)/3);
		System.out.println("Average of " + input1 + "," + input2 + "," + input3 + " is " + average);

	}

}
