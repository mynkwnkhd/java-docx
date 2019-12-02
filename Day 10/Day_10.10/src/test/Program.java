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

import dao.BookDao;
import pojo.Book;
import utils.DBUtils;

public class Program 
{
	public static void main(String[] args) 
	{		
		try( BookDao dao = new BookDao())
		{
			Book book = new Book(1026,"OS","OS Conept's","Galvin",650);
			//dao.insert(book);
			dao.update(1026, 575);
			//dao.delete(1026);
			
			dao.getBooks().forEach(System.out::println);
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
	}
}
