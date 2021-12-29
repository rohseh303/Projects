import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Frame;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;

public class P619 extends JComponent {
    public void paintComponent(Graphics g)
    {
        int l = 50;
        Graphics2D g2 = (Graphics2D) g;
        for (var i = 0; i < (l*8); i+=(2*l)) {
            for (var j = 0; j < (l*8); j+=(2*l)) {
            g2.fillRect(30+j, 20+i, 50, 50);
            g2.drawRect(30+j, 70+i, 49, 49);
            g2.drawRect(80+j, 20+i, 49, 49);
            g2.fillRect(80+j, 70+i, 50, 50);
            
            }
        }
        

        
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("RECTCALC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        P619 component= new P619();
        frame.add(component);
    }
}
