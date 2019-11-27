package org.sunbean.kdac;

import java.util.Scanner;

abstract class Shape
{
	protected float area;
	public Shape() 
	{	}
	public abstract void calculateArea( );
	public final float getArea() 
	{
		return area;
	}
}
class Rectangle extends Shape
{
	private float length;
	private float breadth;
	public void setLength(float length) 
	{
		this.length = length;
	}
	public void setBreadth(float breadth) 
	{
		this.breadth = breadth;
	}
	public void calculateArea() 
	{
		this.area = this.length * this.breadth;
	}
}
class Circle extends Shape
{
	private float radius;
	public void setRadius(float radius) 
	{
		this.radius = radius;
	}
	public void calculateArea() 
	{
		this.area = (float) (Math.PI * Math.pow(this.radius, 2 ));
	}
}
public class Program 
{
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(Shape shape) 
	{
		if( shape instanceof Rectangle )
		{
			Rectangle rect = (Rectangle) shape;	//downcasting
			System.out.print("Length	:	");
			rect.setLength(sc.nextFloat());
			System.out.print("Breadth	:	");
			rect.setBreadth(sc.nextFloat());
		}
		else
		{
			Circle c = (Circle) shape;	//downcasting
			System.out.print("Radius	:	");
			c.setRadius(sc.nextFloat());
		}
	}	
	private static void printRecord(Shape shape)
	{
		String className = shape.getClass().getSimpleName();
		System.out.println("Area of "+className+" is	:	"+shape.getArea());
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			Shape shape = null;
			switch( choice )
			{
			case 1:
				shape = new Rectangle();	//Upcasting
				break;
			case 2:
				shape = new Circle();	//Upcasting
				break;
			}
			if( shape != null )
			{
				Program.acceptRecord( shape );
				shape.calculateArea( );//DMD
				Program.printRecord( shape );
			}
		}
	}
}
