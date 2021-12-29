import java.util.Scanner;

public class E47
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What is the radius of your circle?");
        double radius = in.nextDouble();
        
        double diameter = radius * 2;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("The area of the circle is " + area);
        System.out.println("The circumference of the circle is " + circumference);

        double volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.println("The volume of the sphere is " + volume);
        System.out.println("The surface are of the sphere is " + surfaceArea);
    }
}