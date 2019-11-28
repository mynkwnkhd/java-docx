package org.sunbeam.kdac;
abstract class Shape
{
	protected float area;
	public abstract void calculateArea( );
	public float getArea() 
	{
		return area;
	}
}
public class Program //Program.class
{
	public static void main(String[] args) 
	{
		Shape shape = new Shape()
		{
			private float length = 10;
			private float breadth = 20;
			@Override
			public void calculateArea()
			{
				this.area = this.length * this.breadth;
			}
		};
		
		shape.calculateArea();
		System.out.println("Area	:	"+shape.getArea());
	}
	public static void main1(String[] args) 
	{
		//Object obj = null;	//reference
		//new Object();	//Anonymous instance
		//Object obj = new Object( ); //Instance with reference.
		Object obj = new Object() //Program$1.class
					{
						String message = "Hello";
						@Override
						public String toString() 
						{
							return message;
						}
					};
		System.out.println(obj.toString());
		
	}
}
