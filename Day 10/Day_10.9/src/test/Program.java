package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.DBUtils;

public class Program 
{
	public static void main(String[] args) 
	{		
		Connection connection = null;
		PreparedStatement statement = null;
		try
		{
			connection = DBUtils.getConnection();
			String sql = "INSERT INTO BookTable VALUES(?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, 1026);
			statement.setString(2, "OS");
			statement.setString(3, "OS Concept's");
			statement.setString(4, "Galvin");
			statement.setFloat(5, 550);
			int count = statement.executeUpdate();
			System.out.println(count+"Record updated");
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
		finally 
		{
			try 
			{
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
