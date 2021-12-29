
/**
 * Write a description of class Onetime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Onetime extends Appointment
{
    // instance variables - replace the example below with your own
    private int year;
    private int month;
    private int day;

    /**
     * Constructor for objects of class Onetime
     */
    public Onetime(int m, int d, int y)
    {
        super();
        month = m;
        day = d;
        year = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void occursOn(int m, int d, int y)
    {
        if (d == day && m == month && y == year)
        {
            System.out.println("Onetime appointment exists for " + getDescription());
        }
    }
}
