import java.util.Scanner;
import java.util.ArrayList;

/**
   This program shows a simple quiz with two question types.
*/
public class QuestionDemo1
{
   public static void main(String[] args)
   {
     
      ChoiceQuestion q2 = new ChoiceQuestion();
      q2.setText("Who was the inventor of Java?");
      q2.setAnswer("James Gosling"); 
      q2.addChoice("Lebron James");
      q2.addChoice("James Gosling");
      q2.addChoice("Antonio Brown");
      q2.addChoice("Hasan Minhaj");
      
      
      presentQuestion(q2);
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(ChoiceQuestion q)
   {
      //System.out.println();
      //displays question
      q.display();
      String str = q.displayOptions();
      System.out.println(str);
      //ChoiceQuestion q3 = new ChoiceQuestion();
      //q3.addChoice("Lebron James");
      //q3.addChoice("Antonio Brown");
   
      
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      if (q.checkAnswer(response)) {
          System.out.println("Good job!");
        }
        else {
            System.out.println("Incorrect");
        }
   }
}

