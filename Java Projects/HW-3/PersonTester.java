public class PersonTester
{
    public static void main(String[] args)
    {
        Person x = new Person("Lebron");
        Person y = new Person("Curry");
        Person z = new Person("Rohan");
        
        z.befriend(x);
        z.befriend(y);
        y.befriend(x);
        System.out.println("The number of friends " + y.getName() +" has is " + y.getFriendCount());
        y.unfriend(x);
        
        System.out.println( z.getName()+"'s friend list is: " + z.getFriendNames());
        System.out.println("The number of friends " + y.getName() +" has after unfriending " + x.getName()+ " is " + y.getFriendCount());
        System.out.println("The number of friends " + z.getName() +" has is " + z.getFriendCount());
    }
}