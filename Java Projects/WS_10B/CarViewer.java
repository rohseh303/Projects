import javax.swing.JFrame;

public class CarViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new CarFrame();
        frame.setTitle("An animated car");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}