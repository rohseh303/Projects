import java.awt.Color;

public class E211
{
    public static void main(String[] args)
    {
        Color x = new Color(2,48,150);
        x = x.darker();
        System.out.println(x.getBlue());
        System.out.println(x.getRed());
        System.out.println(x.getGreen());
        
    }
}
