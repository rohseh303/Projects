import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;

 
public class E64D
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("input string");
		String str = scan.nextLine();
		int b = str.length();
		int value = 0;
		for (int i = 0; i < b; i++) {
			char x = str.charAt(i);
			if (x == 'a') {
				value++;
			}
			else if (x == 'e') {
				value++;
			}
			else if (x == 'i') {
				value++;
			}
			else if (x == 'o') {
				value++;
			}
			else if (x == 'u') {
				value++;
			}
		}
		System.out.println(value);
	}
}
