package naresh.biz.IG1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		// Register JDBC driver
		Class.forName("org.apache.ignite.IgniteJdbcThinDriver");

		// Open JDBC connection
		Connection conn = DriverManager.getConnection("jdbc:ignite:thin://127.0.0.1/");
		
		// Populate City table
		try (PreparedStatement stmt =
		conn.prepareStatement("INSERT INTO City22 (id, name) VALUES (?, ?)")) {

		    stmt.setLong(1, 1L);
		    stmt.setString(2, "Forest Hill");
		    stmt.executeUpdate();

		    stmt.setLong(1, 2L);
		    stmt.setString(2, "Denver");
		    stmt.executeUpdate();

		    stmt.setLong(1, 3L);
		    stmt.setString(2, "St. Petersburg");
		    stmt.executeUpdate();
		}

		// Populate Person table
		try (PreparedStatement stmt =
		conn.prepareStatement("INSERT INTO Person22 (id, name, city_id) VALUES (?, ?, ?)")) {

		    stmt.setLong(1, 1L);
		    stmt.setString(2, "John Doe");
		    stmt.setLong(3, 3L);
		    stmt.executeUpdate();

		    stmt.setLong(1, 2L);
		    stmt.setString(2, "Jane Roe");
		    stmt.setLong(3, 2L);
		    stmt.executeUpdate();

		    stmt.setLong(1, 3L);
		    stmt.setString(2, "Mary Major");
		    stmt.setLong(3, 1L);
		    stmt.executeUpdate();

		    stmt.setLong(1, 4L);
		    stmt.setString(2, "Richard Miles");
		    stmt.setLong(3, 2L);
		    stmt.executeUpdate();
		}
	}

}