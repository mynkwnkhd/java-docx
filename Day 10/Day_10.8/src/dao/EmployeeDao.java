package dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.Employee;
import utils.DBUtils;

public class EmployeeDao implements Closeable
{
	private Connection connection;
	private Statement statement;
	public EmployeeDao() throws Exception 
	{
		this.connection = DBUtils.getConnection();
		this.statement = this.connection.createStatement();
	}
	public int insert( Employee emp )throws Exception
	{
		String sql = "INSERT INTO employees VALUES("+emp.getEmpid()+",'"+emp.getName()+"',"+emp.getSalary()+",'"+emp.getJoinDate()+"')";
		return this.statement.executeUpdate(sql);
	}
	public int update( int empid, float salary )throws Exception
	{
		String sql = "UPDATE employees SET salary="+salary+" WHERE emp_id="+empid+"";
		return this.statement.executeUpdate(sql);
	}
	public int delete( int empid )throws Exception
	{
		String sql = "DELETE FROM employees WHERE emp_id="+empid+"";
		return this.statement.executeUpdate(sql);
	}
	public List<Employee> select( )throws Exception
	{
		String sql = "SELECT * FROM employees";
		List<Employee> empList = new ArrayList<Employee>();
		try( ResultSet rs = this.statement.executeQuery(sql))
		{
			while( rs.next())
			{
				Employee emp = new Employee(rs.getString("emp_name"), rs.getInt("emp_id"), rs.getFloat("salary"), rs.getDate("join_date"));
				empList.add(emp);
			}
		}
		return empList;
	}
	@Override
	public void close() throws IOException 
	{
		try 
		{
			this.statement.close();
			this.connection.close();
		} 
		catch (SQLException cause )
		{
			throw new IOException(cause);
		}
	}
}
