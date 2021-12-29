import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;
 
public class E63D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Input values");
		double number = scanner.nextDouble();
		while(scanner.hasNextDouble()) {
			double last = number;
			number = scanner.nextDouble();
			if(number ==  last){
				System.out.print(number +" ");
			}
		}
	}
}
