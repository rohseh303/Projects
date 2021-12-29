import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;
 
public class E63A {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("input values");
		double number1 = scanner.nextDouble();
		double number2 = number1;
		double number = scanner.nextDouble();
		
		while(scanner.hasNextDouble()) {
			
			if(number > number1) {
				number1 = number;
			}
			if(number < number2) {
				number2 = number;
			}
		}
		
		System.out.println("Biggest number: " + number1 + "   Smallest number:" + number);
	}
}
