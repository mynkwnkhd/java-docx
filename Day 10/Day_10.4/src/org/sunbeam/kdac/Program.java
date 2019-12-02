package org.sunbeam.kdac;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program
{
	//public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	//public static final String URL = "jdbc:mysql://localhost:3306/kdac_db";
	//public static final String USER = "sandeep";
	//public static final String PASSWORD = "sandeep";
	public static void main(String[] args) 
	{
		Connection connection = null;
		Statement statement = null;
		try
		{
			//Step 1 : Load And Register Driver
			Driver driver = new com.mysql.cj.jdbc.Driver( );
			DriverManager.registerDriver(driver);
			//Step 2 : Establish connection using users credential
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kdac_db", "sandeep", "sandeep");
			//Step 3 : Create Statement
			statement = connection.createStatement();
			//Step 4 : Prepare and execute query
			String sql = "SELECT * FROM employees";
			ResultSet rs = statement.executeQuery(sql);
			while( rs.next( ) )
			{
				/*int empid = rs.getInt(1);
				String name = rs.getString(2);
				float salary = rs.getFloat(3);
				Date joinDate = rs.getDate(4);*/
				
				int empid = rs.getInt("emp_id");
				String name = rs.getString("emp_name");
				float salary = rs.getFloat("salary");
				Date joinDate = rs.getDate("join_date");
				System.out.printf("%-5d%-15s%-10.2f%s\n",empid, name, salary, joinDate);
			}
			rs.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				//Step 5 : Close resources
				statement.close();
				connection.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
