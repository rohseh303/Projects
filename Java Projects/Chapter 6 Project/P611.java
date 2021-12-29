import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;

 
public class P611 {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter trend:");
		double t = scanner.nextDouble();
		Scanner scanner1 = new Scanner(System.in); 
		System.out.println("Enter sell price:");
		double max = scanner1.nextDouble();
		double min = t;
		while(scanner.hasNextDouble()) {
			if(max <= min) {
				System.out.println("Stock price exceeds target at "+ min);
				break;
			}
			min = scanner.nextDouble();
		}
	}
 
}
