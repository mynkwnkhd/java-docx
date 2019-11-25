package org.sunbeam.kdac;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][] arr = new int[ 3 ][  ];
		arr[ 0 ] = new int[  ] { 1,2,3,4};
		arr[ 1 ] = new int[  ] {5,6};
		arr[ 2 ] = new int[  ] {7,8,9};
		for( int[] i : arr )
		{
			for( int j : i )
				System.out.print( j+"	");
			System.out.println();
		}
	}
	public static void main2(String[] args) 
	{
		int[][] arr = new int[ 3 ][  ];
		arr[ 0 ] = new int[  ] { 1,2,3,4};
		arr[ 1 ] = new int[  ] {5,6};
		arr[ 2 ] = new int[  ] {7,8,9};
		for( int index = 0; index <arr.length; ++ index )
			System.out.println(Arrays.toString(arr[ index ] ) );
	}
	public static void main1(String[] args) 
	{
		int[][] arr = new int[ 3 ][  ];
		arr[ 0 ] = new int[ 4 ];
		arr[ 1 ] = new int[ 2 ];
		arr[ 2 ] = new int[ 3 ];
		
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
}
