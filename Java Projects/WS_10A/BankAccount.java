
/**
 * The class simulates a bank account and provides methods such as depositing,
 withdrawing, and viewing the balance.
 *
 * @Sidarth Raman
 * @6/26/20
 */
public class BankAccount
{
    //Fields
    private double balance;
    //Constructors
    public BankAccount(){
        balance = 0.0;
    }

    public BankAccount(double initAmt){
        balance = initAmt;
    }
    //Methods
    public void deposit(double amt){
        balance = balance + amt;
    }

    public void withdraw(double amt){
        balance = balance - amt;
    }

    public double getBalance(){
        return balance;
    }
    
    public void addInterest(double rate){
        balance = balance + balance*rate;
    }
}
