import java.util.Scanner;

public class E513
{
    public static void main(String args[])
    {
        int BPFaren = 212;
        int MPFaren = 32;
        int BPCel = 100;
        int MPCel = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What's the temperature? Enter like 2C or 70F: ");
        String x = input.nextLine();
        
        System.out.println("Whats the altitude (Enter in meters, no decimals): ");
        int y = input.nextInt();
        
        int degreeChange = y/300;
        BPFaren = 212 - degreeChange;
        BPCel = 100 - degreeChange;
        
        int temp = Integer.valueOf(x.substring(0,x.length() - 1));
        String CorF = x.substring(x.length() - 1,x.length());
        if (CorF.equals("C"))
        {
            if (temp <= MPCel)
            {
                System.out.println("The water is a solid");
            }
            else if (temp < BPCel)
            {
                System.out.println("The water is a liquid");
            }
            else if (temp >= BPCel)
            {
                System.out.println("The water is a gas");
            }
        }
        else if (CorF.equals("F"))
        {
            if (temp <= MPFaren)
            {
                System.out.println("The water is a solid");
            }
            else if (temp < BPFaren)
            {
                System.out.println("The water is a liquid");
            }
            else if (temp >= BPFaren)
            {
                System.out.println("The water is a gas");
            }
        }
        else
        {
            System.out.println("An error occurred. Please check if you entered a number and provided a valid unit for the altiotude.");
        }
    }
}
