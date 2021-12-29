import java.text.DecimalFormat;

public class P410
{
    private double b;
    private double iRate;
    public P410(double t1, double t2)
    {
        b = t1;
        System.out.println("Initial Balance: " + b);
        iRate = t2;
        System.out.println("Annual Interest rate in percent: " +
        (iRate*100));
    }
    
    public double compoundamt() {
        b = b * (1+(iRate / 12)); return b;
    }
    
    public static void main(String args[])
    {
        P410 acct = new P410(1000, 0.06);
        double m1 = acct.compoundamt();
        DecimalFormat df = new DecimalFormat("#.##"); 
        System.out.println("After First Month: " + df.format(m1)); double m2 =acct.compoundamt();
        System.out.println("After Second Month: " + df.format(m2)); double m3 =acct.compoundamt();
        System.out.println("After Third Month: " + df.format(m3));
    }
}