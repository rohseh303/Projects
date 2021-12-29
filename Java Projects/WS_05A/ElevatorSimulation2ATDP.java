import java.util.Scanner;

/**
   This program simulates an elevator panel that skips the 13th floor, checking for 
   input errors.
*/
public class ElevatorSimulation2ATDP
{
   public static void main(String[] args)
   {  
      int i = 1;
      while (i>0)
      {
      Scanner kBoard = new Scanner(System.in);
      System.out.print("Which floor do you want to go to? (1-20, except 13): ");
      if (kBoard.hasNextInt()) // i.e., user entered an integer 
      {
         int reqFloor = kBoard.nextInt();
         
         if (reqFloor < 13)
         {
             int actualFloor = reqFloor;
             System.out.println("The elevator will travel to the actual floor "+actualFloor);
         }
         
         else if (reqFloor == 13)
         {
             System.out.println("There is no thirteenth floor");
            }
         else if (reqFloor <= 20)
         {
             int actualFloor = reqFloor -1;
             System.out.println("The elevator will travel to the actual floor "+actualFloor);
            }
            
         else 
         {
             System.out.println("Oops! Please enter an integer from 1-20.");
      }
   }
   else // i.e., the user did not enter an integer
      {
          String reqFloor = kBoard.next();
          if (reqFloor.equals("Q"))
          {
          System.out.println("Bye");
        }
      }
    }
}
}
