import javax.swing.JFrame;

public class FaceViewerP213
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("Two rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        P211 component = new P211();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
