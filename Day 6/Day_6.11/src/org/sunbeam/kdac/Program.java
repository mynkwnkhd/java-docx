package org.sunbeam.kdac;

import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) 
	{
		try( Scanner sc = new Scanner(System.in))
		{
			System.out.print("Enter number	:	");
			int num1 = sc.nextInt();
			String strNum1 = String.valueOf(num1);
			StringBuilder sb = new StringBuilder(strNum1);
			sb.reverse();
			String strNum2 = sb.toString();
			int num2 = Integer.parseInt(strNum2);
			System.out.println("Number	:	"+num2);
		}
	}
	public static void main5(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("DAC");
		System.out.println(sb1.hashCode());
		StringBuffer sb2 = new StringBuffer("DAC");
		System.out.println(sb2.hashCode());
	}
	public static void main4(String[] args) 
	{
		StringBuilder sb1 = new StringBuilder("KDAC");
		StringBuilder sb2 = new StringBuilder("KDAC");
		if( sb1.equals(sb2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal
	}
	public static void main3(String[] args) 
	{
		StringBuilder sb1 = new StringBuilder("KDAC");
		StringBuilder sb2 = new StringBuilder("KDAC");
		if( sb1 == sb2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal
	}
	public static void main2(String[] args) 
	{
			StringBuffer sb1 = new StringBuffer("DAC");
			StringBuffer sb2 = new StringBuffer("DAC");
			if( sb1.equals(sb2) )
				System.out.println("Equal");
			else
				System.out.println("Not Equal");
			//Output : Not Equal
	}
	public static void main1(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("DAC");
		StringBuffer sb2 = new StringBuffer("DAC");
		if( sb1 == sb2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal
	}
}
