import java.util.Scanner;

public class Forwards
{
    public static void main(String args[])
    {
        //System.out.println("Enter something:");
        //Scanner x = new Scanner(System.in);
        int num = 35789;
        String str = Integer.toString(num);
        int length = str.length();
        
        for (int i = 0; i <= length - 1; i++)
        {
            System.out.println(str.substring(i, i + 1));
        }
    }
}