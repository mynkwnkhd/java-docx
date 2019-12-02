package dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Book;
import utils.DBUtils;

public class BookDao implements Closeable
{
	private Connection connection;
	private PreparedStatement stmtInsert;
	private PreparedStatement stmtUpdate;
	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public BookDao() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("INSERT INTO BookTable VALUES(?,?,?,?,?)");
		this.stmtUpdate = this.connection.prepareStatement("UPDATE BookTable SET price=? WHERE book_id=?");
		this.stmtDelete = this.connection.prepareStatement("DELETE FROM BookTable WHERE book_id=?");
		this.stmtSelect = this.connection.prepareStatement("SELECT * FROM BookTable");
	}
	public int insert( Book book  )throws Exception
	{
		this.stmtInsert.setInt(1, book.getBookId());
		this.stmtInsert.setString(2, book.getSubjectName());
		this.stmtInsert.setString(3, book.getBookName());
		this.stmtInsert.setString(4, book.getAuthorName());
		this.stmtInsert.setFloat(5, book.getPrice());
		return this.stmtInsert.executeUpdate();
	}
	public int update( int bookId, float price )throws Exception
	{
		this.stmtUpdate.setFloat(1, price);
		this.stmtUpdate.setInt(2, bookId );
		return this.stmtUpdate.executeUpdate();
	}
	public int delete( int bookId )throws Exception
	{
		this.stmtDelete.setInt(1, bookId);
		return this.stmtDelete.executeUpdate();
	}
	public List<Book> getBooks( )throws Exception
	{
		List<Book> bookList = new ArrayList<Book>();
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			while( rs.next())
			{
				Book book = new Book(rs.getInt("book_id"), rs.getString("subject_name"), rs.getString("book_name"),rs.getString("author_name"), rs.getFloat("price"));
				bookList.add(book);
			}
		}
		return bookList;
	}
	@Override
	public void close() throws IOException 
	{
		try 
		{
			this.stmtInsert.close();
			this.stmtUpdate.close();
			this.stmtDelete.close();
			this.stmtSelect.close();
			this.connection.close();
		}
		catch (SQLException cause)
		{
			throw new IOException(cause);
		}
	}
}
