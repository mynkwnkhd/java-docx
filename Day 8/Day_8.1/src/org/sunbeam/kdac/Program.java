package org.sunbeam.kdac;

import java.util.Iterator;
import java.util.LinkedList;

public class Program 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list  =  new LinkedList<>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext())
		{
			element = itr.next();
			System.out.println(element);
		}
	}
	public static void main2(String[] args) 
	{
		LinkedList<Integer> list  =  new LinkedList<>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		for( Integer element : list )
			System.out.println(element);
	}
	public static void main1(String[] args) 
	{
		int[] arr = new int[  ] { 10, 20, 30 };
		for( int element : arr )
			System.out.println(element);
	}
}
