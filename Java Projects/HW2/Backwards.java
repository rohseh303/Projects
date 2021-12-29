import java.util.Scanner;

public class Backwards
{
    public static void main(String args[])
    {
        //System.out.println("Enter something:");
        //Scanner x = new Scanner(System.in);
        String str = "John Holcomb";
        int length = str.length();
        
        for (int i = length; i >= 1; i--)
        {
            System.out.println(str.substring(i - 1, i));
        }
    }
}