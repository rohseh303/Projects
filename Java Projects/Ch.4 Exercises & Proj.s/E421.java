import java.text.DecimalFormat;

public class E421
{
    private double amount;
    private double paid;
    public E421()
    {
        amount = 0.0;
        paid = 0.0;
    }
    public void recordAmount(double in)
    {
        amount += in;
    }
    public double giveChange()
    {
        double change = paid - amount;
        amount = 0;
        paid = 0;
        return change;
    }
    public void enterDollars(int dol)
    {
        amount -= dol;
    }
    public void enterQuarters(int quart)
    {
        amount -= (quart*0.25);
    }
    public void enterDimes(int dime)
    {
        amount -= (dime*0.1);
    }
    public void enterNickels(int nickel)
    {
        amount -= (nickel*0.05);
    }
    public void enterPennies(int pen)
    {
        amount -= (pen*0.01);
    }

    public static void main(String[] args)
    {
        E421 register = new E421(); 
        register.recordAmount(20.37); 
        register.enterDollars(20);
        register.enterQuarters(2);
        double total1 = register.giveChange(); 
        DecimalFormat df = new DecimalFormat("#.##"); 
        System.out.println("Change: " + df.format(total1)); 
        System.out.println("Expected: 0.13");
    }
}