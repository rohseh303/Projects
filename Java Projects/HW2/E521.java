import java.util.Scanner;

public class E521
{
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter three words: ");
      
      String x = scanner.nextLine();
      String y = scanner.nextLine();
      String z = scanner.nextLine();
      String[] words = { x, y, z };
      
      int n = 3;
      for(int i = 0; i < n-1; ++i) 
      {
         for (int j = i + 1; j < n; ++j) {
            if (words[i].compareTo(words[j]) > 0) {
               String temporary = words[i];
               words[i] = words[j];
               words[j] = temporary;
            }
         }
      }
      
      System.out.println("The lexicographical order of the words is: ");
      for(int i = 0; i < n; i++) {
         System.out.println(words[i]);
      }
   }
}
 