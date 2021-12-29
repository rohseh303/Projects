import javax.swing.JFrame;

public class CircleViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Four Circles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      CircleComponent component = new CircleComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
