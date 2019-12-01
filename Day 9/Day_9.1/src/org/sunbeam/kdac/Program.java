package org.sunbeam.kdac;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Program 
{
	public static void main(String[] args)
	{
		Deque<Integer> stk = new ArrayDeque<>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		
		Integer element = null;
		while( !stk.isEmpty())
		{
			element = stk.peek();
			System.out.println("Popped element is	:	"+element);
			stk.pop();
		}
	}
	public static void main1(String[] args)
	{
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		
		Integer element = null;
		while( !stk.empty())
		{
			element = stk.peek();
			System.out.println("Popped element is	:	"+element);
			stk.pop();
		}
	}
}
