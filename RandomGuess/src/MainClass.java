import java.util.Random;
import java.util.Scanner;
/**
 * Program that generates a random number and has the user
 * guess it
 */

/**
 * @author Connor
 */
public class MainClass {
	// constants
	final static int LOWER_BOUND = 1;
	final static int UPPER_BOUND = 100;
	final static int APPROVED_RANGE = 10;
	final static int MAX_CHANCES = 5;

	/**
	 * @param args is not used in this program
	 */
	public static void main(String[] args) {
		// Declare and initialize variables
		Random randInt = new Random();
		Scanner userInput = new Scanner(System.in);
		int userAnswer;
		int generatedNum = randInt.nextInt(UPPER_BOUND-1) + LOWER_BOUND;
		int chance = 0;
		
		// Initial message
		System.out.println("A random number has been generated between"
				+ " 1 and 100, \nCan you guess it?");
		
		/* 
		 * We will either break out from getting the right 
		 * answer, or exceeding our number of chances
		*/
		while (true) {
			System.out.println("Guess the random number in the range of 1 and 100: ");
			userAnswer = userInput.nextInt();
			
			// Success
			if (Math.abs(userAnswer - generatedNum) <= APPROVED_RANGE) {
				System.out.println("Congrats! You got within the allowed range of " 
						+ APPROVED_RANGE + " and have won the game. \nYou guessed " + userAnswer +
						" and the generated number was " + generatedNum + ".");
				break;
			}
			// Failure
			else {
				chance++;
				System.out.println("Wrong answer!");
				// Exceeding number of tries
				if (chance == 5) {
					System.out.println("Sorry, but you weren't able to guess correctly "
							+ "after " + MAX_CHANCES + " attempts. The final answer was " + generatedNum + 
							". \nYou have lost the game," + "but don't give up! Try again soon!");
					break;
				}
				else { System.out.println("Try it again!"); }
			}
		}
		userInput.close();
	}

}
