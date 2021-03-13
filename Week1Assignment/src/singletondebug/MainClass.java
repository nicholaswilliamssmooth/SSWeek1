/**
 * Program used to test the singleton being debugged
 */
package singletondebug;

import java.math.BigDecimal;
import java.sql.SQLException;


/**
 * @author Nicholas Williams
 *
 */
public class MainClass {

	/**
	 * @param args not used for this assignment
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		/* 
		 * Not sure whether this is fixed or not, it throws the error
		 * "No suitable driver found for url of database". I'm not sure if
		 * that's because it's just a placeholder value, or if it's something I'm 
		 * suppose to fix as well, or if it was just the singleton structure
		 */
		SampleSingleton.databaseQuery(new BigDecimal(5));

	}

}
