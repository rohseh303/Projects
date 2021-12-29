import java.util.Scanner;

public class MinMaxAlgorithm
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int curVal = in.nextInt();
        int count = 0;
        int minVal = curVal;
        while (count >= 0)
        {
            System.out.print("Enter another number: ");
            curVal = in.nextInt();
            if (curVal < minVal)
            {
                minVal = curVal;
            }
            count++;
            System.out.println(minVal);
        }
    }
}