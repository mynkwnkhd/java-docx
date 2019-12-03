package test;

import java.util.List;
import java.util.Scanner;

import dao.BookDao;
import pojo.Book;

public class Program
{
	private static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(Book book)
	{
		if( book != null )
		{
			System.out.print("Book Id	:	");
			book.setBookId(sc.nextInt());
			System.out.print("Subject	:	");
			sc.nextLine();
			book.setSubjectName(sc.nextLine());
			System.out.print("Book Name	:	");
			book.setBookName(sc.nextLine());
			System.out.print("Author	:	");
			book.setAuthorName(sc.nextLine());
			System.out.print("price	:	");
			book.setPrice(sc.nextFloat());
		}
	}
	private static void acceptRecord(int[] bookId) 
	{
		if( bookId != null )
		{
			System.out.print("Enter book id	:	");
			bookId[ 0 ] = sc.nextInt();
		}
	}
	private static void acceptRecord(float[] price) 
	{
		if( price != null )
		{
			System.out.print("Enter price	:	");
			price[ 0 ] = sc.nextFloat();
		}
	}
	private static void printRecord(int updateCount) 
	{
		System.out.println(updateCount+" Record(s) updated");
	}
	private static void printBooks(List<Book> bookList) 
	{
		if( bookList != null )
		{
			if( !bookList.isEmpty())
				bookList.forEach(System.out::println);
			else
				System.out.println("Book list is empty");
		}
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Add Book");
		System.out.println("2.Update Book");
		System.out.println("3.Delete Book");
		System.out.println("4.Print Book(s)");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		try( BookDao dao = new BookDao())
		{
			int choice,updateCount;
			int[] bookId = new int[ 1 ];
			float[] price = new float[ 1 ];
			while( ( choice = Program.menuList( ) ) != 0 )
			{
				switch( choice )
				{
				case 1:
					Book book = new Book();
					Program.acceptRecord( book );
					updateCount = dao.insertBook( book );
					Program.printRecord(updateCount);
					break;
				case 2:
					Program.acceptRecord( bookId );
					Program.acceptRecord( price );
					updateCount = dao.updateBook(bookId[ 0 ], price[ 0 ] );
					Program.printRecord( updateCount );
					break;
				case 3:
					Program.acceptRecord( bookId );
					updateCount = dao.deleteBook( bookId[ 0 ] );
					Program.printRecord( updateCount );
					break;
				case 4:
					List<Book> bookList = dao.getBooks();
					Program.printBooks( bookList );
					break;
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
