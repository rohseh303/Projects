public class CarTester
{
    public static void main(String args[])
    {
        Car myHybrid = new Car(50);
        myHybrid.addGas(20);
        myHybrid.drive(100);
        myHybrid.getGasInTank();
    }
}
