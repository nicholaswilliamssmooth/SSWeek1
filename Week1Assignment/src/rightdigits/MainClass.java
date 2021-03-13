/**
 * Program takes in a list of numbers and displays their rightmost digit
 */
package rightdigits;

import java.util.List;
import java.util.Arrays;

/**
 * @author Nicholas Williams
 *
 */

public class MainClass {
	
	
	/**
	 * creates a new list with only the ammount of digits specified
	 * @param nums list of integers that are fed through
	 * @return returns a new list 
	 */
	public List<Integer> rightDigit(List<Integer> nums) {
		// % 10 ignores all the values after 10, if we chose 100, it would filter the 2 
		// rightmost digits, 1000 would be 3 digits, etc.	
		nums.replaceAll(n -> n % 10);
		return nums;
	}

	/**
	 * @param args args are not used in this program
	 */
	public static void main(String[] args) {
		MainClass mnObj = new MainClass(); 
		System.out.println(mnObj.rightDigit(Arrays.asList(1, 22, 93)));
		System.out.println(mnObj.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
		System.out.println(mnObj.rightDigit(Arrays.asList(10, 0)));


	}

}
