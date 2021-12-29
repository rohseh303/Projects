import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;

public class P211 extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Line2D.Double aLine = new Line2D.Double(100, 100, 200, 200);
        Line2D.Double aLine1 = new Line2D.Double(100, 200, 100, 200);
        Line2D.Double aLine2 = new Line2D.Double(150, 150, 150, 150);
        Line2D.Double aLine3 = new Line2D.Double(250, 50, 250, 50);
        //ptSegDist(100, 100, 200, 200, 100, 200);
        double y = aLine.ptSegDist(100, 200);
        double x = aLine.ptSegDist(150, 150);
        double z = aLine.ptSegDist(250, 50);
        
        Ellipse2D.Double oval1 = new Ellipse2D.Double(100, 200, 10, 10);
        Ellipse2D.Double oval2 = new Ellipse2D.Double(150, 150, 10, 10);
        Ellipse2D.Double oval3 = new Ellipse2D.Double(250, 50, 10, 10);
        
        float a = (float)aLine1.getX1();
        float b = (float)aLine1.getY1();
        
        float c = (float)aLine2.getX1();
        float d = (float)aLine2.getY1();
        
        float e = (float)aLine3.getX1();
        float f = (float)aLine3.getY1();
        
        g2.drawString("Distance: " + y, a, b);
        g2.drawString("Distance: " + x, c, d);
        g2.drawString("Distance: " + z, e, f);
        
        g2.draw(aLine);
        g2.draw(aLine1);
        g2.draw(aLine2);
        g2.draw(aLine3);
        g2.draw(oval1);
        g2.draw(oval2);
        g2.draw(oval3);
        
        System.out.println("First distance is " + y);
        System.out.println("Second distance is " + x);
        System.out.println("Third distance is " +z);
    }
}