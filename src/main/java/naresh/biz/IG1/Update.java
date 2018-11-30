package naresh.biz.IG1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		// Register JDBC driver
		Class.forName("org.apache.ignite.IgniteJdbcThinDriver");

		// Open JDBC connection
		Connection conn = DriverManager.getConnection("jdbc:ignite:thin://127.0.0.1/");
		
		try (Statement stmt = conn.createStatement()) 
		{

		    // Update City
		    stmt.executeUpdate("UPDATE City22 SET name = 'Naresh reddy' WHERE id = 2");
		    stmt.executeUpdate("UPDATE Person22 SET name = 'Swathi' WHERE id = 2");
		    stmt.executeUpdate("UPDATE Person22 SET name = 'Naresh reddy' WHERE id = 1");
		}
	}

} 