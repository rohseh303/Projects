
/**
 * Write a description of class PayCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayCheck
{
    // instance variables - replace the example below with your own
    private String employeeName;
    private double hourlyWage = 0;
    private double hoursWorked = 0;

    public PayCheck(String name, double wage)
    {
        employeeName = name;
        hoursWorked = wage;
    }

    public double addHours(int extraHours)
    {
        hoursWorked = extraHours + hoursWorked;
        return hoursWorked;
    }
    
    public double raisePay(double dollar)
    {
        hourlyWage = dollar + hourlyWage;
        return hourlyWage;
    }
    
    public double calcWeekPay()
    {
        double moneyReceived = hoursWorked * hourlyWage;
        System.out.print("You earned " + moneyReceived + " dollars this week.");
        return hoursWorked;
    }
    
    public String toString()
    {
        System.out.print(employeeName + " worked for " + hoursWorked + " hours at $" + hourlyWage + " per hour.");
        return employeeName;
    }
}
