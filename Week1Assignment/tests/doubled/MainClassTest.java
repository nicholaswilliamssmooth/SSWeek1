package doubled;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;



import org.junit.Test;

public class MainClassTest {
	
	@Test
	public void doublingTest() {
		MainClass mnObj = new MainClass(); 
		
		assertEquals(Arrays.asList(2, 4, 6), mnObj.doubling(Arrays.asList(1, 2, 3)));
		assertEquals(Arrays.asList(12, 16, 12, 16, -2), mnObj.doubling(Arrays.asList(6, 8, 6, 8, -1)));
		assertEquals(Arrays.asList(), mnObj.doubling(Arrays.asList()));

	}
	
}
