import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Rectangle;
public class P618 {
		
		public static void main(String[] args)
		{
			double j = 40;
			double R1 = 20;
			double RS = 8;
			double Pov = 0;
			for (var i = 0.01; i <= 2; i+= 0.01) {
				double Pa = (i*j)/(((Math.pow(i, 2)*R1)+RS));
				double P1 = RS*Math.pow(Pa, 2);
				if (P1 >= Pov) {
					Pov = P1;
				}
				
			}
			System.out.println("max power: " + Pov);

		}
}
