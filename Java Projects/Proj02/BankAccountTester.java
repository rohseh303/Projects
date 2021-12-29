
/**
 * Write a description of class BankAccountTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount a1 = new BankAccount();
        
        a1.recordPurchase(25.00);
        a1.recordPurchase(10.00);
        a1.receivePayment(40.00);
        
        double change = a1.giveChange();
        
        System.out.println(change);
        System.out.println("Expected: 5.00");
        System.out.print(a1);
    }
}
