/**
 * 
 */
package com.hcl;

import java.util.Scanner;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();// user-input
		boolean flag = false;
		if (input == 0 || input == 1) {
			System.out.println(input + " is not a Prime Number.");
		} else {
			for (int i = 2; i <= input / 2; ++i) {
				// condition for nonprime number
				if (input % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(input + " is a Prime Number.");
			else
				System.out.println(input + " is not a Prime Number.");
		}

	}
}
