
class Test
{
    private static int count;
    public static void print( )
    {
        ++ count;
        System.out.println("Count   :   "+count);
    }
}
class Program
{
    public static void main(String[] args) 
    {
        Test.print();   //1
        Test.print();   //2
        Test.print();   //3
    }
}