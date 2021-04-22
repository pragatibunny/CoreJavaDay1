/**
 * program to print the sum (addition), multiply, subtract, 
 * divide and remainder of two numbers.
 */
package com.hcl;

import java.util.Scanner;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1;
		int input2;
		int sum;
		int subtract;
		int multiply;
		float divide;
		int rem; // remainder
		Scanner scanner = new Scanner(System.in);
		input1 = scanner.nextInt(); // User-input1
		input2 = scanner.nextInt(); // User-input2

		sum = input1 + input2;
		subtract = input1 - input2;
		multiply = input1 * input2;
		divide = (float) input1 / input2;
		rem = input1 % input2;

		System.out.println("Addition of " + input1 + " and " + input2 + " is " + sum);
		System.out.println("Subtract of " + input1 + " and " + input2 + " is " + subtract);
		System.out.println("Multiplication of " + input1 + " and " + input2 + " is " + multiply);
		System.out.println("Division of " + input1 + " and " + input2 + " is " + divide);
		System.out.println("Remainder of " + input1 + " and " + input2 + " is " + rem);

	}

}
