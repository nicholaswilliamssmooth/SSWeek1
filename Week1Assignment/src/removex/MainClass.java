/**
 * Program takes a list of strings and removes their x's
 */
package removex;

import java.util.Arrays;
import java.util.List;

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {

	/**
	 * creates a new list with x's removed
	 * @param nums list of strings that are fed through
	 * @return returns a new list 
	 */
	public List<String> noX(List<String> strs) {
		strs.replaceAll(s -> s.replace("x", ""));
		return strs;
	}

	/**
	 * @param args args are not used in this program
	 */
	public static void main(String[] args) {
		MainClass mnObj = new MainClass(); 
		System.out.println(mnObj.noX(Arrays.asList("ax", "bb", "cx")));
		System.out.println(mnObj.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
		System.out.println(mnObj.noX(Arrays.asList("x")));


	}
}
