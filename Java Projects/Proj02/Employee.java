
/**
 * Write a description of class WS_03C here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    // instance variables - replace the example below with your own
    private String name;
    private double salary;

    /**
     * Constructor for objects of class WS_03C
     */
    public Employee(String employeeName, double currentSalary)
    {
        // initialise instance variables
        name = employeeName;
        salary = currentSalary;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
        // put your code here
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void raiseSalary(double byPercent)
    {
        salary = salary*(1+(byPercent/100));
    }
}
