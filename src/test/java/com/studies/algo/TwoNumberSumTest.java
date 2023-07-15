package com.studies.algo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TwoNumberSumTest {
	
@Test
@DisplayName ("Test if there are any numbers found in the array with first method")
public void TestCase1() {
	

 int[] testCase = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10); 
	 assertTrue(testCase.length == 2);
	 assertTrue(contains(testCase, -1));
	 assertTrue(contains(testCase, 11));
}


@Test
@DisplayName ("Test if there are any numbers found in the array with second method")
public void TestCase2() {
	
	 int[] testCase = TwoNumberSum.twoNumberSumSolution2(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18); 
		 assertTrue(testCase.length == 2);
		 assertTrue(contains(testCase, 3));
		 assertTrue(contains(testCase, 15));
	}


public boolean contains(int[] array, int value) {
	for (var element : array) {
		if (element == value) return true;
	}
	return false;
	}
}
