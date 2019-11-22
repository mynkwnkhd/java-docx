import java.io.Console;

class Program
{
    public static void main(String[] args) 
    {
        Console console = System.console();
        System.out.print("Name  :   ");
        String name = console.readLine();
        System.out.print("Empid  :   ");
        int empid = Integer.parseInt(console.readLine());
        System.out.print("Salary  :   ");
        float salary = Float.parseFloat( console.readLine());
        System.out.printf("%-15s%-5d%-10.2f\n",name, empid, salary);
    }
}