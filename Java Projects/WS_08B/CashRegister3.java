 import java.util.ArrayList;

/**
* A cash register totals up sales and computes change due.
* @author A. Nguyen 
* @version 1.0
*/
public class CashRegister3 
{
   private double purchase;
   private double payment;
   private double purchaseNumber;
   private Coin[] coinArr = new Coin[5];

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister3()
   {
      purchase = 0;
      payment = 0;
      coinArr[0] = new Coin(1.0, "dollar");
      coinArr[1] = new Coin(0.25, "quarter");
      coinArr[2] = new Coin(0.10, "dime");
      coinArr[3] = new Coin(0.05, "nickel");
      coinArr[4] = new Coin(0.01, "penny");
   }

   public double returnPurchaseNumber()
   {
       return purchaseNumber;
   }
   
   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase += amount;
      int purchaseNumber =+ 1;
   }
   

   /**
      Record (part of) the payment, per coin type, and accumlate into total payment
      @param count number of coins received
      @param coinType the coin received
   */
   public void receivePayment(int count, Coin coinType) {
       payment += count * coinType.getValue();
    }
   
   public double[] getReceiptVals()
   {
       double[] receipt = new double[]{purchaseNumber, purchase, payment, payment - purchase};
       return receipt;
   }
    
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public String giveChange()
   {
      double change = payment - purchase;
      payment = 0;
      purchase = 0;
      purchaseNumber = 0;
      int[] giveChange = new int[5];
        // change = change * 100;
       giveChange[0] = (int)(change / coinArr[0].getValue());
       double remainderOfChange = change % coinArr[0].getValue();
        
       giveChange[1] = (int)(remainderOfChange / coinArr[1].getValue());
       double remainderAfterQuarterChange = remainderOfChange % coinArr[1].getValue();
        
       giveChange[2] = (int)(remainderAfterQuarterChange / coinArr[2].getValue());
       double remainderAfterDimeChange = remainderAfterQuarterChange % coinArr[3].getValue();
        
       giveChange[3] = (int)(remainderAfterDimeChange / coinArr[3].getValue());
       double remainderAfterNickelChange = remainderAfterDimeChange % coinArr[3].getValue();
        
       giveChange[4] = (int)(remainderAfterNickelChange);
       
      // System.out.println("Change:");
      String toBeDisplayed = "";
      for (int element = 0; element < giveChange.length; element++)
      {
           toBeDisplayed += giveChange[element] + " " + coinArr[element].getName() + "\n";
      }
      
      return toBeDisplayed;
   }
}
