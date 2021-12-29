import java.util.ArrayList;
import java.util.Scanner;

class PresentQuiz {
    public static void presentQuestion(ArrayList<Question> nameOfList)
        {
          //setting up for presenting the list
          ArrayList<Question> list = new ArrayList<Question>();
          list = nameOfList;
          int length = list.size();
          
          for (int i = 0; i < length; i++)
          {
            Question questionObjectAtPoint = nameOfList.get(i);
            questionObjectAtPoint.display();
            
            System.out.print("Your answer: ");
            Scanner in = new Scanner(System.in);
            String response = in.nextLine();
              if (questionObjectAtPoint.checkAnswer(response)) {
                  System.out.println("Good job!");
              }
              else {
                    System.out.println("Incorrect");
              }
                
          }
        }
      public static void main(String[] args) {

              //creating questions
              Question one = new Question();
              one.setText("Who is the president of the United States?");
              one.setAnswer("Donald Trump");
              
              Question two = new Question();
              two.setText("Who was the MVP of the NBA last year?");
              two.setAnswer("Giannis Antetekoumpo");
              
              Question three = new Question();
              three.setText("What sport has a different name in the US?");
              three.setAnswer("Football");
              
              Question four = new Question();
              four.setText("5 times 7 equals:");
              four.setAnswer("35");
              
              Question five = new Question();
              five.setText("What is the derivative of sine?");
              five.setAnswer("cosine");
              
              //adding question to list
              ArrayList<Question> list = new ArrayList<Question>();
              list.add(one);
              list.add(two);
              list.add(three);
              list.add(four);
              list.add(five);
              
              //output
              presentQuestion(list);
      }
      
      
}