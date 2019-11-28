package org.sunbeam.kdac;

interface A
{
	void f1( );
	void f2( );
	void f3( );
}
abstract class B implements A
{
	@Override
	public void f1() {	}
	@Override
	public void f2() {	}
	@Override
	public void f3() {	}
}
class C extends B
{
	@Override
	public void f2() 
	{
		System.out.println("C.f2");
	}
	
}
public class Program
{
	public static void main(String[] args) 
	{
		A a = new C();
		a.f2();
	}	
}
