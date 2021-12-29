public class BugTester
{
    public static void main(String args[])
    {
        Bug bugsy = new Bug(10);
        bugsy.move();
        bugsy.turn();
        bugsy.move();
        bugsy.turn();
        bugsy.turn();
        bugsy.move();
        bugsy.move();
        bugsy.move();
        bugsy.move();
        System.out.println("The expected position is 6");
        System.out.println("The actual position is " + bugsy.getPosition());
    }
}