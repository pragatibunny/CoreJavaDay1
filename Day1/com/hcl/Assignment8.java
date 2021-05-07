/**
 * Program to read a number and 
 * calculate the sum of odd digits (values) present in the given number.
 */
package com.hcl;

import java.util.Scanner;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment8 {

	public static int checkSum(int input) {
		int remainder = 0;
		int sumOfOddDigits = 0;
		while (input > 0) {
			remainder = input % 10;
			if (remainder % 2 != 0) {
				sumOfOddDigits = sumOfOddDigits + remainder;

			}
			input = input / 10; // Eliminating the Last Digit
		}
		int ret = 0;
		if (sumOfOddDigits % 2 != 0) {
			ret = 1; // the sum is odd return 1
		} else {
			ret = -1; // the sum is even return -1
		}
		return ret;
	}

	// Driver-Code(Entry-point)
	public static void main(String[] args) {
		// User-input
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input >= 1) {
			// Return value of the checkSum function and storing it in a variable
			int ret = Assignment8.checkSum(input);
			if (ret == 1) {
				System.out.println("Sum of odd digits is Odd");
			} else {
				System.out.println("Sum of odd digits is Even.");
			}
			scanner.close();
		} else {
			System.out.println("Please Enter a Positive Number");
		}
	}

}
