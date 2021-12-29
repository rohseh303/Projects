import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener
{
   int i = 0;
   public void actionPerformed(ActionEvent event)
    {
        i++;
        System.out.println("I was clicked " + i + " times.");
    }
}