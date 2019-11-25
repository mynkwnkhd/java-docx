package org.sunbeam.kdac;

import java.util.Arrays;
import java.util.Scanner;

public class Program 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int[] arr = new int[ ] { 10, 20, 30, 40, 50 };
		for (int element : arr) 
			System.out.println(element);
	}
	public static void main6(String[] args) 
	{
		int[] arr = new int[ ] { 50, 10, 40, 20, 30 };
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);//Dual-Pivot Quicksort
		System.out.println(Arrays.toString(arr));
	}
	public static void main5(String[] args) 
	{
		int[] arr = new int[ ] { 10, 20, 30, 40, 50 };
		int element = arr[ -1 ];// ArrayIndexOutOfBoundsException
		//int element = arr[ arr.length ]; ArrayIndexOutOfBoundsException
		System.out.println(element);
	}
	private static void acceptRecord(int[] arr)
	{
		if( arr != null )
		{
			for( int index = 0; index < arr.length; ++ index )
			{
				System.out.print("Enter element	:	");
				arr[ index ] = sc.nextInt();
			}
		}
	}
	private static void printRecord(int[] arr) 
	{
		if( arr != null )
		{
			for( int index = 0; index < arr.length; ++ index )
				System.out.println(arr[ index ] );
		}
	}
	public static void main4(String[] args) 
	{
		int[] arr = new int[ 5 ];
		
		Program.acceptRecord( arr );
		
		Program.printRecord( arr );
	}
	public static void main3(String[] args) 
	{
		int[] arr = new int[ 5 ];
		for( int index = 0; index < arr.length; ++ index )
		{
			System.out.print("Enter element	:	");
			arr[ index ] = sc.nextInt();
		}
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ] );
	}
	public static void main2(String[] args) 
	{
		//int[] arr = new int[  ] { 10, 20, 30, 40, 50 };
		int[] arr = { 10, 20, 30, 40, 50 };
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ]);
	
	}
	public static void main1(String[] args) 
	{
		int[] arr = new int[ 3 ];	//OK
		System.out.println(arr.toString());	//[I@7852e922
		System.out.println(Arrays.toString(arr));//[0, 0, 0]
	}	
}
