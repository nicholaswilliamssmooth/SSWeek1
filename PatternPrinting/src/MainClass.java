/**
 * A simple program that displays outputs of different loop setups with stars and dots.
 */

/**
 * @author Connor
 *
 */
public class MainClass {

	// Constants
	final static int CENTER = 5;
	final static int DOT_INITIAL = 9;
	final static char DOT_SYMBOL = '.';
	final static char STAR_SYMBOL = '*';
	final static char ROWS = 4;
	
	/**
	 * 
	 * @param dot is the current amount of dots we want to draw
	 * @param increase is the amount we want to increase on the count
	 * @return returns an iteration so that we'll have one more dot on the next call
	 */
	public int dotIterator(int dot, int increase) {
		for (int i = 0; i < dot; i++) {
			System.out.print(DOT_SYMBOL);
		}
		System.out.print("\n");
		return dot + increase;
	}
	/**
	 * @param args do nothing for this program
	 */	
	public static void main(String[] args) {
		// declare and initialize variables
		int dotCount = DOT_INITIAL;
		MainClass mnObj = new MainClass(); // lets us use methods in main without them needing to be static
		
		/* ---------------------------------------------------------
		 *  Patterns from the slide examples
		 * -------------------------------------------------------*/
		// Pattern 1
		System.out.print("Slide Patterns:\n");
		System.out.print("Pattern 1:");
		// Draw stars
		for (int i = 0; i <= ROWS; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(STAR_SYMBOL);
			System.out.print("\n");
		}
		// Draw dots
		dotCount = mnObj.dotIterator(dotCount, 1);
		
		// Pattern 2
		System.out.print("\nPattern 2:\n");
		// Draw Dots
		dotCount = mnObj.dotIterator(dotCount, 1);
		// Draw Stars
		for (int i = ROWS; i > 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print(STAR_SYMBOL);
			System.out.print("\n");
		}
		
		// Pattern 3
		System.out.print("\nPattern 3:");
		// Draw stars
		for (int i = 0; i <= ROWS; i++) {
			for (int k = 0; k <= CENTER - i; k++)
				System.out.print(" ");
			for (int j = 0; j < i*2-1; j++)
				System.out.print(STAR_SYMBOL);
			System.out.print("\n");
		}
		// Draw dots
		dotCount = mnObj.dotIterator(dotCount, 1);
		
		// Pattern 4
		System.out.print("\nPattern 4:\n");
		// Draw dots
		dotCount = mnObj.dotIterator(dotCount, 1);
		// Draw Stars
		for (int i = ROWS; i > 0; i--) {
			for (int k = 0; k <= CENTER - i; k++)
				System.out.print(" ");
			for (int j = 0; j < i*2-1; j++)
				System.out.print(STAR_SYMBOL);
			System.out.print("\n");
		}
		
		/* ---------------------------------------------------------
		 *  Patterns from the notes section
		 * -------------------------------------------------------*/
		dotCount = 6; // reseting the dots for the notes patterns
		System.out.print("\nNotes Patterns:\n");
		System.out.print("Pattern 1:\n");
		// Draw stars
		for (int i = 0; i <= ROWS; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(STAR_SYMBOL);
			System.out.print("\n");
		}
		// Draw dots
		dotCount = mnObj.dotIterator(dotCount, -1);

		// Pattern 2
		System.out.print("\nPattern 2:");
		// Draw stars
		for (int i = 0; i <= ROWS; i++) {
			for (int k = 0; k <= ROWS-i; k++)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print(STAR_SYMBOL);
			System.out.print("\n");
		}
		// Draw dots
		dotCount = mnObj.dotIterator(dotCount, 0);
		
		System.out.print("\nPattern 3:\n");
		// Draw dots
		dotCount = mnObj.dotIterator(dotCount, 0);
		// Draw Stars
		for (int i = ROWS; i > 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print(STAR_SYMBOL);
			System.out.print("\n");
		}

	}

}


