import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

/**
 * File takes a file and appends to it.
 * 
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {

	/**
	 * @param args Arguments do nothing for this project
	 */
	public static void main(String[] args) throws IOException {
		File path = new File("./src/append.txt");
		System.out.println(path.getAbsolutePath());
		FileOutputStream f = new FileOutputStream(path, true);
		f.write("\r\nThis is an appended line".getBytes());
		f.flush();
		f.close();



	}

}
