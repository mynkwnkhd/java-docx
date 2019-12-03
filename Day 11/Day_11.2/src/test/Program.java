package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DBUtils;

public class Program 
{
	public static void main(String[] args) 
	{
		String sql = "";
		Connection connection = null;
		Statement statement = null;
		try
		{
			connection = DBUtils.getConnection();
			connection.setAutoCommit(false);
			statement = connection.createStatement();
			
			sql = "UPDATE accounts SET balance = balance + 10000 WHERE acc_number=101";
			statement.executeUpdate(sql);
			
			sql = "UPDATE accounts SET balance = balance - 10000 WHERE acc_number=102";
			statement.executeUpdate(sql);
			connection.commit();
			
		}
		catch( Exception ex )
		{
			try 
			{
				ex.printStackTrace();
				connection.rollback();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		finally 
		{
			try
			{
				connection.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
