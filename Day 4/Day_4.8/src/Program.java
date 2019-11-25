import static java.lang.System.out;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
class Program
{
    public static void main(String[] args) 
    {
        float radius = 10;
        //float area = ( float )( 3.14 * radius * radius );
        //float area = ( float )( Math.PI * Math.pow(radius, 2) );
        float area = ( float )( PI * pow(radius, 2) );
        //System.out.println("Area    :   "+area);
        out.println("Area    :   "+area);
    }
}