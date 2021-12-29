public class E71
{
    public static void main(String args[])
    {
        int[] list = new int[10];
        for (int j = 0; j < list.length; j++)
        {
            list[j] = (int) (Math.random() * 100);
        }
        
        String str = "";
        
        for (int i = 0; i < list.length; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(list[i]);
                System.out.print(" ");
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] % 2 == 0)
            {
                System.out.print(list[i]);
                System.out.print(" ");
            }
        }
        
        System.out.println("");
        
        for (int i = 9; i >= 0; i--)
        {
            System.out.print(list[i]);
            System.out.print(" ");
        }
        
        System.out.println("");

        int i = list.length - 1;
        System.out.print(Integer.toString(list[0]) + " and " + Integer.toString(list[i]));
    }
}