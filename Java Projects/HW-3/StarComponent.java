import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

public class StarComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.draw(new Line2D.Double(0, 0, 100, 100));
        g2.draw(new Line2D.Double(0, 50, 100, 50));
        g2.draw(new Line2D.Double(100, 0, 0, 100));
        
     
    }
}
