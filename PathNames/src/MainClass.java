import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** A program that displays all of the folders and files of the project folder, no matter where you run the folder
 * 
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {

	/**
	 * A recursive function that looks through this project folder and displays every single folder and file
	 * within it.
	 * @param direct the directory that will be searched
	 * @return
	 */
	public List<File> fileList(String direct) {
		// Declare and initialize variables
		File dir = new File(direct); // Convert string path to file object
		File files[] = dir.listFiles(); // Get all files from the directory
		List<File> itemList = new ArrayList<File>(); // Contains all of the embedded folders and files
		itemList.addAll(Arrays.asList(files)); // Populate list
		
		for ( File file: files) {
			System.out.println(file.getAbsolutePath());
			// Get the files within the path
			if (file.isDirectory()) {
				itemList.addAll(fileList(file.getAbsolutePath()));
			}
		}	
		return itemList;
	}
	
	/**
	 * Main function just exists to take to recursively call the fileList function
	 * @param args
	 */
	public static void main(String[] args) {
		MainClass mnObj = new MainClass();
		mnObj.fileList("./");

	}

}
