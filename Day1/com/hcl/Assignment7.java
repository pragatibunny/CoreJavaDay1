/**
 * Program which iterates the integers from 1 to 100. 
 * For multiples of three print "Fizz" instead of the number and 
 * print "Buzz" for the multiples of five. 
 * When number is divided by both three and five, print "fizz buzz 
 */
package com.hcl;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println("The " + i + " is the multiple of 3 : " + "Fizz");
			} else if (i % 5 == 0) {
				System.out.println("The " + i + " is the multiple of 5 : " + "Buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("The " + i + " is the multiple of 3 and 5 : " + "Fizz Buzz");
			} else {
				System.out.println("The " + i + " is not a multiple of 3,5 or 3 and 5 ");
			}
		}

	}

}
