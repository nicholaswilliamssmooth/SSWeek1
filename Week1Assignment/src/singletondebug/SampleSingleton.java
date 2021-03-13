package singletondebug;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// removed 'static' from the class declaration
public class SampleSingleton {

	private static Connection conn = null;
	
	private static SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
		return instance;
	}
	// added a SQLException throw
	public static void databaseQuery(BigDecimal input) throws SQLException {
		conn = DriverManager.getConnection("url of database");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from table");
		int x = 0;
		while(rs.next()) {
			// converted input into an int so it can be multiplied with rs.getInt
			x = rs.getInt(1) * input.intValue();
		}
	}
}
