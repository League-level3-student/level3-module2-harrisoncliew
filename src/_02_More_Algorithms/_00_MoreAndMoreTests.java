package _02_More_Algorithms;

import static org.junit.Assert.*;
import java.lang.Math;
import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }
	String multiply(int a, int b) {
		int s = a*b;
		return a+" x "+b+" = "+s;
	}

	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
	boolean isPrime(int a) {
		for (int i = a-1; i > 1; i--) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}

	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
	boolean isSquare(int a) {
		double c = Math.sqrt(a);
		int b = (int) c;
		if(b==c) {
			return true;
		}
		return false;
	}

	boolean CubeTest(int a) {
		double c = Math.cbrt(a);
		int b = (int) c;
		if(b==c) {
			return true;
		}
		return false;
	}


}
