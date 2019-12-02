package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.EmployeeDao;
import pojo.Employee;
import utils.DBUtils;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Insert Record");
		System.out.println("2.Update Record");
		System.out.println("3.Remove Record");
		System.out.println("4.Print Records");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		try( EmployeeDao dao = new EmployeeDao())
		{
			int choice;
			while( ( choice = Program.menuList( ) ) != 0 )
			{
				switch( choice )
				{
				case 1:
					Employee emp = new Employee("Amol", 4, 30000, Date.valueOf("2010-03-28") );
					dao.insert(emp);
					break;
				case 2:
					dao.update(4, 28000);
					break;
				case 3:
					dao.delete(4);
					break;
				case 4:
					dao.select().forEach(System.out::println);
					break;
				}
			}
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
	}
}
