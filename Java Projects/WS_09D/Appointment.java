import java.util.ArrayList;
import java.util.Scanner;

public abstract class Appointment
{
    // instance variables - replace the example below with your own
    private String description;
    
    
    /**
     * Constructor for objects of class P3
     */
    public Appointment()
    {
        description = "";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setDescription(String d)
    {
        // put your code here
        description = d;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public abstract void occursOn(int month, int day, int year);
    
    public String toString()
    {
        return description;
    }
}
