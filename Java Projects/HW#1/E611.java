import java.util.Scanner;
import java.util.ArrayList;

public class E611
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = in.nextLine();
        
        int count = 0;
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < str.length(); i++)
        {
            list.add(str.substring(i, i + 1));
        }
        
        for (String item: list)
        {
            if (item.equals("a") || item.equals("e") || item.equals("i") || item.equals("o") || item.equals("u") || item.equals("y"))
            {
                count++;
            }
            if (item.equals("A") || item.equals("E") || item.equals("I") || item.equals("O") || item.equals("U") || item.equals("Y"))
            {
                count++;
            }
        }
        
        System.out.println(count + " vowels");
    }
}
