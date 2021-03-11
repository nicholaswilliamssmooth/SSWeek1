import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Program that runs searches through a file looking for matching characters
 * with the one written in the command line arguments
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {

	/**
	 * @param args an argument is used to determine what character we're looking for.
	 */
	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.print("You must enter a character to search for in the file");
		}
		else {
			// Initialize and Declare variables
			File path = new File("./src/loomis.txt");
			Character matchingChar = args[0].charAt(0); // even if the user inputs more, just take the first char
			Integer charCounter = 0;
			FileInputStream f = new FileInputStream(path);
			
			// Go through the file and search for the character
			int text = f.read();
			while (text != -1) {
				if (matchingChar == (char) text) {
					charCounter++;
				}
				text = f.read();
			}	
			f.close();
			// Final Output
			System.out.println("\nWithin this text there were " + charCounter
					+ " instances of the character \'" + matchingChar + "\'." );

		}
	}

}
