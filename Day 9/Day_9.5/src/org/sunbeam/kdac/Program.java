package org.sunbeam.kdac;
import java.util.HashSet;
import java.util.Set;

public class Program 
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<>();
		set.add(214);
		set.add(914);
		set.add(761);
		set.add(119);
		set.add(300);
		
		set.add(214);
		set.add(914);
		set.add(761);
		set.add(119);
		set.add(300);
		
		set.add(null);	//OK
		
		set.forEach(System.out::println);
	}
}
