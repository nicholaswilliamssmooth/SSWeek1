package com.ss.mar.jb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Program does some unit tests on Line
 */

/**
 * @author Nicholas Williams
 *
 */
public class LineTest {
	
	@Test
	public void getSlopeTest( ) {
		assertEquals(new Double(4.3333), new Line(5.3, 5.3, 5.0, 4.0).getSlope(), 0.0001);

	}
	@Test
	public void getDistanceTest( ) {
		assertEquals(new Double(1), new Line(1, 1, 2, 2).getSlope(), 0.0001);
		
	}
	@Test
	public void parallelToTest() {
		assertTrue(new Line(1, 1, 4, 1).parallelTo(
				new Line(2, 2, -4, 2))
		);

		
	}
	

}