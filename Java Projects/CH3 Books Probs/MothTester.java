public class MothTester
{
    public static void main(String args[])
    {
        Moth mugsy = new Moth(100);
        mugsy.moveToLight(0);
        System.out.println("The expected position of Mugsy is 50");
        System.out.println("The expected position of Mugsy is " + mugsy.getPosition());
        mugsy.moveToLight(0);
        System.out.println("The expected position of Mugsy is 25");
        System.out.println("The expected position of Mugsy is " + mugsy.getPosition());
        mugsy.moveToLight(0);
        System.out.println("The expected position of Mugsy is 12.5");
        System.out.println("The expected position of Mugsy is " + mugsy.getPosition());
    }
}