package org.sunbeam.kdac;

import java.util.ArrayList;
import java.util.Calendar;

class Date implements Cloneable
{
	private int day;
	private int month;
	private int year;
	public Date() 
	{
		Calendar c = Calendar.getInstance();
		this.day = c.get(Calendar.DAY_OF_MONTH);
		this.month = c.get( Calendar.MONTH) + 1;
		this.year = c.get(Calendar.YEAR);
	}
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDay(int day) 
	{
		this.day = day;
	}
	public void setMonth(int month) 
	{
		this.month = month;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	@Override
	public Date clone( ) throws CloneNotSupportedException
	{
		Date other =  (Date) super.clone();
		return other;
	}
	@Override
	public String toString() 
	{
		return this.day+" / "+this.month+" / "+this.year;
	}
}
public class Program extends Object
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
		
		//list1.clear();
		for( Integer element : list1 )
		{
			System.out.println("List1 : "+element);
		}
		
		for( Integer element : list2 )
		{
			System.out.println("List2 : "+element);
		}
		
	}
	public static void main1(String[] args) 
	{
		try
		{
			Date dt1 = new Date();
			Date dt2 = dt1.clone();
			dt1.setDay(12);
			dt2.setDay(24);
			System.out.println(dt1.toString());
			System.out.println(dt2.toString());
		} 
		catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
	}	
}
