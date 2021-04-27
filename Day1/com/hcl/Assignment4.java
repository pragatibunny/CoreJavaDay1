/**
 * program to swap two variables.
 */
package com.hcl;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment4 {

	public static void main(String[] args) {
		int variable1 = 10;
		int variable2 = 20;
		int tempVar; // temporary variable
		System.out.println("The Variables Before Swapping are " + variable1 + "," + variable2);
		tempVar = variable1;
		variable1 = variable2;
		variable2 = tempVar;
		System.out.println("The Variables After Swapping are " + variable1 + "," + variable2);
	}

}
