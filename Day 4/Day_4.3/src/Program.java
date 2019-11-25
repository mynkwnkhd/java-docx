enum Day
{
    SUN( "SunDay", 1 ), MON("MonDay"), TUES( 3 );
    private String dayName;
    private int dayNumber;
    private Day( int dayNumber )
    {
        this.dayNumber = dayNumber;
    }
    private Day( String dayName)
    {
        this.dayName = dayName;
    }
    private Day( String dayName, int dayNumber )
    {
        this.dayName = dayName;
        this.dayNumber = dayNumber;
    }
    public String getDayName() 
    {
        return dayName;
    }
    public int getDayNumber() 
    {
        return dayNumber;
    }
    public String toString() 
    {
        return String.format("%-15s%-5d",this.dayName, this.dayNumber);
    }
}
class Program   //Program.class
{
    public static void main(String[] args) 
    {
        for( int index = 0; index < days.length; ++ index )
        {
            Day[] days = Day.values();    
            {
                System.out.printf("%-10s%-5d%-10s%-5d\n",days[ index ].name(),days[ index ].ordinal(),days[ index ].getDayName(),days[ index ].getDayNumber());
            }
        }
    }
    public static void main1(String[] args) 
    {
        Day day = Day.SUN; 
        System.out.println("Name    :   "+day.name());
        System.out.println("Ordinal :   "+day.ordinal());
        System.out.println("Day Name    :   "+day.getDayName());   
        System.out.println("Day Number    :   "+day.getDayNumber());
    }
}