import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class P25
{
    public static void main(String[] args)
    {
        //Construct a frame and show it
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        Rectangle ract = new Rectangle(100, 100, 150, 300);
        frame.setVisible(false);
        frame.setBounds(ract);
        frame.setVisible(true);
        
        JOptionPane.showMessageDialog(frame, "Click OK to continue");
        
        frame.setVisible(false);
        ract.translate(100,100);
        frame.setBounds(ract);
        frame.setVisible(true);
    }
}
