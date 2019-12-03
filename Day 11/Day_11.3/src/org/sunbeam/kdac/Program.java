package org.sunbeam.kdac;

import java.lang.Thread.State;

class Test
{
	public Test() 
	{
		System.out.println("Inside constructor");
	}
	public void print( )
	{
		System.out.println("Inside print method");
	}
	@Override
	protected void finalize() throws Throwable 
	{
		Thread thread = Thread.currentThread();

		String name = thread.getName( );
		System.out.println("Thread Name	:	"+name);
		int priority = thread.getPriority();
		System.out.println("Thread Priority	:	"+priority);
		ThreadGroup group = thread.getThreadGroup();
		System.out.println("Thread Group	:	"+group.getName());
		State state = thread.getState();
		System.out.println("Thread State	:	"+state.name());
		boolean type = thread.isDaemon();
		System.out.println("Thread Type	:	"+( type ? "Daemon Thread" :  "User Thread"));
		boolean status = thread.isAlive();
		System.out.println("Thread Status	:	"+( status ? "Alive" :  "Dead"));	
	}
}
public class Program 
{
	public static void main(String[] args) 
	{
		try 
		{
			for( int count = 1; count <= 10; ++ count )
			{
				System.out.println(count);
				Thread.sleep(250);
			}
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	public static void main3(String[] args) 
	{
		Test t = new Test();
		t.print();
		t = null;
		System.gc();
	}
	public static void main2(String[] args) 
	{
		Thread thread = Thread.currentThread();
		
		String name = thread.getName( );
		System.out.println("Thread Name	:	"+name);
		int priority = thread.getPriority();
		System.out.println("Thread Priority	:	"+priority);
		ThreadGroup group = thread.getThreadGroup();
		System.out.println("Thread Group	:	"+group.getName());
		State state = thread.getState();
		System.out.println("Thread State	:	"+state.name());
		boolean type = thread.isDaemon();
		System.out.println("Thread Type	:	"+( type ? "Daemon Thread" :  "User Thread"));
		boolean status = thread.isAlive();
		System.out.println("Thread Status	:	"+( status ? "Alive" :  "Dead"));
	}
	public static void main1(String[] args) 
	{
		Thread thread = Thread.currentThread();
		System.out.println(thread.toString());
		//Thread[main,5,main] //thread's name, priority, and thread group.
	}
}
