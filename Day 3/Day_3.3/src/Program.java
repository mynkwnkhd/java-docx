class Program
{
    public static void main(String[] args) 
    {
        Integer n1 = new Integer("125");
        int n2 = n1; //Auto UnBoxing
        //int n2 = n1.intValue(); //UnBoxing
        System.out.println(n2);    
    }
    public static void main6(String[] args) 
    {
        Integer n1 = new Integer("125");
        int n2 = n1.intValue(); //UnBoxing
        System.out.println(n2);    
    }
    public static void main5(String[] args) 
    {
        String str = "125";    
        int number = Integer.parseInt(str);//UnBoxing
        System.out.println(number);
    }
    public static void main4(String[] args) 
    {
        int number = 125;
        Object obj = number;
        System.out.println(obj);    
    }
    public static void main3(String[] args) 
    {
        int number = 125;
        String strNumber =  String.valueOf(number);    
        System.out.println(strNumber);
    }
    public static void main2(String[] args) 
    {
        int number = 125;    
        Integer n1 = Integer.valueOf(number);
        System.out.println(n1);
    }
    public static void main1(String[] args) 
    {
        Date joinDate = new Date(26,12,2006);    

        Employee emp1 = new Employee("Sandeep",33,45000,joinDate);

        Employee emp2 = new Employee("Sandeep",33,45000,26,12,2006);
    }
}