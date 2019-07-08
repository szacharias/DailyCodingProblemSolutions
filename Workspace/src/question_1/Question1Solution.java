package question_1;

import java.util.Arrays;

/**
 * @author maverick
 *
 */
public class Question1Solution {


	/*

This problem was recently asked by Google.

Given numberList list of numbers and numberList number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
*/
	
	public static void main(String[] args) {
		
		int numberList[] = {10, 15, 3, 7};
		int designatedSum = 17;
		System.out.println("dumber solution " + dumberSolution(numberList, designatedSum));
		System.out.println("smarter solution " + smarterSolution(numberList, designatedSum));
	}
	
	public static boolean dumberSolution(int[]numberList , int designatedSum) {

		for(int i = 0 ; i < numberList.length ; i ++) {
			for (int q = i + 1 ; q < numberList.length ; q ++) {
  				if( numberList[i] + numberList[q] == designatedSum) {  
					System.out.println("dumber Output is " + numberList[i] + " " + numberList[q] + ".");
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean smarterSolution(int[] numberList, int x) {
		Arrays.sort(numberList);
		for(int q = 0 , i = numberList.length-1 ; q  < i ; ) {

			int sum = numberList[q] + numberList[i]; 
			if ( sum == x ) {
				System.out.println("Smarter Output is " + numberList[q] + " " + numberList[i] + ".");
				return true;
			}else if (sum > x) {
				i --;
			}else if (sum < x ) {
				q ++;
			}
		}
		return false;
	}


}
