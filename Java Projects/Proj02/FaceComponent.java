import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class FaceComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      // Show the boundary for the image
      Color boundaryColor = new Color(80, 90, 159);
      g2.setColor(Color.YELLOW);
      g2.draw(new Rectangle(0, 0, 300, 360));
      
      
      // Prepare some colors from scratch (max=255): RGB, or RGB & alpha value
      Color colorScr1 = new Color(205, 135, 0); //200, 150, 180
      //Color colorBlankOut = new Color(255, 255, 255, 150); // to blank out
      
      // Construct a few shapes
      Rectangle outsidebox = new Rectangle(0, 0, 300, 360);
      Ellipse2D.Double oval1 = new Ellipse2D.Double(0, 0, 300, 300);
      
      // Construct a line
      Line2D.Double aLine = new Line2D.Double(100, 200, 200, 200);
      
      //Eyes
      Ellipse2D.Double oval2 = new Ellipse2D.Double(100, 100, 20, 20);
      //eye1.translate(-150, -50);
      Ellipse2D.Double oval3 = new Ellipse2D.Double(200, 100, 20, 20);
      
      // Construct a polygon
      //int[] xCoords = {50, 250, 150};
      //int[] yCoords = {250, 250,300};
      //Polygon aPoly = new Polygon(xCoords, yCoords, 3);
      
      
      // Draw rectangle
      g2.setColor(Color.YELLOW);
      g2.draw(outsidebox);
      
      // Fill rectangle
      //box1.grow(-10, -10); // Shrink box, all 4 sides
      g2.setColor(colorScr1); // use default color - see Color class in Java API
      g2.fill(outsidebox);
      
      // Fill oval
      Color colorScr2 = new Color(0, 255, 0);
      g2.setColor(colorScr2);    
      g2.fill(oval1);
      
      // Draw line
      g2.setStroke(new BasicStroke(5));
      g2.setColor(Color.BLACK); // use default color - see Color class in Java API    
      g2.draw(aLine);
      
      //Line 2
      g2.setStroke(new BasicStroke(5));
      g2.setColor(Color.BLACK);
      //g2.draw(aLine2);
      
      // Draw & fill polygon
      g2.setColor(Color.BLACK); // use default color - see Color class in Java API    
      //g2.draw(aPoly);
      g2.setColor(Color.BLACK); // use default color - see Color class in Java API    
      //g2.fill(aPoly);
      
      //Draw & fill the eyes
      //g2.setColor(Color.CYAN);
      g2.draw(oval1);
      g2.draw(oval2);
      g2.setColor(Color.BLACK);
      g2.fill(oval2);
      g2.fill(oval3);
      
      // Write some text
      g2.setColor(Color.BLACK);
      g2.drawString("My name is Gary", 105, 340);
      
   }
}
