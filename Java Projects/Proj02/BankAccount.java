public class BankAccount
{
    private double purchase;
    private double payment;
    
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }
    
    public void receivePayment(double amount)
    {
        payment = payment + amount;
    }
    
    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}