class Test
{
    private int num1;
    private int num2;
    private static int num3;
    static  //Static Initializer block
    {
        Test.num3 = 0;
    }
    public Test( )
    {   
        this.num1 = 0;
        this.num2 = 0;
    }
    public void setNum1( int num1 )
    {
        this.num1 = num1;
    }
    public void setNum2( int num2 )
    {
        this.num2 = num2;
    }
    public static void setNum3( int num3 )
    {
        Test.num3 = num3;
    }
    public void printRecord( )
    {
        System.out.println("Num1    :   "+num1);
        System.out.println("Num2    :   "+num2);
        System.out.println("Num3    :   "+num3);
    }
}
class Program
{
    private int num1 = 10; //Instance variable
    private static int num2 = 20; //Class level variable
    public static void main(String[] args) 
    {
        //System.out.println("Num1    :   "+num1);//Error
        Program p = new Program();
        System.out.println("Num1    :   "+p.num1);//10
        System.out.println("Num2    :   "+num2);//20
    }
    public static void main1(String[] args) 
    {
        Test.setNum3(500);
        Test t1 = new Test( );
        t1.setNum1(10);
        t1.setNum2(20);
        t1.printRecord();

        Test t2 = new Test( );
        t2.setNum1(30);
        t2.setNum2(40);
        t2.printRecord();

        Test t3 = new Test( );
        t3.setNum1(50);
        t3.setNum2(60);
        t3.printRecord();
    }
}
