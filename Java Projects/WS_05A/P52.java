import java.util.Scanner;

/**
 * Write a description of class P52 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P52
{
      public static void main(String[] args)
      {  
            Scanner in = new Scanner(System.in);
               
            System.out.print("Are you married? (Yes or No) - ");
            String answerToQuestion = in.next();
            double tax = 0.00;
    
                 if (answerToQuestion.equals("Yes"))
                       {   
                      System.out.print("What is your income? Give your income as an integer ");
                      int yearIncome = in.nextInt();
              
            
                           if (yearIncome > 64000)
                           {
                             tax = 8800 + 0.25*yearIncome;
                           }
                            
                           else if (yearIncome > 16000)
                           {
                             tax = 1600 + 0.15*yearIncome;
                           }
                        
                           else
                           {
                             tax = 0.1*yearIncome;
                           }
                   System.out.print("Your tax based on your income and marital status is " + tax);
                }
            
                else if (answerToQuestion.equals("No"))
                {
                   System.out.print("What is your income? Give your income as an integer: ");
                   int yearIncome = in.nextInt();
                
                         if (yearIncome > 32000)
                         {
                            tax = 4400 + 0.25*yearIncome;
                         }
                        
                         else if (yearIncome > 8000)
                         {
                            tax = 800 + 0.15*yearIncome;
                         }
                        
                         else
                         {
                            tax = 0.1*yearIncome;
                         }
                   
                     System.out.print("Your tax based on your income and marital status is " + tax);
                 }
            
                 else
                 {
                    System.out.print("Please enter \"Yes\" or \"No\"");
                 }
    
      } 
}
