import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;
 
public class E63C {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("input values");
		double totalval = 0;
		System.out.println();
		while(scan.hasNextDouble()) {
			double n = scan.nextDouble();
			totalval = totalval + n;
			System.out.print(totalval+" ");
		}
	}
}
