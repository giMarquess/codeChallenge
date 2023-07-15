package com.studies.algo;
import java.util.*;
/** Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
 *  If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any other.
 *  If no two numbers sum up to the target sum, the function should return an empty array.
 *  Note that the target sum has to be obtained by summing two different integers in the array; 
 *  you can't add a single integer to itself in order to obtain the target sum.
 *  You can assume that there will be at most one pair of numbers summing up to the target sum.
 *  
 *  Sample Input
 *  
 *  array = [3,5,-4,8,11,1,-1,6]
 *  targetSum = 10
 *  
 *  Sample Output
 *  [-1,11]  // the numbers could be in reverse order
 * **/
public class TwoNumberSum {
	
	// O (n) space and time
	public static int[] twoNumberSum (int[] array, int targetSum)  {
		Set<Integer> result = new HashSet<Integer> ();
		for (int i = 0; i < array.length; i++ ) {
			int y = targetSum - array[i];
			if (result.contains(y))
				return new int[] {array[i],y};
			result.add(array[i]);
		}
		return new int[0];
	}
	
	//O (n log (n)) time
	//O(1) space

	public static int[] twoNumberSumSolution2 (int[] array, int targetSum)  {
	    Arrays.sort(array);
	    int left = 0;
	    int right = array.length - 1;
	   while (left < array.length && left < right){
	     if (array[left] + array[right] == targetSum)
	       return new int[] {array[left], array[right]};
	     else if (array[left] + array[right] < targetSum ) 
	       left++;
	     else 
	       right--;  
	   }
	    return new int[0];
	}
	
	
}
