/**
 * program to read a number, 
 * calculate the sum of squares of even digits (values) present in the given number.
 */
package com.hcl;

import java.util.Scanner;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment9 {

	public static int checkSum(int input) {
		int remainder = 0;
		int sumOfSquaresEvenDigits = 0;
		while (input >0) {
			remainder = input % 10;
			if (remainder % 2 == 0) {
				sumOfSquaresEvenDigits = sumOfSquaresEvenDigits + (remainder * remainder);
			}
			input = input / 10; // Eliminating the Last Digit
		}
		return sumOfSquaresEvenDigits;
	}

	// Driver-Code(Entry-point)
	public static void main(String[] args) {
		// User-input
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input >0) {
			// Return value of the checkSum function and storing it in a variable
			int ret = Assignment9.checkSum(input);
			if (ret >1 ) {
				System.out.println("Sum Of Squares Of Even Digits is " + ret);
			} else
			{
				System.out.println("Even digits not present");
			}
			scanner.close();
		} else {
			System.out.println("Please Enter a Positive Number");
		}
	}

}
