
/**
 * This class models a tally counter
 */
public class Counter
{
    private int value;
    
    /**
     * Gets the current value of this counter.
     * @param the current value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Advances the value of this counter by 1.
     */
    public void click()
    {
        value += 1;
    }
    
    public void undo()
    {
        value = value - 1;
    }
}
