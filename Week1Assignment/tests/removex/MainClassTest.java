package removex;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


public class MainClassTest {
	
	@Test
	public void noXTest() {
		MainClass mnObj = new MainClass(); 
		assertEquals(Arrays.asList("a", "bb", "c"), mnObj.noX(Arrays.asList("ax", "bb", "cx")));
		assertEquals(Arrays.asList("a", "bb", "c"), mnObj.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
		assertEquals(Arrays.asList(""), mnObj.noX(Arrays.asList("x")));

	}
}
