package rightdigits;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


public class MainClassTest {
	
	@Test
	public void rightDigitTest() {
		MainClass mnObj = new MainClass(); 
		
		assertEquals(Arrays.asList(1, 2, 3), mnObj.rightDigit(Arrays.asList(1, 22, 93)));
		assertEquals(Arrays.asList(6, 8, 6, 8, 1), mnObj.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
		assertEquals(Arrays.asList(0, 0), mnObj.rightDigit(Arrays.asList(10, 0)));

	}
}
