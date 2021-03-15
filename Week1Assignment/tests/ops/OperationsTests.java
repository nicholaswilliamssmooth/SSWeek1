package ops;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import org.junit.Test;

public class OperationsTests {
	Operations op = new Operations();
	
	@Test
	public void isOddTest() {
		assertTrue(op.convert(op.isOdd(), 1));
		assertFalse(op.convert(op.isOdd(), 10));
		assertTrue(op.convert(op.isOdd(), 29));
	}
	
	@Test
	public void isPrimeTest() {
		assertTrue(op.convert(op.isPrime(), 29));
		assertFalse(op.convert(op.isPrime(), 10));
		assertTrue(op.convert(op.isPrime(), 523));
	}

	@Test
	public void isPalindromeTest() {
		assertTrue(op.convert(op.isPalindrome(), 292));
		assertTrue(op.convert(op.isPalindrome(), 2992));
		assertTrue(op.convert(op.isPalindrome(), 2));
		assertFalse(op.convert(op.isPalindrome(), 89));
	}

}
