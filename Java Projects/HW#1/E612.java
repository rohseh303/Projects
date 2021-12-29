import java.util.Scanner;

public class E612
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter something:");
        
        String str = x.nextLine();
        int length = str.length();
        
        for (int i = 0; i < length; i++)
        {
            System.out.println(str.substring(0, i + 1));
        }
        
        for (int i = 0; i < length - 1; i++)
        {
            System.out.println(str.substring(i, i + 2));
        }
        
        System.out.println(str);
    }
}