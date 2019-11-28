package org.sunbeam.kdac;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program 
{
	public static final String NAME_PATTEREN = "[a-zA-Z][a-zA-Z ]*";
	public static void main(String[] args) 
	{
		try( Scanner sc = new Scanner(System.in))
		{
			System.out.print("Enter Name	:	");
			String name = sc.nextLine();
			 while( !name.matches(NAME_PATTEREN)  )
			 {
				 System.out.print("Re Enter name	:	");
				 name = sc.nextLine();
			 }
			 System.out.println("Name	:	"+name);
		}
	}
	public static void main2(String[] args) 
	{
		try( Scanner sc = new Scanner(System.in))
		{
			System.out.print("Enter Name	:	");
			String name = sc.nextLine();
			 while( !Pattern.matches(NAME_PATTEREN, name) )
			 {
				 System.out.print("Re Enter name	:	");
				 name = sc.nextLine();
			 }
			 System.out.println("Name	:	"+name);
			
		}
	}
	public static void main1(String[] args) 
	{
		try( Scanner sc = new Scanner(System.in))
		{
			System.out.print("Enter Name	:	");
			String name = sc.nextLine();
			
			 Pattern p = Pattern.compile( Program.NAME_PATTEREN );
			 Matcher m = p.matcher( name );
			 while( !m.matches( ) )
			 {
				 System.out.print("Re Enter name	:	");
				 name = sc.nextLine();
				 m = p.matcher( name );
			 }
			 System.out.println("Name	:	"+name);
			
		}
	}
}
