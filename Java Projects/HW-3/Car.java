public class Car
{
    // instance variables - replace the example below with your own
    private int fuel;

    /**
     * Constructor for objects of class E312
     */
    public Car(int fuel)
    {
        fuel = this.fuel*20;
    }

    public void addGas(int y)
    {
        fuel += y*20;
    }
    
    public void drive(int x)
    {
        fuel = fuel - x;
    }
    
    public void getGasInTank()
    {
        System.out.print("Your car has " + fuel + " miles remaining.");
    }
}
