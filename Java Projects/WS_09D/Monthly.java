import java.util.ArrayList;

/**
 * Write a description of class Daily here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monthly extends Appointment
{
    // instance variables - replace the example below with your own
    private int date;
    
    /**
     * Constructor for objects of class Daily
     */
    public Monthly(int d)
    {
        super();
        date = d;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void occursOn(int m, int d, int y)
    {
         if (date == d)
         {
             System.out.println("Monthly appointment exists for " + getDescription());
         }
    }
    
}
