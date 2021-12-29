import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.util.ArrayList;

public class RectangleComponent extends JComponent
{
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;
    ArrayList<Rectangle> list;
    
    private Rectangle box;
    
    public RectangleComponent()
    {
        box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
    }
    
    public void paintComponent(Graphics g)
    {
        list= new ArrayList<Rectangle>();
        list.add(box);
        
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }
    
    public void moveRectangleTo(int x, int y)
    {
        box.setLocation(x, y);
        Rectangle boxes = new Rectangle(x, y, BOX_WIDTH, BOX_HEIGHT);
        list.add(boxes);
        repaint();

    }
}