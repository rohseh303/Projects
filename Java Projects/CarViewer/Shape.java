import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class Shape
{
   private int xLeft;
   private int yTop;
   private int delta;

   /**
      Constructs a car with a given top left corner.
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
      @param approxLen the approximate length of the car; the car's height if half of the length
   */
   public Shape(int x, int y, int approxLen)
   {
      xLeft = x;
      yTop = y;
      delta = approxLen / 6;
   }

   /**
      Draws the car.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
       Rectangle bigBox = new Rectangle(xLeft, yTop + delta, delta*12, delta);
      Ellipse2D.Double circle = new Ellipse2D.Double(xLeft + delta*8, yTop + delta*4, delta, delta);
      g2.draw(bigBox);      
      g2.draw(circle);           
   }
}
