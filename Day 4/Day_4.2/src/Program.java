import java.io.Console;

enum Color  //Color.class
{
    RED, GREEN, BLUE
}
class Program   //Program.class
{
    public static void main1(String[] args) 
    {
        String name = Color.RED.name();
        int ordinal = Color.RED.ordinal();
        System.out.printf("%-15s%-5d\n", name, ordinal);
    }
    public static void main2(String[] args) 
    {
        //Color color = Color.RED; 
        //Color color = Color.GREEN; 
        Color color = Color.BLUE; 
        String name = color.name();
        int ordinal = color.ordinal();
        System.out.printf("%-15s%-5d\n", name, ordinal);
    }
    public static void main3(String[] args) 
    {
        Color[] colors = Color.values();
        for( int index = 0; index < colors.length; ++ index )
        {
            String name = colors[ index ].name();
            int ordinal = colors[ index ].ordinal();
            System.out.printf("%-15s%-5d\n", name, ordinal);
        }
    }
    public static void main(String[] args) 
    {
        Console console = System.console();

        System.out.print("Enter string    :   "); 
        String str = console.readLine();
        
        Color color = Color.valueOf(str.toUpperCase());
        String name = color.name();
        int ordinal = color.ordinal();

        System.out.printf("%-15s%-5d\n", name, ordinal);
    }
}