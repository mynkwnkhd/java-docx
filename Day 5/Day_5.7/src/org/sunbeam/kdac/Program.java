package org.sunbeam.kdac;

public class Program
{
	public static void main(String[] args) 
	{
		String str = new String("SunBeam");
		char ch = str.charAt( str.length() ); //StringIndexOutOfBoundsException
		System.out.println(ch);
	}
}
