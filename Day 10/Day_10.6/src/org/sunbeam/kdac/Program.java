package org.sunbeam.kdac;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DBUtils;

public class Program
{
	
	public static void main(String[] args) 
	{
		Connection connection = null;
		Statement statement = null;
		try
		{
			connection = DBUtils.getConnection();
			statement = connection.createStatement();
			//Step 4 : Prepare and execute query
			String sql = "SELECT * FROM employees";
			try( ResultSet rs = statement.executeQuery(sql) )
			{
				while( rs.next( ) )
				{
					int empid = rs.getInt("emp_id");
					String name = rs.getString("emp_name");
					float salary = rs.getFloat("salary");
					Date joinDate = rs.getDate("join_date");
					System.out.printf("%-5d%-15s%-10.2f%s\n",empid, name, salary, joinDate);
				}
			}
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
