
/**
 * This program shows 3 examples of recursive methods
 * 
 * @author Anh Nguyen
 * @version 1.0
 */
public class Recursion
{
   public static int nFactorial(int n) {
       if (n <= 1) {
           return 1;
        }
       else {
           return n * nFactorial(n-1);
        }
   }
   
   public static int sumOfSqs(int n) {
       if (n <= 1) {
           return 1;
        }
       else {
           return n * n + sumOfSqs(n-1);
        }
   }
   
   public static int fib(int n) {
       if (n <= 2) {
           return 1;
        }
       else {
           return fib(n-1) + fib(n-2);
        }
   }
   
   public static double compSave(double n, double initBal, double r)
   {
     double currBal = initBal;
     double value = 0;
     double i = 0;
     while (true)  
       if (i == n)
       {
           return currBal;
       }
       else
       {
           currBal = currBal + currBal*(r);
           i++;
       }
   }
   
   public static void main(String[] args) {
       System.out.printf("nFactorial: %,d\n", nFactorial(6)); // which n value will overflow the result?
       System.out.printf("sumOfSqs: %,d\n", sumOfSqs(5));
       System.out.printf("fib: %,d\n", sumOfSqs(4));
       System.out.printf("compSave: "+ compSave(5, 100, 0.01));
    }

}
