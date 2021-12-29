import java.util.ArrayList;
/**
 * Write a description of class ChoiceQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChoiceQuestion extends Question
{
    // private String text;
    // private String answer;
  private ArrayList<String> options;// = new ArrayList<String>();
  
    public ChoiceQuestion()
    {
      super();
      options = new ArrayList<String>();
    }

    public void addChoice(String option){
      options.add(option);
    }

    public String displayOptions()
    {
      int i = 0;
      String stringI = "";
      String answers = "";
      while (i < options.size()){
        stringI = Integer.toString(i+1);
        //answers.concat(stringI+options.get(i) + "/n");
        answers += stringI + ".";
        answers += " ";
        answers += options.get(i);
        answers += '\n';
        i++;
      }
      return answers;
    }
}
