import java.util.Scanner;

/**
 * Write a description of class E620 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class E620
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is today's price for one dollar in Japanese yen?");
        
        double x = scanner.nextDouble();
        
        double yen;
        for (int i = 0; i < 1000; i = i + 10)
        {
            yen = i * x;
            System.out.println(i + " dollars is equal to " + yen + " Japanese Yen.");
        }
    }
}
