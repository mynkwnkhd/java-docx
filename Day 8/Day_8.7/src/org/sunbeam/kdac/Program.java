package org.sunbeam.kdac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Program 
{
	public static void main(String[] args) 
	{
		//LinkedList<Integer> collection = new LinkedList<Integer>();
		//List<Integer> collection = new LinkedList<Integer>();
		Collection<Integer> collection = new LinkedList<Integer>();
		collection.add(10);
		collection.add(20);
		collection.add(30);
		
		List<Integer> list = new ArrayList<>( collection );
		System.out.println(list.size());
		
	}
	public static void main2(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<>( 7 );
		
		List<Integer> list2 = new ArrayList<>( 10 );	//Upcasting
		
		Collection<Integer> list3 = new ArrayList<>( 15 );	//Upcasting
	}
	public static void main1(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<>();
		
		List<Integer> list2 = new ArrayList<>();	//Upcasting
		
		Collection<Integer> list3 = new ArrayList<>();	//Upcasting
	}
}
