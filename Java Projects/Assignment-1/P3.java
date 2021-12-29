public class P3
{
    public static void main(String[] args)
    {
        int digits = 0;
        double bottomNum = 3;
        double initial = 1;
        
        while (digits < 6)
        {
            
           if ((digits + 1) % 2 == 1)
           {
               initial = initial - (1/bottomNum);   
           }
           else
           {
               initial = initial + (1/bottomNum);
           }
            
           bottomNum += 2;
           digits++;
        }
        
        System.out.print(initial);
    }
}