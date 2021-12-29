import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * This component draws a few cars.
 * @author C. Horstmann, modified by A. Nguyen
 * @version 2.0
*/
public class ShapeComponent extends JComponent
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

      // Draw a car at the top-left corner
      int shapeLen = 60;               // the length of the car
      Shape shape1 = new Shape(0, 0, shapeLen);
      shape1.draw(g2);
      
      
      // Coordinates of bottom-right corner
      int right = getWidth(); // the width of the view
      int bot = getHeight();  // the height of the view
      
      // Draw a car randomly in the middle third (vertically)
      shapeLen = 120;                  // the length of the car - note: do NOT declare again
      Random randGen = new Random(); // create object for random number generator
      
      int x = randGen.nextInt(right - shapeLen);
      int y = randGen.nextInt(bot/3) + bot/3 - shapeLen/2;

      Shape shape2 = new Shape(x, y, shapeLen);
      shape2.draw(g2);      
      
      // Draw a car at the bottom-right corner
      shapeLen = 200;               // the length of the car - note: do NOT declare again
      x = getWidth() - shapeLen;    
      y = getHeight() - shapeLen/2; 
      Shape shape3 = new Shape(x, y, shapeLen);
      shape3.draw(g2);      

   }
}
