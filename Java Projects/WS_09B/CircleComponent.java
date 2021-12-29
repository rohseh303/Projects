import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * This component draws a few cars.
 * @author C. Horstmann, modified by A. Nguyen
 * @version 2.0
*/
public class CircleComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      /* Rather than having the code to directly draw a car here
       * (by using Rectangle, Ellipse2D.Double, etc.), we take
       * the code & put it in a separate class called Car. This way, 
       * we can display as many cars as possible, by simply creating
       * "new" car, at various location (x, y).
       */


      
      
      // Draw 4 stars
      Circle star1 = new Circle(0, 0, 1); // at random location
      Circle star2 = new Circle(10, 0, 10);
      Circle star3 = new Circle(0, 10, 20);
      Circle star4 = new Circle(80, 80, 20);
      
      star1.draw(g2);
      star2.draw(g2);
      star3.draw(g2);
      star4.draw(g2);
      
      // Draw other things here ...
   }
}