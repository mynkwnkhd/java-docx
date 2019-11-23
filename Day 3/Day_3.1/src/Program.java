import java.io.Console;

class Complex
{
    private int real;
    private int imag;
    public Complex( )
    {
        this( 0, 0 );
    }
    public Complex( int real, int imag )
    {
        this.real = real;
        this.imag = imag;
    }
    public void acceptRecord( )
    {
        Console console = System.console();
        System.out.print("Real Number   :   ");
        this.real = Integer.parseInt(console.readLine());
        System.out.print("Imag Number   :   ");
        this.imag = Integer.parseInt(console.readLine());
    }
    public int getReal() 
    {
        return this.real;
    }
    public void setReal(int real) 
    {
        this.real = real;
    }
    public int getImag() 
    {
        return this.imag;
    }
    public void setImag(int imag) 
    {
        this.imag = imag;
    }
    public void printRecord( )
    {
        System.out.println("Real Number :   "+this.real);
        System.out.println("Imag Number :   "+this.imag);
    }
}
class Program
{
    static int number;
    static Complex c1;
    public static void main(String[] args) 
    {
        System.out.println("Number    :   "+number);
        System.out.println("C1    :   "+c1);
    }
    public static void main1(String[] args) 
    {
        Complex c1 = new Complex( );
        c1.acceptRecord( );
        c1.printRecord( );

        c1.setReal( 50 );
        c1.setImag( 60 );
        int real = c1.getReal( );
        System.out.println("Real Number :   "+real);
        int imag = c1.getImag( );
        System.out.println("Imag Number :   "+imag);
    }
}