/** 
 * A simple program that adds together all of the arguments and displays the output as a double.
 * Has exception handling for non-numeric input
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {

	/**
	 * @param args are the values from command line input to sum together
	 */
	public static void main(String[] args) {
		// Declare and initialize variables
		Double total = 0.0;
		
		// Iterate and Add
		for (String num : args) {
			try { total += Double.valueOf(num); }
			catch (NumberFormatException exception) {
				System.out.println("Sorry, but you have entered an argument that is not a number, "
						+ "this value will be ignored.");
			}
		}
		System.out.println("Total Amount = " + total); // Final output
		
			
	}

}
