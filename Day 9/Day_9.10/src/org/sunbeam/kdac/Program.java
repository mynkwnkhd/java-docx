package org.sunbeam.kdac;
import java.util.Scanner;
import java.util.TreeMap;
public class Program 
{
	private static Scanner sc =  new Scanner(System.in);
	public static Account[] getKeys( )
	{
		Account[] arr = new Account[ 5 ];
		arr[ 0 ] = new Account(5124,"Saving",85000);
		arr[ 1 ] = new Account(2351,"Current",125000);
		arr[ 2 ] = new Account(8961,"Loan",2500000);
		arr[ 3 ] = new Account(3790,"Pention",45000);
		arr[ 4 ] = new Account(4268,"PPF",90000);
		return arr;
	}
	public static Customer[] getValues( )
	{
		Customer[] arr = new Customer[ 5 ];
		arr[ 0 ] = new Customer("Rajiv","Nagpur","rajiv@gmail.com");
		arr[ 1 ] = new Customer("Amit","Kolhapur","amit@gmail.com");
		arr[ 2 ] = new Customer("Yogesh","Nasik","yogesh@gmail.com");
		arr[ 3 ] = new Customer("Prashant","Karad","prashant@gmail.com");
		arr[ 4 ] = new Customer("Nitin","panchgani","nitin@gmail.com");
		return arr;
	}
	public static int menuList( )
	{
		System.out.println("0.Exit");
		System.out.println("1.Add Entry");
		System.out.println("2.Find Entry");
		System.out.println("3.Remove Entry");
		System.out.println("4.Print Entries");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void acceptRecord( int[] accNumber )
	{
		if( accNumber != null )
		{
			System.out.print("Enter account number	:	");
			accNumber[ 0 ] = sc.nextInt();
		}
	}
	private static void printRecord(Customer value) 
	{
		if( value != null )
			System.out.println(value.toString());
		else
			System.out.println("Account not found");
	}
	private static void printRecord(boolean removedStatus) 
	{
		if(removedStatus)
			System.out.println("Entry is removed");
		else
			System.out.println("Account not found");
	}
	public static void main(String[] args) 
	{
		int choice;
		int[] accNumber = new int[ 1 ];
		
		MapTest test = new MapTest();
		//test.setMap(new Hashtable<Account, Customer>());
		//test.setMap(new HashMap<Account, Customer>());
		//test.setMap(new LinkedHashMap<Account, Customer>());
		test.setMap(new TreeMap<Account, Customer>());
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			switch( choice )
			{
			case 1:
				Account[] keys = Program.getKeys();
				Customer[] values = Program.getValues();
				test.addEntry( keys, values );
				break;
			case 2:
				Program.acceptRecord(accNumber);
				Customer value = test.findEntry( accNumber[ 0 ] );
				Program.printRecord( value );
				break;
			case 3:
				Program.acceptRecord(accNumber);
				boolean removedStatus = test.removeEntry( accNumber[ 0 ] );
				Program.printRecord(removedStatus);
				break;
			case 4:
				test.printEntries( );
				break;
			}
		}
	}
}
