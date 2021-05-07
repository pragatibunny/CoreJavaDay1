/**
 * program to print the ascii value of a given character. 
 */
package com.hcl;

import java.util.Scanner;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char character = scanner.next().charAt(0);// User-input
		// cast char to int
		int castAscii = (int) character;
		System.out.println("The Character input is " + character);
		System.out.println("The ASCII value of " + character + " input is: " + castAscii);
		scanner.close();
	}

}
