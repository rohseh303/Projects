import java.util.Arrays;
import java.util.Random;

public class E715
{
    public static void main(String[] args)
        {
        Random random = new Random();
        int[] array = new int[20];
        
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(100);
        }
        
        System.out.println("Before Sorting");
        printSequence(array);
        Arrays.sort(array);
        System.out.println("After Sorting");
        printSequence(array);
        
        }
        
    public static void printSequence(int[] array)
    {
        
        for(int i : array)
            System.out.printf("%d ",i);
            System.out.println();
    }
}
