import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonViewer2
{
    private static final int FRAME_WIDTH =100;
    private static final int FRAME_HEIGHT = 60;
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton buttonA = new JButton("Click A!");
        frame.add(buttonA);
        JButton buttonB = new JButton("Click B!");
        frame.add(buttonB);
        
        JPanel panel = new JPanel();
        panel.add(buttonA);
        panel.add(buttonB);
        frame.add(panel);
        
        class ClickListenerA implements ActionListener
        {
           public void actionPerformed(ActionEvent event)
            {
                System.out.println("Button A" +" was clicked!");
            }
        }
        
        class ClickListenerB implements ActionListener
        {
           public void actionPerformed(ActionEvent event)
            {
                System.out.println("Button B" +" was clicked!");
            }
        }
        
        ActionListener listenerA = new ClickListenerA();
        buttonA.addActionListener(listenerA);
        
        ActionListener listenerB = new ClickListenerB();
        buttonB.addActionListener(listenerB);
        
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}