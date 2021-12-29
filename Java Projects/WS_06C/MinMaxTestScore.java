import java.util.Scanner;

public class MinMaxTestScore
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a test score: ");
        int curVal = in.nextInt();
        int count = 0;
        int minVal = curVal;
        int maxVal = curVal;
        while (count >= 0)
        {
            System.out.print("Enter another number: ");
            if (in.hasNextInt())
            {
                curVal = in.nextInt();
                if (curVal < minVal)
                {
                    minVal = curVal;
                }
                if (curVal > maxVal)
                {
                    maxVal = curVal;
                }
                count++;
                System.out.println("Min: "+ minVal);
                System.out.println("Max: " + maxVal);
            }
            else
            {
                String wordInput = in.next();
                if (wordInput.equals("Q"))
                {
                    System.out.println("Bye");
                }
            }
        }
    }
}