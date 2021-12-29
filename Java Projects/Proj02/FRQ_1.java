import java.awt.Rectangle;

public class FRQ_1
{

    public static void main(String[] args)
    {
        Rectangle regular = new Rectangle(0, 0, 10, 10);
        double width = regular.getWidth();
        double height = regular.getHeight();
        System.out.print(height*width);
        System.out.print("Expected: 100");
        System.out.print((2*width)*height);
        System.out.print("Expected: 200");
        System.out.print((2*height)*width);
        System.out.print("Expected: 200");
        System.out.print(2*height*2*width);
        System.out.print("Expected: 400");
        
        
    }

}
