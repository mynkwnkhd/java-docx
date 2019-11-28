package org.sunbeam.kdac;

import java.text.SimpleDateFormat;
import java.util.Date;


class Box<T extends Number > //T Type Parameter
{
	private T object;
	public T getObject() 
	{
		return this.object;
	}
	public void setObject(T object) 
	{
		this.object = object;
	}
}
public class Program
{
	public static void main(String[] args) 
	{
		Box<Number> b1 = new Box<>( );	//OK
		
		Box<Integer> b2 = new Box<>( );	//OK
			
		Box<Double> b3 = new Box<>( );	//OK
		
		Box<String> b4 = new Box<>( );	//Not OK
		
		Box<Date> b5 = new Box<>( );	//Not OK
	}
}
