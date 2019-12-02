package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.Employee;
import utils.DBUtils;

public class Program 
{
	public static void main(String[] args) 
	{
		try( Connection connection = DBUtils.getConnection();
			 Statement statement = connection.createStatement();
			 ResultSet rs = statement.executeQuery("SELECT * FROM employees");)
		{
			/*while( rs.next())
			{
				Employee emp = new Employee();
				emp.setEmpid( rs.getInt(1) );
				emp.setName( rs.getString(2) );
				emp.setSalary( rs.getFloat(3) );
				emp.setJoinDate( rs.getDate(4) );
				System.out.println(emp.toString());
			}*/
			List<Employee> empList = new ArrayList<Employee>();
			while( rs.next())
			{
				Employee emp = new Employee(rs.getString("emp_name"), rs.getInt("emp_id"), rs.getFloat("salary"), rs.getDate("join_date"));
				empList.add(emp);
			}
			if( !empList.isEmpty() )
				empList.forEach(System.out::println);
			
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
	}
}
