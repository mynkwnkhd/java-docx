package org.sunbeam.kdac;

import java.util.Date;

public class Program 
{
	public static void main(String[] args) 
	{
		String regex = "\\.";
		String str = "www.sunbeaminfo.com";
		String[] words = str.split(regex);
		for (String word : words) 
			System.out.println(word);
	}
	public static void main2(String[] args) 
	{
		String regex = " ";
		String str = "SunBeam Infotech Pune";
		String[] words = str.split(regex);
		for (String word : words) 
			System.out.println(word);
	}
	public static void main1(String[] args) 
	{
		String str = "SunBeam Infotech Pune";
		//String subStr =  str.substring(8);	//Infotech Pune
		String subStr =  str.substring(8, 16);	//Infotech
		System.out.println(subStr);
	}
}
