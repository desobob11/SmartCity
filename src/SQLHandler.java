import java.sql.DriverManager;
import java.sql.*;



public class SQLHandler {

	private final String dbURL = "jdbc:derby://68.146.201.241:1527/cityDB";
	private String tableName;
	private Connection conn = null;
	private Statement stmt = null;
	
	@SuppressWarnings("deprecation")
	private void connect() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			conn = DriverManager.getConnection(dbURL);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void searchTable(String tableName, String[] values, int column) {
		try {
		connect();
		String command = String.format("select * fromm %s", tableName);
		ResultSet rs = stmt.executeQuery("select * from %s");
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();
		
		while (rs.next()) {
			
		}
		
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
