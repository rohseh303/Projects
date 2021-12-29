
/**
 * Write a description of class BankAccountTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashRegisterTester
{
    public static void main(String[] args)
    {
        CashRegister a1 = new CashRegister();
        
        a1.recordPurchase(25.00);
        a1.recordPurchase(10.00);
        a1.receivePayment(40.00);
        
        double change = a1.giveChange();
        
        System.out.println(change);
        System.out.println("Expected: 5.00");
        System.out.print("The item count is " + a1.getItemCount() + ".");
    }
}
