package org.sunbeam.kdac;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2) 
	{
		return (int) (emp1.getSalary() - emp2.getSalary());
	}
}