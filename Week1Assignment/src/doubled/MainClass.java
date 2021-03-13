/**
 * Program takes a list of numbers and doubles them with a lambda expression
 */
package doubled;

import java.util.Arrays;
import java.util.List;

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {

	/**
	 * creates a new list with the numbers doubled their original value
	 * @param nums list of integers that are fed through
	 * @return returns a new list 
	 */
	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		return nums;
	}

	/**
	 * @param args args are not used in this program
	 */
	public static void main(String[] args) {
		MainClass mnObj = new MainClass(); 
		System.out.println(mnObj.doubling(Arrays.asList(1, 2, 3)));
		System.out.println(mnObj.doubling(Arrays.asList(6, 8, 6, 8, -1)));
		System.out.println(mnObj.doubling(Arrays.asList()));


	}

}
