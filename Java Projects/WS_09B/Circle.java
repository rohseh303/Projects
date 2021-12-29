import java.awt.geom.Ellipse2D.Double;
import  java.awt.Graphics2D;

/** 
 * Write a description of class CIrcle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends java.awt.geom.Ellipse2D.Double
{
    // instance variables - replace the example below with your own
    private int thickness;

    /**
     * Constructor for objects of class CIrcle
     */
    public Circle(double centerX, double centerY, double radius)
    {
        height = radius;
        width = radius;
        
        x = centerX - width/2;
        y = centerY - height/2;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getRadius()
    {
        return height;
    }
    
    public void draw(Graphics2D g2)
    {
        draw(g2);
    }
    
    public void translate(double dx, double dy)
    {
        width += dx;
        height += dy;
    }
}
