/**
   This class tests the CashRegisterATDP class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
       final double DOLLAR_VALUE = 1.0;
       final double QUARTER_VALUE = 0.25;
       final double DIME_VALUE = 0.1;
       final double NICKEL_VALUE = 0.05;
       final double PENNY_VALUE = 0.01;
       
       
      // FIRST PURCHASE
      // Create CashRegisterATDP object, and 
      // record price for each purchased item
      
      System.out.println("\nFIRST PURCHASE");
      
      CashRegister3 register = new CashRegister3();
      
      //register.add(DOLLAR_VALUE);
      
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      
      // Create Coin objects, and
      // Record price for each type of coin
      Coin dollar = new Coin(DOLLAR_VALUE, "Dollar");
      register.receivePayment(2, dollar);
      Coin quarter = new Coin(QUARTER_VALUE, "Quarter");
      register.receivePayment(4, quarter);
      
      
      
      // Calculate & display change amount, in pennies
      System.out.print("\tChange: ");
      System.out.println(register.giveChange());
      System.out.println("\tExpected change amount: 0.75");

      
      // SECOND PURCHASE
      // NOTE: Do NOT creat CashRegisterATDP object again
      // Record price for each purchased item
      
      System.out.println("\nSECOND PURCHASE");
            
      register.recordPurchase(2.25);
      register.recordPurchase(19.25);
      
      // NOTE: Do NOT creat Coin objects again
      // Record price for each type of coin
      register.receivePayment(23, dollar);
      register.receivePayment(23, quarter);
      
      // Calculate & display change amount, in pennies
      System.out.print("\tChange: ");
      System.out.println(register.giveChange());
      System.out.println("\tExpected change amount: 7.25 ");
      
      register.receivePayment(9, dollar);
      register.recordPurchase(5.05);
      
      System.out.print("\tChange: ");
      System.out.println(register.giveChange());
      System.out.println("\tExpected change amount: 3.95");
   }
}
