import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
//import java.awt.geom.Ellipse2D.Double;
import javax.swing.JComponent;
import java.lang.Math;

public class CarComponent extends JComponent
{
    private static final int BOX_X = 0;
    private static final int BOX_Y = 0;
    private static final int BOX_WIDTH = 60;
    private static final int BOX_HEIGHT = 15;
    
    private Rectangle box;
    private Ellipse2D.Double backWheel;
    private Ellipse2D.Double frontWheel;
    
    public CarComponent()
    {
        box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
        backWheel = new Ellipse2D.Double(0, 15, 10, 10);
        frontWheel = new Ellipse2D.Double(50, 15, 10, 10);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
        g2.draw(frontWheel);
        g2.draw(backWheel);
    }
    
    public void moveCarBy(double dx, double dy)
    {
        int xy = (int) dx;
        int yx = (int) dy;
        box.translate(xy, yx);
        backWheel.getX();
        backWheel.getY();
        double x = backWheel.getX() + dx;
        double y = backWheel.getY() + dy;
        backWheel = new Ellipse2D.Double(x, y, 10, 10);
        
        frontWheel.getX();
        frontWheel.getY();
        double xx = frontWheel.getX() + dx;
        double yy = frontWheel.getY() + dy;
        frontWheel = new Ellipse2D.Double(xx, yy, 10, 10);
        
        
        repaint();
    }
}