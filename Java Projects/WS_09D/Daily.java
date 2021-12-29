import java.util.ArrayList;

/**
 * Write a description of class Daily here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Daily extends Appointment
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Daily
     */
    public Daily()
    {
        super();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void occursOn(int m, int d, int y)
    {
          System.out.println("Daily appointment exists for " + getDescription());
    }
}
