/**
 * 
 */
package question_2;

import java.util.Arrays;

/**
 * @author maverick
 *
 */
public class Question2Solution {

	/*This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array 
is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input1 = {1, 2, 3, 4, 5} ,  input2 = {3, 2, 1};
		
		System.out.println("With Division.  "
				+ "\nExample 1 : " + Arrays.toString(solutionWithDivision(input1))+ 
				".\nExample 2 : " + Arrays.toString(solutionWithDivision(input2) ));

		System.out.println("Without Division.  "
				+ "\nExample 1 : " + Arrays.toString(solutionWithoutDivision(input1))+ 
				".\nExample 2 : " + Arrays.toString(solutionWithoutDivision(input2) ));

		
	}
	
	public static int[] solutionWithDivision( int[] input) {
		int factor = input[0];
		int[] output = new int[input.length];
		//Could possibly optimize this
		for(int i = 1 ; i < input.length ; i ++) {
			factor = factor * input[i];
		}
		for(int i = 0; i < input.length ; i ++) {
			output[i] = factor/input[i];
		}
		
		return output;
		
	}

	public static int[] solutionWithoutDivision( int[] input) {  

		int output[] = new int[input.length];
		for(int i = 0 ; i < input.length ; i ++ ) {
			int factor = 1 ;
			for(int q = 0 ; q < input.length ; q ++) {
				if ( i != q ) { 
					factor = factor * input[q] ;
				}
			}
			output[i] = factor; 
		}
		return output;
		
	}
}
