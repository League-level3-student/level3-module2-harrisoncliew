package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String array[] = {"pan", "trash", "pencil", "brain", "globe"};
		assertEquals(-1, _00_LinearSearch.linearSearch(array, "hi"));
		assertEquals(2, _00_LinearSearch.linearSearch(array, "pencil"));
		assertEquals(3, _00_LinearSearch.linearSearch(array, "brain"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int array[] = {0,2,3,6,8,10,13,16,18,26,34,56};
		assertEquals(-1, _01_BinarySearch.binarySearch(array, 0, 11, 14));
		assertEquals(11, _01_BinarySearch.binarySearch(array, 0, 11, 56));
		assertEquals(5, _01_BinarySearch.binarySearch(array, 0, 9, 10));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int array[] = {0,2,3,6,8,10,13,16,18,26,34,56,72,83,94,96,102,105,119,128};
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(array, 23));
		assertEquals(18, _02_InterpolationSearch.interpolationSearch(array, 119));
		assertEquals(16, _02_InterpolationSearch.interpolationSearch(array, 102));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int array[] = {0,2,3,6,8,10,13,16,18,26,34,56,72,83,94,96,102,105,119,128};
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(array, 100));
		assertEquals(17, _03_ExponentialSearch.exponentialSearch(array, 105));
		assertEquals(13, _03_ExponentialSearch.exponentialSearch(array, 83));
	}
}
