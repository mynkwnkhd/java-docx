package org.sunbeam.kdac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program 
{
	public static Map<Integer, String> getMap( )
	{
		Map<Integer, String> map = new Hashtable<>();
		map.put(1, "DAC");
		map.put(2, "DMC");
		map.put(3, "DESD");
		map.put(4, "DBDA");
		map.put(5, "PREDAC");
		return map;
	}
	public static void main(String[] args) 
	{
		Map<Integer, String> map = Program.getMap();
		//Program.printKeys( map );
		//Program.printValues( map );
		//Program.printEntry( map );
		//Program.findEntry( map, 3 );
		//Program.removeEntry( map, 3 );
		Program.convertToList( map );
	}
	private static void convertToList(Map<Integer, String> map) 
	{
		if( map != null )
		{
			/*Set<Integer> keys = map.keySet();
			List<Integer> list1 = new ArrayList<Integer>(keys);*/
			
			List<Integer> list1 = new ArrayList<Integer>(map.keySet());
			list1.forEach(System.out::println);
			
			/*Collection<String> values = map.values();
			List<String> list2 = new LinkedList<String>(values);*/
			List<String> list2 = new LinkedList<String>(map.values());
			list2.forEach(System.out::println);
		}
	}
	private static void removeEntry(Map<Integer, String> map, int id)
	{
		if( map != null )
		{
			Integer key = new Integer(id);
			if( map.containsKey(key))
			{
				String value = map.remove(key);
				System.out.println(key+" "+value);

			}
			else
				System.out.println("Key not found");
		}
	}
	private static void findEntry(Map<Integer, String> map, int id)
	{
		if( map != null )
		{
			Integer key = new Integer(id);
			if( map.containsKey(key))
			{
				String value = map.get(key);
				System.out.println(key+" "+value);

			}
			else
				System.out.println("Key not found");
		}
	}
	private static void printEntry(Map<Integer, String> map) 
	{
		if( map != null )
		{
			Set<Entry<Integer, String>> entries = map.entrySet();
			for (Entry<Integer, String> entry : entries) 
			{
				Integer key = entry.getKey();
				String value = entry.getValue();
				System.out.println(key+" "+value);
			}
		}
	}
	private static void printValues(Map<Integer, String> map)
	{
		if( map != null )
		{
			Collection<String> values = map.values();
			for (String value : values) 
				System.out.println(value);
		}	
	}
	private static void printKeys(Map<Integer, String> map) 
	{
		if( map != null )
		{
			Set<Integer> keys = map.keySet();
			for( Integer key : keys )
				System.out.println(key);
		}
	}
}
