import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.text.DateFormat;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates
{
    public static void main(String[] args)
    {
        
        
        class timerListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
              Date now = new Date();
              System.out.println(now);
            }
        }
        
        ActionListener listener = new timerListener();
        Timer t = new Timer(1000, listener);
        t.start();
    }
}