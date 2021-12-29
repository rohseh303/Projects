
/**
 * Write a description of class E315 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bug
{
    // instance variables - replace the example below with your own
    private int position;
    private int count;

    /**
     * Constructor for objects of class E315
     */
    public Bug(int initialPosition)
    {
        position = initialPosition;
        count = 1;
    }


      public void turn()
     {
        count = count * -1;
     }
    
    public void move()
    {
        position = position + count;
    }
    
    public int getPosition()
    {
        return position;
    }
}
