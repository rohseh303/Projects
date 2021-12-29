import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;

 
public class E64B
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("input string");
		String input = scanner.nextLine();
		int a = input.length();
		for (int i = 0; i < (a/2); i++) {
			char y = input.charAt(i * 2 + 1);
			System.out.print(y);
		}
	}
}
