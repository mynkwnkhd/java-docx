class Complex
{
    private int real;
    private int imag;
    public Complex( int real, int imag )
    {
        this.real = real;
        this.imag = imag;
    }
    public void setReal(int real) 
    {
        this.real = real;
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
    public static void main(String[] args) 
    {
        final Complex c1 = new Complex(10, 20);
        c1.setReal(100);
        c1.setImag(200);
        //c1 = new Complex( 50, 60 ); //Not OK
        c1.printRecord();
    }
}
