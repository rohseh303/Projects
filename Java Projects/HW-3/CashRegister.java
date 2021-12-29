public class CashRegister
{
    private double purchase;
    private double payment;
    private int items;
    
    public CashRegister()
    {
        items = 0;
    }
    
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
        items++;
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
    
    public int getItemCount()
    {
        //System.out.print("The number of items purchased is " + items +".");
        return items;
    }
}