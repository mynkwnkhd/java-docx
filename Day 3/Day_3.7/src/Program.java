class Singleton
{
    private Singleton( )
    {
        System.out.println("Inside constructor");
    }
    private static Singleton instance;
    public static Singleton getInstance( )
    {
        if( Singleton.instance == null )
            Singleton.instance = new Singleton();
        return Singleton.instance;
    }
}
class Program
{
    public static void main(String[] args) 
    {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
    }
}
