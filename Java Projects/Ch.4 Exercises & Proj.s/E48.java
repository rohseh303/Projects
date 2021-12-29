import java.util.Scanner;
public class E48 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); System.out.println("Enter side 1"); int s1 = scan.nextInt(); System.out.println("Enter side 2"); int s2 = scan.nextInt();
        int area = s2 *s1;
        int perim = 2*(s2+s1);
        double diag = Math.sqrt(Math.pow(s1, 2) + Math.pow(s2,2));
        System.out.println("Area:" + area); System.out.println("Perimeter:" + perim); System.out.println("Diagonal:" + diag); 
    }
}