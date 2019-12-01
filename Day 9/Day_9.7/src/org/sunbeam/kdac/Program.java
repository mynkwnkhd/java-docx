package org.sunbeam.kdac;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Program 
{
	public static Dictionary<Integer, String> getDictionary( )
	{
		Dictionary<Integer, String> d = new Hashtable<>();
		d.put(1, "DAC");
		d.put(2, "PRECAT");
		d.put(3, "M-POWER");
		d.put(4, "Wimc");
		return d;
	}
	public static void main(String[] args) 
	{
		Dictionary<Integer, String> d = Program.getDictionary();
		//Program.printKeys( d );
		//Program.printValues( d );
		//Program.removeEntry( d, 4 );
		Program.searchEntry( d, 4 );
	}
	private static void searchEntry(Dictionary<Integer, String> d, int key)
	{
		if( d != null )
		{
			String value =  d.get(key);
			System.out.println(key+" "+value);
		}
	}
	private static void removeEntry(Dictionary<Integer, String> d, int key ) 
	{
		if( d != null )
		{
			String value = d.remove(key);
			System.out.println(key+" "+value);
		}
	}
	private static void printValues(Dictionary<Integer, String> d)
	{
		if( d != null )
		{
			String value = null;
			Enumeration<String> e = d.elements();
			while( e.hasMoreElements())
			{
				value = e.nextElement();
				System.out.println(value);
			}
		}
	}
	private static void printKeys(Dictionary<Integer, String> d) 
	{
		if( d != null )
		{
			Integer key = null;
			Enumeration<Integer> e = d.keys();			
			while( e.hasMoreElements())
			{
				key = e.nextElement();
				System.out.println(key);
			}
		}
	}

}
