package org.sunbeam.kdac;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Program 
{
	public static void main(String[] args) 
	{
		Queue<Integer> que = new ArrayDeque<>( );
		//Queue<Integer> que = new LinkedList<Integer>();
		que.offer(10);
		que.offer(20);
		que.offer(30);
		
		Integer element = null;
		while( !que.isEmpty())
		{
			element = que.peek();
			System.out.println("Removed element is : "+element);
			que.poll();
		}
	}
	public static void main1(String[] args) 
	{
		Queue<Integer> que = new ArrayDeque<>( );
		que.add(10);
		que.add(20);
		que.add(30);
		
		Integer element = null;
		while( !que.isEmpty())
		{
			element = que.element();
			System.out.println("Removed element is : "+element);
			que.remove();
		}
	}
}
