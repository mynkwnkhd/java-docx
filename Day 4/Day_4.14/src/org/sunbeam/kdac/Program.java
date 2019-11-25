package org.sunbeam.kdac;

import java.util.Arrays;
import java.util.Scanner;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][] arr = new int[  ][  ] { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for( int[] i : arr )
		{
			for( int j : i )
				System.out.print( j+"	");
			System.out.println();
		}
	}
	public static void main3(String[] args) 
	{
		//int[][] arr = new int[  ][  ] { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] arr =  { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//System.out.println(arr.toString()); //[[I@42a57993
		for( int index = 0; index <arr.length; ++ index )
			System.out.println(Arrays.toString(arr[ index ] ) );
	}
	public static void main2(String[] args) 
	{
		int[][] arr = new int[ 3 ][ 4 ];
		for( int i = 0; i < arr.length; ++ i )
		{
			for( int j = 0; j < arr[ i ].length; ++ j )
			{
				System.out.print("Enter element	:	");
				arr[ i ][ j ] = sc.nextInt();
			}
			
		}
		for( int i = 0; i < arr.length; ++ i )
		{
			for( int j = 0; j < arr[ i ].length; ++ j )
			{
				System.out.print(arr[ i ][ j ]+"	");
			}
			System.out.println();
		}
	}
	public static void main1(String[] args) 
	{
		int[][] arr = new int[ 3 ][ 4 ];
		for( int i = 0; i < 3; ++ i )
		{
			for( int j = 0; j < 4; ++ j )
			{
				System.out.print("Enter element	:	");
				arr[ i ][ j ] = sc.nextInt();
			}
			
		}
		for( int i = 0; i < 3; ++ i )
		{
			for( int j = 0; j < 4; ++ j )
			{
				System.out.print(arr[ i ][ j ]+"	");
			}
			System.out.println();
		}
	}	
}
