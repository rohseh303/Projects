import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;

 
public class E64A {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("input values");
		String input = scanner.nextLine();
		int a = input.length();
		for (int i = 0; i < a; i++) {
			char y = input.charAt(i);
			if (Character.isUpperCase(y)) {
				System.out.print(y);
			}
		}
	}
}
