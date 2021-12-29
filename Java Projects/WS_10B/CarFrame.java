import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class CarFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private CarComponent scene;
    
    class TimerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            scene.moveCarBy(1, 1);
        }
    }
    
    public CarFrame()
    {
        scene = new CarComponent();
        add(scene);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        ActionListener listener = new TimerListener();
        
        final int DELAY = 100;
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
}
