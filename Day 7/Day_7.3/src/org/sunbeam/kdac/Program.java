package org.sunbeam.kdac;

class Pair<K, V>
{
	private K key;
	private V value;
	public Pair() 
	{	}
	public Pair(K key, V value) 
	{
		this.key = key;
		this.value = value;
	}
	public K getKey() 
	{
		return key;
	}
	public V getValue() 
	{
		return value;
	}
}
public class Program
{
	public static void main(String[] args) 
	{
		Pair<Integer, String> p = new Pair<>( 1, "DAC" );
		Integer key = p.getKey();
		String value = p.getValue();
		System.out.println(key+"	"+value);
	}
}
