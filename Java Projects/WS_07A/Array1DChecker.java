import java.util.Arrays;

public class Array1DChecker
{
    public static void main(String[] args)
    {
        int[] scoreList = new int[12];
        int count = 1;
        int arrayVariable = (int)(Math.random()*90-20);
        scoreList[0] = arrayVariable;
        //loop to create the  random numbers
        for (int j = count; j <= 10; j++)
        {
            scoreList[j] = scoreList[j+1];
            int arrayVariableLooped = (int)(Math.random()*90-20);
            scoreList[j-1] = arrayVariableLooped;
        }
        int lastArrayVariable = (int)(Math.random()*90-20);
        scoreList[11] = arrayVariable;
        
        
        //to display 1st array
        int jCount = 0;
        for (int j = jCount; j <= 10; j++)
        {
            System.out.print(scoreList[j] + " ");
        }
        System.out.println(scoreList[11]);
        
        int firstNumberForSwap = scoreList[11];
        int secondNumberForSwap = scoreList[0];
        
        scoreList[11] = secondNumberForSwap;
        scoreList[0] = firstNumberForSwap;
        //to swap first and last #
        int anotherCount = 0;
        for (int j = anotherCount; j <= 10; j++)
        {
            System.out.print(scoreList[j] + " ");
        }
        System.out.println(scoreList[11]);
        
        //to find min
        int aCount = 0;
        int minVal = scoreList[0];
        for (int j = aCount; j <= 11; j++)
        {
                int currentVal = scoreList[j];
                if (currentVal < minVal)
                {
                    minVal = currentVal;
                }
        }
        System.out.println("Minimum value: " + minVal);
        
        //to find max
        int maxVal = scoreList[0];
                for (int j = aCount; j <= 11; j++)
        {
                int currentVal = scoreList[j];
                if (currentVal > maxVal)
                {
                    maxVal = currentVal;
                }
        }
        System.out.println("Maximum value: " + maxVal);
        
        //to find sum
        int mCount = 1;
        int sum = scoreList[0];
        double average = 0;
        for (int j = mCount; j <=10; j++)
        {
              sum += scoreList[j];
              average = sum/12;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        //int[] sortedVersion = new int[12];
        System.out.println("To String: " + Arrays.toString(scoreList));
        Arrays.sort(scoreList);
        System.out.println("Sorted List: " + Arrays.toString(scoreList));
        System.out.println("Binary Search: " + Arrays.binarySearch(scoreList, 40));
    }
}