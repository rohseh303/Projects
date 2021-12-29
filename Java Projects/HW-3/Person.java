
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String friendList;
    private String name;
    private int count;

    public Person(String name)
    {
        this.name = name;
        count = 0;
        friendList = "";
    }

    public String getName()
    {
        return name;
    }
    
    public String befriend(Person A)
    {
        friendList += A.getName() + " ";
        count++;
        return friendList;
    }
    
    public String unfriend(Person B)
    {
        friendList.replace(B.getName(), "");
        count--;
        return friendList;
    }
    
    public String getFriendNames()
    {
        return friendList;
    }
    
    public int getFriendCount()
    {
        return count;
    }
}
