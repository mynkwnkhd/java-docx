package org.sunbeam.kdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Program 
{
	public static List<Integer> getList( )
	{
		List<Integer> list = new ArrayList< >( );
		list.add(100);
		list.add(10);
		list.add(90);
		list.add(20);
		list.add(80);
		list.add(30);
		list.add(70);
		list.add(40);
		list.add(60);
		list.add(50);
		return list;
	}
	public static void main(String[] args) 
	{
		Collection<Integer> c = new ArrayList<>();
		c.add(110);
		c.add(130);
		c.add(150);
		List<Integer> list = Program.getList();
		//list.addAll(c);
		list.addAll(1, c);
		
		list.forEach(System.out::println);
		
	}
	public static void main3(String[] args) 
	{
		Collection<Integer> c = new ArrayList<>();
		c.add(10);
		c.add(30);
		c.add(50);
		List<Integer> list = Program.getList();
		if( list.containsAll(c))
		{
			//list.removeAll(c);
			list.retainAll(c);
			list.forEach(System.out::println);
		}
	}
	public static void main2(String[] args) 
	{
		List<Integer> list = Program.getList();
		Integer key = new Integer(50);
		if( list.contains(key))
		{
			//int index = list.indexOf(key);
			//list.remove(index);
			list.remove(key);
			list.forEach(System.out::println);
		}
		else
			System.out.println(key+" not found");
	}
	public static void main1(String[] args) 
	{
		List<Integer> list = Program.getList();
		//Collections.sort(list);
		list.sort(null);
		list.forEach(System.out::println);
	}
}
