public class BalloonTester
{
    public static void main(String args[])
    {
        Balloon x = new Balloon();
        x.inflate(10);
        System.out.println("The volume of the balloon is now "+ x.getVolume()+ ".");
    }
}
