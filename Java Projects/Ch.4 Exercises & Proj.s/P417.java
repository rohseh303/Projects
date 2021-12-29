import java.util.Scanner;

public class P417
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter charge 1 (q1) in coulombs)"); double q1 = scan.nextDouble(); 
        System.out.println("Enter charge 2 (q2) in coulombs)"); double q2 = scan.nextDouble(); 
        System.out.println("Enter the radius in meters"); double e = 8.854*Math.pow(10, -12);
        double r = scan.nextDouble();
        double nume = q1*q2;
        double denom = 4 * Math.PI * e * Math.pow(r,2);
        double ans = nume / denom;
        System.out.println(nume);
        System.out.println(denom);
        System.out.println("Force: "+ans+" N");
    }
}
