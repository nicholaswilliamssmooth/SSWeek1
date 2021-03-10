import java.util.Random;
import java.util.Scanner;

/**
 * This program generates a 2d array of integer values and searches for the location of the biggest Number
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {
	
	// Constants
	final static Integer X_SIZE = 5;
	final static Integer Y_SIZE = 5;
	final static Integer MAX_VALUE = 1000;
	final static Integer MIN_VALUE = 0;
	
	// Members
	private Integer maxX, maxY; // Holds the position of the biggest number
	
	// Constructor
	MainClass() {
		updateMax(0, 0); // start on the first position of the array
	}

	/**
	 * A setter for both values
	 * @param x x position of the current highest value 
	 * @param y y position of the current highest value
	 */
	public void updateMax(Integer x, Integer y) {
		maxX = x;
		maxY = y;
	}
	
	// Getters
	public Integer getMaxX() { return maxX; }
	public Integer getMaxY() { return maxY; }


	/**
	 * @param args args do nothing for this program
	 */
	public static void main(String[] args) {
		// Declare and initialize variables
		Random randNumber = new Random(); // Populates array with numbers
		MainClass mnObj = new MainClass(); // Used to avoid making other methods static like main
		Integer[][] A; // Array declaration
		A = new Integer[X_SIZE][Y_SIZE]; // Array initialization

		
		// Fill up the 2d array with random numbers
		for (Integer x = 0; x < X_SIZE; x++)
			for (Integer y = 0; y < Y_SIZE; y++)
				A[x][y] = randNumber.nextInt(MAX_VALUE-MIN_VALUE) + MIN_VALUE;
		
		// Find the highest value
		for (Integer x = 0; x < X_SIZE; x++)
			for (Integer y = 0; y < Y_SIZE; y++) {
				if (A[mnObj.getMaxX()][mnObj.getMaxY()] < A[x][y])
					mnObj.updateMax(x, y);
			}
		
		// Final output
		System.out.println("The highest value was at position (" + mnObj.getMaxX() + ", " + mnObj.getMaxY() + ""
				+ ") with a value of " + A[mnObj.getMaxX()][mnObj.getMaxY()]);

	}

}
