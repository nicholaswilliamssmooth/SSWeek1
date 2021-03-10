/** 
 * A simple program that adds together all of the arguments and displays the output as a double.
 * Has exception handling for non-numeric input
 */

/**
 * @author Connor
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare and initialize variables
		Double total = 0.0;
		
		
		for (String i : args) {
			try { total += Double.valueOf(i); }
			catch (NumberFormatException exception) {
				System.out.println("Sorry, but you have entered an argument that is not a number, "
						+ "this value will be ignored.");
			}
			
		}
		System.out.println("Total Amount = " + total);
		
			
	}

}
