package org.sunbeam.kdac;

@SuppressWarnings("serial")
public class StackUnderflowException extends Exception 
{
	public StackUnderflowException(String message)
	{
		super(message);
	}
}
