
import java.util.ArrayList;
public class A
{
    public static void main(String arafa[])
    {
ArrayList<Integer> num = new ArrayList<Integer>();
num.add(1);
num.add(2);
num.add(1);
int count = 0;
for (int i = 0; i < num.size(); i++)
{
   if (num.get(i) % 2 == 0)
   {
      count++;
   }
}
System.out.println(count);
    }
   public static void myPrint(int n) 
{
   if (n < 10)
   {
      System.out.print(n);
   }
   else 
   {
      int m = n % 10;
      System.out.print(m);
      myPrint(n / 10);
   }
}
}