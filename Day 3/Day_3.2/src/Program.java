import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

class Program
{
    public static void main(String[] args) 
    {
        System.out.println(new SimpleDateFormat("dd/MMMM/yyyy").format(new Date(119,10,23)));
    }
    public static void main4(String[] args) 
    {
        String pattern = "dd/MMMM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = new Date(119, 10, 23);    
        String strDate = sdf.format(date);
        System.out.println(strDate);
    }
    public static void main3(String[] args) 
    {
        Date date = new Date();
        int day = date.getDate();
        int month = date.getMonth() + 1;
        int year = date.getYear() + 1900;
        System.out.println(day+" / "+month+" / "+year);    
    }
    public static void main2(String[] args) 
    {
        Calendar c = Calendar.getInstance();  
        //int day = c.get( Calendar.DAY_OF_MONTH);
        int day = c.get( Calendar.DATE);
        int month = c.get( Calendar.MONTH ) + 1;
        int year = c.get( Calendar.YEAR );
        System.out.println(day+" / "+month+" / "+year);
    }
    public static void main1(String[] args) 
    {
        LocalDate ldt = LocalDate.now();
        int day = ldt.getDayOfMonth();
        int month = ldt.getMonthValue();
        int year = ldt.getYear();
        System.out.println(day+" / "+month+" / "+year);
    }
}