package org.sunbeam.kdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Program 
{
	public static List<Integer> getList( )
	{
		List<Integer> list = new ArrayList< >( );
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		return list;
	}
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,20,30,40,50,60);
		//System.out.println(list.getClass().getName());//java.util.Arrays$ArrayList
		list.forEach(System.out::println);
	}
	public static void main6(String[] args) 
	{
		Integer element = null;
		List<Integer> list = Program.getList();
		ListIterator<Integer> itr = list.listIterator();
		while( itr.hasNext())
		{
			element = itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		while( itr.hasPrevious())
		{
			element = itr.previous();
			System.out.print(element+" ");
		}
	}
	public static void main5(String[] args) 
	{
		/*Consumer<Integer> action = ( Integer number )-> System.out.println( number);
		List<Integer> list = Program.getList( );
		list.forEach(action); */
		
	
		/*List<Integer> list = Program.getList( );
		list.forEach( number -> System.out.println( number) );*/
		
		//Consumer<Integer> action = System.out::println;
		
		/*List<Integer> list = Program.getList( );
		list.forEach( System.out::println); */
		
		Program.getList().forEach(System.out::println);
	}
	public static void main4(String[] args) 
	{
		List<Integer> list = Program.getList( );
		for( Integer element : list )
			System.out.println(element);
	}
	public static void main3(String[] args) 
	{
		List<Integer> list = Program.getList( );
		Integer element = list.get( list.size() ) ; //IndexOutOfBoundsException
	}
	public static void main2(String[] args) 
	{
		Integer element = null;
		List<Integer> list = Program.getList( );
		for( int index = 0; index < list.size(); ++ index )
		{
			element = list.get( index );
			System.out.println(element);
		}
	}
	public static void main1(String[] args) 
	{
		List<Integer> list = Program.getList( );
		System.out.println("Count of elements	:	"+list.size());
	}
}
