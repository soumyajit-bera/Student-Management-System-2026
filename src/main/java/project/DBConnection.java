package project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String DRIVERNAME = "org.postgresql.Driver";  
	private static final String URL = "jdbc:postgresql://localhost:5432/College_Works";  
	private static final String USERNAME ="postgres"; 
	private static final String PASSWORD ="sb2004";  
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			System.out.println("Connection Established");
		}
		catch(Exception e1) {
			System.out.println("Connection not established" + e1);
		}
		return con;
	}
}
