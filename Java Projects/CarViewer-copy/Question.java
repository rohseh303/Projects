public class Question
{
    private String text;
    private String answer;

    public Question()
    {
        
    }


    public void setText(String input)
    {
        text = input;
    }
    
    public String getText()
    {
        return text;
    }
    
    public void setAnswer(String ans)
    {
        answer = ans;
    }
    
    public boolean checkAnswer(String guess)
    {
        if (guess.equals(answer))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void display()
    {
        System.out.print(text);
    }
}
