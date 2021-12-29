import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;

public class E64C
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("input string");
		String w = scanner.nextLine();
		String w2 = w.replace('a', '_');
		String w3 = w2.replace('e', '_');
		String w4 = w3.replace('i', '_');
		String w5 = w4.replace('o', '_');
		String w6 = w5.replace('u', '_');
		System.out.println(w6);
	}
}
