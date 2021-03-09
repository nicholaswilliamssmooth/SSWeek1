/**
 * 
 */

/**
 * @author Connor
 *
 */
public class MainClass {

	// Constants
	final static int CENTER = 5;
	final static int DOT_INITIAL = 9;
	
	/**
	 * @param args do nothing for this program
	 */
	public static void main(String[] args) {
		// declare and initialize variables
		int dotCount = DOT_INITIAL;
		
		// Pattern 1
		System.out.print("Pattern 1:");
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.print("\n");
		}
		for (int i = 0; i < dotCount; i++) {
			System.out.print(".");
		}
		System.out.print("\n");
		dotCount++;
		
		// Pattern 2
		System.out.print("\nPattern 2:\n");
		for (int i = 0; i < dotCount; i++) {
			System.out.print(".");
		}
		System.out.print("\n");
		dotCount++;
		
		for (int i = 0; i < 4; i++) {
			for (int j = i; j < 4; j++)
				System.out.print("*");
			System.out.print("\n");
		}
		
		// Pattern 3
		System.out.print("\nPattern 3:");
		for (int i = 0; i <= 4; i++) {
			for (int k = 0; k <= CENTER - i; k++)
				System.out.print(" ");
			for (int j = 0; j < i*2-1; j++)
				System.out.print("*");
			System.out.print("\n");
		}
		for (int i = 0; i < dotCount; i++) {
			System.out.print(".");
		}
		System.out.print("\n");
		dotCount++;
		
		// Pattern 4
		System.out.print("\nPattern 4:\n");
		for (int i = 4; i > 0; i--) {
			for (int k = 0; k <= CENTER - i; k++)
				System.out.print(" ");
			for (int j = 0; j < i*2-1; j++)
				System.out.print("*");
			System.out.print("\n");
		}
		for (int i = 0; i < dotCount; i++) {
			System.out.print(".");
		}
		System.out.print("\n");
		dotCount++;

	}

}


