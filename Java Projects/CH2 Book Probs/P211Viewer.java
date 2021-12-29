import javax.swing.JFrame;

public class P211Viewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(500, 600);
      frame.setTitle("Shapes");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      P211 component = new P211();
      frame.add(component);

      frame.setVisible(true);
   }
}
