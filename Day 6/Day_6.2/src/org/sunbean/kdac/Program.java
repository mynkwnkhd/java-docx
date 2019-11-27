package org.sunbean.kdac;
abstract class A
{
	public abstract void f1( );
	public final void f2( )
	{
		System.out.println("A.f2");
	}
	public void f3( )
	{
		System.out.println("A.f3");
	}
}
class B extends A
{
	@Override
	public void f1() 
	{
		System.out.println("B.f1");
	}
	@Override
	public  final void f3() 
	{
		System.out.println("B.f3");
	}
}
final class C extends B
{
	@Override
	public final void f1() 
	{
		System.out.println("C.f1");
	}
}
public class Program 
{
	public static void main(String[] args) 
	{
		C c = new C();
		c.f1();
		c.f2();
		c.f3();
	}
}
