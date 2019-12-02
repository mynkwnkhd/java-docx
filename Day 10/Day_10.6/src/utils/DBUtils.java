package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils 
{
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/kdac_db";
	public static final String USER = "sandeep";
	public static final String PASSWORD = "sandeep";
	static
	{
		try 
		{
			Class.forName(DRIVER);
		}
		catch (ClassNotFoundException cause) 
		{
			throw new RuntimeException(cause);
		}
	}
	public static Connection getConnection( )throws Exception
	{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
