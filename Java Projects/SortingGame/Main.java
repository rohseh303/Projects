import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.JTextArea;
/**
 * Main program
*/
public class Main
{
    /**
    * Main program
    */
    public static void main(String[] args)
        {
            //to display the game
            
            JFrame frame = new JFrame();
            frame.setPreferredSize(new Dimension(1200, 300));
            //create start button
            JButton startButton = new JButton("Press to Start");
            JPanel panel = new JPanel();
            panel.add(startButton);
            
            
            
            //position panels
            //JPanel panel1 = new JPanel();
            
            //panel1.add(startButton);
            
             int seconds = 0;
             int minutes = 0;
             JLabel label = new JLabel(minutes + ":" + seconds);
             //label.setBounds(350, 50, 50, 50);
             panel.add(label);
             
             //create the random lists
             display d = new display();
            
            class frameListener implements ActionListener
            {
                public void actionPerformed(ActionEvent event)
                {
                    frame.setVisible(false);
                    panel.add(label);
                    frame.setVisible(true);
                }
           }
           
            frameListener refresher = new frameListener();
            //Timer r = new Timer(10000, refresher);
             Stopwatch main2 = new Stopwatch();
            class TimeListener implements ActionListener
            {
                public void actionPerformed(ActionEvent event)
                {
                main2.changeTime();
                label.setText(new Integer(main2.getMinutes()) + ":" + new Integer(main2.getSeconds()));
                }
           }
           
            javax.swing.Timer t = new Timer(1000,new TimeListener());
            
            
            class StartButtonListener implements ActionListener
            {
                public void actionPerformed(ActionEvent event)
                {
                    //r.start();
                    //start timer
                    t.start();
                    JLabel you = new JLabel(d.createDisplay());
                    you.setSize(you.getPreferredSize());
                    you.setLocation(20, 210);
                    
                 
                    
                    panel.add(you);
                    panel.validate();
                    
                    //areas to enter sorting
                    //String area1;
                    //area1 = JOptionPane.showInputDialog("Enter similar items here");
                    //optionPane o = new optionPane();
                    //panel.add(o.getField1());
                }
            }
            
            //install listener object
            ActionListener listener = new StartButtonListener();
            startButton.addActionListener(listener);
            
            //frame.getContentPane().setLayout(new GridLayout(11, 10));
            //implement the stop button
            JButton stopButton = new JButton("Press to Stop");
            panel.add(stopButton);
            
            class stopButtonListener implements ActionListener
            {
                public void actionPerformed(ActionEvent event)
                {
                    //JLabel g = new JLabel("Timer Stopped");
                    //panel.add(g);
                    t.stop();
                    
                }
            }
            
            ActionListener l = new stopButtonListener();
            stopButton.addActionListener(l);
            
            //JPanel panel1 = new JPanel();
            //panel1.add(startButton);
            //stopButton.setLocation(12, 371);
            JTextArea k = new JTextArea("Enter group 1 (separate by a comma)");
            k.setColumns(80);
            JButton saveButton = new JButton("Enter and Check Answer");
            
            JTextArea j = new JTextArea("Enter group 2 (separate by a comma)");
            j.setColumns(80);
            JButton saveButton1 = new JButton("Enter and Check Answer");
            
           JTextArea o = new JTextArea("Enter group 3 (separate by a comma)");
            o.setColumns(80);
            JButton saveButton2 = new JButton("Enter and Check Answer");
            
            panel.add(k);
            panel.add(saveButton);
            panel.add(j);
            panel.add(saveButton1);
            panel.add(o);
            panel.add(saveButton2);
            
            class  EnterButtonListener implements ActionListener
            {
                public void actionPerformed(ActionEvent event)
                {
                    d.takeInput(k.getText());
                    //d.checkAnswers(d.getList1());
                    if (d.takeInput(k.getText()))
                    {
                        saveButton.setText("Group 1 Correct");
                        saveButton.setVisible(true);
                    }
                }
            }
            
            class  EnterButtonListener1 implements ActionListener
            {
                public void actionPerformed(ActionEvent event)
                {
                    d.takeInput1(j.getText());
                    //d.checkAnswers(d.getList2());
                    if (d.takeInput1(j.getText()))
                    {
                        saveButton1.setText("Group 2 Correct");
                        saveButton1.setVisible(true);
                    }
                }
            }
            
            class  EnterButtonListener2 implements ActionListener
            {
                public void actionPerformed(ActionEvent event)
                {
                    d.takeInput2(o.getText());
                    //d.checkAnswers(d.getList3());
                    if (d.takeInput2(o.getText()))
                    {
                        saveButton2.setText("Group 3 Correct");
                        saveButton2.setVisible(true);
                        
                    }
                }
            }
            
            ActionListener y = new EnterButtonListener();
            saveButton.addActionListener(y);
            
            ActionListener z = new EnterButtonListener1();
            saveButton1.addActionListener(z);
            
            ActionListener e = new EnterButtonListener2();
            saveButton2.addActionListener(e);
            
            
            /*class checkButtonListener1 implements ActionListener
            {
                public void actionPerformed(ActionEvent event)
                {
                    d.checkAnswers1();
                }
            }
            
            class checkButtonListener2 implements ActionListener
            {
                public void actionPerformed(ActionEvent event)
                {
                    d.checkAnswers2();
                }
            }
            
            class checkButtonListener3 implements ActionListener
            {
                public void actionPerformed(ActionEvent event)
                {
                    d.checkAnswers2();
                }
            }*/
            
            /*ActionListener ok = new checkButtonListener1();
            checkButton1.addActionListener(ok);
            
            ActionListener ko = new checkButtonListener2();
            checkButton2.addActionListener(ko);
            
            ActionListener sk = new checkButtonListener3();
            checkButton3.addActionListener(sk);*/
            
            frame.add(panel);
            //frame.add(panel1);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
}