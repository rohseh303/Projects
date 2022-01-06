import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.lang.Math;
/**
   This program demonstrates how to install an action listener.
*/
public class Main
{  
   // Decide the dimension of the window
   private static final int FRAME_WIDTH = 640;
   private static final int FRAME_HEIGHT = 480;

   public static void main(String[] args)
   {
      // Prepare the window
       JFrame frame = new JFrame();
      
      // Prepare the button & add it to the window
      JButton button = new JButton("Add Interest");
      frame.add(button);
      JLabel balLabel = new JLabel("Bank Account");
      frame.add(balLabel);
      JPanel panel = new JPanel();
      panel.add(button);
      panel.add(balLabel);
      frame.add(panel);
      BankAccount bankacct = new BankAccount(10000);
      // Prepare the response for when the user clicks the button // must write final for Java version 7 & before
      class ClickListener implements ActionListener { // this is an inner class, i.e., inside main method
          public void actionPerformed(ActionEvent event) { // override this method to respond
              bankacct.addInterest(0.01);
              balLabel.setText("Bank Account Updated: "+Math.round(bankacct.getBalance() * 100.0) / 100.0);
            }
        }
      // Link the listener to the button
      ActionListener listener = new ClickListener();
      button.addActionListener(listener);
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
