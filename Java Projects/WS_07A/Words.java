import java.util.Arrays;

public class Words
{
   /**
      Returns the nth short word (length <= 3) in an array.
      @param words an array of strings
      @param n an integer > 0
      @return the nth short word in words, or the empty string if there is
      no such word
   */
   
   public String nthShortWord(String[] words, int n)
   {
      String[] shortArray = new String[10];
      String[] secondArray = new String[10];
       String[] oneArray = new String[10];
        String[] zeroArray = new String[10];
      for (int i = 0; i < words.length; i++ )
      {
         if (words[i].length() <= 3)
         {
            shortArray[i] = words[i];
            // if (words[i].length() == 3)
            // {
            //    String[] thirdArray = words[i];
            // }
            if (words[i].length() == 2)
            {
               secondArray[i] = words[i];
            }
            if (words[i].length() == 1)
            {
               oneArray[i] = words[i];
            }
            if (words[i].length() == 0)
            {
               zeroArray[i] = words[i];
            }
         }
         }
   if (n == 3)
         {
            for (int i = 0; i < shortArray.length; i++ )
               return shortArray[i];
         }
         else if (n == 2)
         {
            for (int i = 0; i < secondArray.length; i++ )
               return secondArray[i];
         }
         else if (n == 1)
         {
            for (int i = 0; i < oneArray.length; i++ )
               return oneArray[i];
         }
         else
         {
               return zeroArray[0];
      }
return zeroArray[0];
   }
   
}