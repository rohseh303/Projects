import java.util.Scanner;

public class E514
{
    public static void method(int time1, int time2)
    {
        if (Math.floor(time1/100) < Math.floor(time2/100))
        {
            System.out.println("The time that comes first is: " + time1);
        } 
        else if (Math.floor(time1/100) > Math.floor(time2/100))
        {
            System.out.println("The time that comes first is: " + time2);
        } 
        else 
        {
            if (time1 - Math.floor(time1/100) * 100 < time2 - Math.floor(time2/100) * 100)
            {
            System.out.println("The time that comes first is: " + time1);
            }
            else if(time1 - Math.floor(time1/100) * 100 > time2 - Math.floor(time2/100) * 100)
            {
                    System.out.println("The time that comes first is: " + time2);
            } else
                     System.out.println("The times are equal.");
    }
  }
  
  public static void main(String args[])
  {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Please enter the first time: ");
      int one = scanner.nextInt();
      
      System.out.print("Please enter the second time: ");
      int two = scanner.nextInt();
      
      method(one, two);
  }
}