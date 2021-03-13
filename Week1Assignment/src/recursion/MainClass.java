/**
 * Program for checking if a group of integers can sum out to a target value with a restraint on the adjacent values
 */
package recursion;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author Nicholas Williams
 *
 */

public class MainClass {
	/**
	 * A recursive function that checks an array of integers and compares possible sums to a target value
	 * @param initialPosition the position in the array we start the function, initially starts at 0
	 * @param nums list of integers to compare to the target
	 * @param target the target value sums are compared with
	 * @return boolean value for if we found a match or not
	 */
	public boolean groupSumClump(Integer initialPosition, ArrayList<Integer> nums, Integer target) {
		// Declare and initialize variables
		Integer sum = 0;
		// group represents every group of values
		Integer group = initialPosition;

		
		// No more values left, used to see if we have a matching sum
		if (initialPosition >= nums.size()) {
			return target == 0;
		}
		
		// sum up any groups of the same number that are adjacent 
		while(group < nums.size() && nums.get(initialPosition) == nums.get(group)) {
			sum += nums.get(group);
			group++;
		}
		// out of the group sum, using the next value, enter the function again using our sum
		if (groupSumClump(group, nums, target - sum))
			return true;
		// check again starting without the previous sums
		if (groupSumClump(group, nums, target))
			return true;
		
		// If we get no match we simply return false
		return false;
	}

	/**
	 * @param args args are not used for this program
	 */
	public static void main(String[] args) {
		MainClass mnObj = new MainClass(); 
		System.out.println(mnObj.groupSumClump(0, new ArrayList<Integer>(Arrays.asList(2, 4, 8)), 10));
		System.out.println(mnObj.groupSumClump(0, new ArrayList<Integer>(Arrays.asList(1, 2, 4, 8, 1)), 14));
		System.out.println(mnObj.groupSumClump(0, new ArrayList<Integer>(Arrays.asList(2, 4, 4, 8)), 14));


	}

}
