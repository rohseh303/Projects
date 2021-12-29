import java.util.Scanner;

public class E518
{
    public static void main(String[] args)
    {
        double tax = 0;
        double incomeAmountOver;
        
        
        while (0 < 1)
        {
            System.out.print("Enter your income: ");
            Scanner x = new Scanner(System.in);
            int income = x.nextInt();
        
            
            if (income <= 50000)
            {
                tax = income*0.01;
            }
            
            else if (income <= 75000)
            {
                incomeAmountOver = 75000 - income;
                tax = incomeAmountOver*0.02 + 500;
            }
            
            else if (income <= 100000)
            {
                incomeAmountOver = 100000 - income;
                tax = incomeAmountOver*0.03 + 500 + (25000*0.02);
            }
            
            else if (income <= 250000)
            {
                incomeAmountOver = 250000 - income;
                tax = incomeAmountOver*0.04 + 500 + (25000*0.02) + (25000*0.03);
            }
            
            else if (income <= 500000)
            {
                incomeAmountOver = 500000 - income;
                tax = incomeAmountOver*0.05 + 500 + (25000*0.02) + (25000*0.03) + (150000*0.04);
            }
            
            else if (income > 500000)
            {
                incomeAmountOver = income - 500000;
                tax = incomeAmountOver*0.05 + 500 + (25000*0.02) + (25000*0.03) + (150000*0.04) + (250000*0.05);
            }
            
            System.out.println("Your income tax is "+ tax +" dollars.");
        }
    }
}