package org.sunbeam.kdac;

import java.util.Arrays;

public class Program 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[ ] { 50, 10, 20, 40, 30 };
		System.out.println(Arrays.toString( arr ) );
		Arrays.sort(arr);
		System.out.println(Arrays.toString( arr ) );
	}
}
