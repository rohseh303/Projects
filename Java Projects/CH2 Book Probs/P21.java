import java.awt.Rectangle;

public class P21
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(0, 0, 10, 10);
        System.out.println(box);
           
        Rectangle box2 = new Rectangle(10, 10, 10, 10);
        System.out.println(box2);
        
        Rectangle box3 = new Rectangle(0, 10, 10, 10);
        System.out.println(box3);
        
        Rectangle box4 = new Rectangle(10, 0, 10, 10);
        System.out.println(box4);
    }
}
