package org.sunbeam.kdac;

import java.util.ArrayList;

public class Program
{
	private static ArrayList<Integer> getIntegerList() 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		return list;
	}
	private static ArrayList<Double> getDoubleList() 
	{
		ArrayList<Double> list = new ArrayList<>();
		list.add(10.1);
		list.add(20.2);
		list.add(30.3);
		list.add(40.4);
		list.add(50.5);
		return list;
	}
	private static ArrayList<String> getStringList() 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("PRECAT");
		list.add("DAC");
		list.add("DMC");
		list.add("DESD");
		list.add("DBDA");
		return list;
	}
	//UnBounded
	/*private static void print(ArrayList<?> list) 
	{
		for( Object element : list )
			System.out.println(element);
	}*/
	//Upper Bounded
	/*private static void print(ArrayList< ? extends Number > list) 
	{
		for( Object element : list )
			System.out.println(element);
	}*/
	private static void print(ArrayList< ? super Integer > list) 
	{
		for( Object element : list )
			System.out.println(element);
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> integerList =  Program.getIntegerList( );
		Program.print(integerList);
		
		ArrayList<Double> doubleList = Program.getDoubleList();
		Program.print(doubleList);
		
		ArrayList<String> stringList = Program.getStringList();
		Program.print(stringList);
	}
	

	
}
