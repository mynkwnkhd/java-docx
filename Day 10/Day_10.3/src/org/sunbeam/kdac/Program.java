package org.sunbeam.kdac;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

class Convert
{
	public static Object changeType( String strNumber, String parameterType )
	{
		switch( parameterType)
		{
		case "int":
			return Integer.parseInt(strNumber);
		case "float":
			return Float.parseFloat(strNumber);
		case "double":
			return Double.parseDouble(strNumber);
		}
		return null;
	}
}
public class Program
{
	public static void main(String[] args) 
	{
		try( Scanner sc = new Scanner(System.in))
		{
			System.out.print("F.Q.Class Name : ");
			String className = sc.nextLine(); //math.Calculator
			Class<?> c = Class.forName(className);
			
			System.out.print("Method Name : ");
			String methodName = sc.nextLine();
			
			Method[] methods = c.getMethods();
			for (Method method : methods) 
			{
				if( method.getName().equalsIgnoreCase(methodName ) )
				{
					Parameter[] parameters = method.getParameters();
					
					Object[] arr = new Object[ method.getParameterCount() ];
					for( int index = 0; index < method.getParameterCount(); ++ index )
					{
						String parameterType = parameters[ index ].getType().getName();
						System.out.print(parameterType+" value : ");
						String strNumber = sc.nextLine();
						arr[ index ] = Convert.changeType(strNumber, parameterType);
					}
					
					Object obj = c.newInstance();
					Object result = method.invoke(obj, arr );
					System.out.println("Result	:	"+result);
					break;
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
