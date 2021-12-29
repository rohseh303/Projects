import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;

public class E63B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("input values:");
		double number1 = scan.nextDouble();
		double number2 = number1;
		int even = 0;
		int odd = 0;
		while(scan.hasNextDouble()) {
			double n = scan.nextDouble();
			if((n % 2)==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Odd values: "+odd+" Even values: "+even);
	}
}
