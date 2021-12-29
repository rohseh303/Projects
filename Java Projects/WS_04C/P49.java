import java.util.Scanner;

public class P49
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        
       System.out.print("Enter the amount due: ");
       double amountDue = in.nextDouble();
        
       System.out.print("Enter the amount recieved from customer: ");
       double amountReceived = in.nextDouble();
        
       double change = amountReceived - amountDue;
        // change = change * 100;
       int numberOfDollars = (int)(change / 1.00);
       double remainderOfChange = change % 1.00;
        
       int numberOfQuarters = (int)(remainderOfChange / 0.25);
       double remainderAfterQuarterChange = remainderOfChange % 0.25;
        
       int numberOfDimes = (int)(remainderAfterQuarterChange / 0.10);
       double remainderAfterDimeChange = remainderAfterQuarterChange % 0.10;
        
       int numberOfNickels = (int)(remainderAfterDimeChange / 0.05);
       double remainderAfterNickelChange = remainderAfterDimeChange % 0.05;
        
       int numberOfPennies = (int)(remainderAfterNickelChange);
       
       double x = 3.5;
       int m = (int)x;
       System.out.print(m);

        
       System.out.print("Return the customer: " + numberOfDollars + " dollars, " + numberOfQuarters + " quarters, " + numberOfDimes + " dimes, " + numberOfNickels + " nickels," + numberOfPennies + " pennies.");
    }
}