import java.util.Scanner;

public class E46
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input a number that is in meters: ");
        double heightInMeters = in.nextDouble();
        
        double heightInMiles = heightInMeters * (1 / 1609.34);
        double heightInFeet = heightInMeters * (3.28084 / 1);
        double heightInInches = heightInMeters * (39.3701 / 1);
        
        System.out.println("The number in miles is: " + heightInMiles);
        System.out.println("The number in feet is: " + heightInFeet);
        System.out.println("The number in inches is: " + heightInInches);
    }
}