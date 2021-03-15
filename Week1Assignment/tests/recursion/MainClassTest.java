package recursion;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertFalse;


import org.junit.Test;



public class MainClassTest {
	
	@Test
	public void groupSumClumpTest() {
		MainClass mnObj = new MainClass();

		assertTrue(mnObj.groupSumClump(0, new ArrayList<Integer>(Arrays.asList(2, 4, 8)), 10));
		assertTrue(mnObj.groupSumClump(0, new ArrayList<Integer>(Arrays.asList(1, 2, 4, 8, 1)), 14));
		assertFalse(mnObj.groupSumClump(0, new ArrayList<Integer>(Arrays.asList(2, 4, 4, 8)), 14));	
	}


}
