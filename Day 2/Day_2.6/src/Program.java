import java.io.Console;
class Complex
{
	private int real;
	private int imag;
	public void acceptRecord( )
	{
		Console console = System.console();
		System.out.print("Real Number	:	");
		this.real = Integer.parseInt( console.readLine());
		System.out.print("Imag Number	:	");
		this.imag = Integer.parseInt( console.readLine());
	}
	public void printRecord( )
	{
		System.out.println("Real Number	:	"+this.real);
		System.out.println("Imag Number	:	"+this.imag);
	}
}
class Program
{
	public static void main( String[] args )
	{
		Complex c1 = new Complex( );
		c1.acceptRecord( ); //Message Passing
		c1.printRecord( ); //Message Passing
	}
}
