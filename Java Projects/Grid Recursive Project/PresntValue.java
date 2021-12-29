import java.io.*;
import java.math.*;
import java.text.DecimalFormal;
import javax.swing.JOptionPane;

class PresntValue
{
	public static void main (String argos[])
	{
		String input;
		double pValue, fValue, rate;
		int years;
		DecimalFormat formatter=new DecimalFormat (“#0.00”);
	
		input=JOptionPane.showInputDialog(“Enter Future Value”);
		
		fValue=Double.parseDouble(input);
		
		input=JOptionPane.showInputDialog(“Enter Rate of Interest”);

rate=Double.parseDouble(input);
rate=rate/100;

input=JOptionPane.showInputDialog(“Enter Years”);
years=Interger.parseInt(input);

pValue=presentValue(fValue,rate,years);
JOptionPane.showMessageDialog(null, “Present Value: “+formatter.format(pValue));

System.exit(0);
}
public static double presentValue(double f, double r, int n)
{
double p;
p=f/ (Math.pow(1+r,n));
return p;
}
}
