import java.util.Scanner;

public class dayTime
{
    public static void main(String[] args)
    {
int i = 0;
String stars = "*****";
String stripes = "=====";
while (i < 10)
{
        if (i% 2 ==0)
        {
            System.out.println(stars);
        }
        else
        {
            System.out.println(stripes);
        }
    }
    }
}