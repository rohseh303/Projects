import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;

 
public class E64E
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Input a string");
		String str = scanner.nextLine();
		int b = str.length();
		for (int i = 0; i < b; i++) {
			char x = str.charAt(i);
			if (x == 'a') {
				System.out.print(i+", ");
			}
			else if (x == 'e') {
				System.out.print(i+", ");
			}
			else if (x == 'i') {
				System.out.print(i+", ");
			}
			else if (x == 'o') {
				System.out.print(i+", ");
			}
			else if (x == 'u') {
				System.out.print(i+", ");
			}
		}
	}
}
