package org.sunbeam.kdac;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Program
{
	private static Scanner sc = new Scanner(System.in);
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1. Type Information");
		System.out.println("2. Field Information");
		System.out.println("3. Constructor Information");
		System.out.println("4. Method Information");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		int choice;
		Integer n1 = new Integer(0);
		Class<?> c = n1.getClass();
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				Program.printTypeInfo( c );
				break;
			case 2:
				Program.printFieldInfo( c );
				break;
			case 3:
				Program.printConstructorInfo( c );
				break;
			case 4:
				Program.printMethodInfo( c );
				break;
			}
		}
	}
	private static void printMethodInfo(Class<?> c) 
	{
		if( c != null )
		{
			Method[] methods = c.getMethods();
			for (Method method : methods) 	
				System.out.println(method.toString());
		}
	}
	private static void printConstructorInfo(Class<?> c)
	{
		if( c != null )
		{
			Constructor<?>[] constructors = c.getConstructors();
			for (Constructor<?> constructor : constructors) 
				System.out.println(constructor.toString());
		}
	}
	private static void printFieldInfo(Class<?> c) 
	{
		if( c != null )
		{
			Field[] fields = c.getFields( );
			for (Field field : fields) 
				System.out.println(field.toString());
		}
	}
	private static void printTypeInfo(Class<?> c) 
	{
		if( c != null )
		{
			Package pkg = c.getPackage();
			System.out.println("Package	:	"+pkg.getName());
			//System.out.println("Type	:	"+c.getName());
			System.out.println("Type	:	"+c.getSimpleName());
		}
	}
}
