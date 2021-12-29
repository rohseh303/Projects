import java.util.Scanner;

/**
 * Write a description of class E520 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class E520
{
    public static void main(String args[])
    {
        while (0 < 1)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please give your three numbers");
            
            float x = scanner.nextFloat();
            float y = scanner.nextFloat();
            float z = scanner.nextFloat();
            
            if (x >= y)
            {
                if (x >= z)
                {
                    System.out.println("The largest number is " + x);
                }
                else if (z >= x)
                {
                    System.out.println("The largest number is " + z);
                }
            }
            else if (y >= z)
                if (y >= x)
                {
                    System.out.println("The largest number is " + y);
                }
                else
                {
                    System.out.println("The largest number is " + x);
                }
            else 
            {
                System.out.println("The largest number is " + z);
            }
        }
    }
}
