package org.sunbeam.kdac;

@FunctionalInterface
interface Printable
{
	void print( );	//Method Descriptor
}
class Test implements Printable
{
	@Override
	public void print() 
	{
		System.out.println("Inside print");
	}
}
public class Program 
{
	public static void main(String[] args) 
	{
		//void print( );
		Printable p = ( )-> System.out.println("Hello Lambda");
		p.print();
	}
	public static void main2(String[] args) 
	{
		Printable p = new Printable()
		{	
			@Override
			public void print() 
			{
				System.out.println("Inside print");
			}
		};
		p.print();
	}
	public static void main1(String[] args) 
	{
		Printable p = new Test();
		p.print();
	}
}
