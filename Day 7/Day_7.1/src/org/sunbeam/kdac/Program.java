package org.sunbeam.kdac;

import java.text.SimpleDateFormat;
import java.util.Date;

class Box
{
	private Object object;
	public Object getObject() 
	{
		return this.object;
	}
	public void setObject(Object object) 
	{
		this.object = object;
	}
}
public class Program
{
	public static void main(String[] args) 
	{
		Box b4 = new Box();
		b4.setObject( new Date() );
		String str =  (String) b4.getObject(); //ClassCastException
	}
	public static void main3(String[] args) 
	{
		Box b3 = new Box();
		b3.setObject(10);	//b3.setObject( Integer.valueOf(10) );
		
		/*Object object = b3.getObject();
		Integer i1 = (Integer) object;
		System.out.println(i1.intValue()); */
		
		Integer i1 =  (Integer) b3.getObject();
		System.out.println(i1.intValue());
	}
	public static String getString( Date date )
	{
		String pattern = "dd/MMMM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	public static void main2(String[] args) 
	{
		Box b2 = new Box();
		b2.setObject(new Date());
		
		/*Object object = b2.getObject();
		Date date = (Date) object;*/
		
		Date date = (Date) b2.getObject();
		String strDate = Program.getString(date);
		System.out.println(strDate);
	}
	public static void main1(String[] args) 
	{
		Box b1 = new Box();
	}
}
