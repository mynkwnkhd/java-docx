package org.sunbeam.kdac;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest 
{
	private Map<Account, Customer> map;
	public void setMap(Map<Account, Customer> map) 
	{
		this.map = map;
	}
	public void addEntry(Account[] keys, Customer[] values) 
	{
		if( map != null && keys != null && values != null )
		{
			for( int index = 0; index <keys.length; ++ index )
				map.put(keys[ index ], values[ index ] );
		}
	}
	public Customer findEntry(int accNumber )
	{
		if( map != null )
		{
			Account key = new Account( );
			key.setNumber(accNumber);
			if( map.containsKey(key))
				return map.get(key);
		}
		return null;
	}
	public boolean removeEntry(int accNumber )
	{
		if( map != null )
		{
			Account key = new Account( );
			key.setNumber(accNumber);
			if( map.containsKey(key))
			{
				map.remove(key);
				return true;
			}
		}
		return false;
	}
	public void printEntries()
	{
		if( map != null )
		{
			Set<Entry<Account, Customer>> entries = map.entrySet();
			for (Entry<Account, Customer> entry : entries) 
			{
				System.out.println(entry.getKey().toString()+" "+entry.getValue().toString());
			}
		}
	}
}
