package org.sunbeam.kdac;
public class Program 
{
	public static void main(String[] args) 
	{
		String str1 = "SunBeam";
		String str = "Sun";
		String str2 = (str + "Beam").intern();
		if( str1 == str2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main8(String[] args) 
	{
		String str1 = "SunBeam";
		String str = "Sun";
		String str2 = str + "Beam";
		if( str1.equals(str2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main7(String[] args) 
	{
		String s1 = "Sun"+"Beam";	//SunBeam
		String s2 = "SunBeam";
		if( s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main6(String[] args) 
	{
		String s1 = "SunBeam";
		String s2 = "SunBeam";
		if( s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main5(String[] args) 
	{
		String s1 = "SunBeam";
		String s2 = "SunBeam";
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main4(String[] args) 
	{
		String s1 = new String("SunBeam");
		String s2 = "SunBeam";
		if( s1.equals(s2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main3(String[] args) 
	{
		String s1 = new String("SunBeam");
		String s2 = "SunBeam";
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal
	}
	public static void main2(String[] args) 
	{
		String s1 = new String("SunBeam");
		String s2 = new String("SunBeam");
		if( s1.equals(s2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	public static void main1(String[] args) 
	{
		String s1 = new String("SunBeam");
		String s2 = new String("SunBeam");
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal
	}
}
