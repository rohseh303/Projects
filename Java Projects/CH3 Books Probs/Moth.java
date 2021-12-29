
public class Moth
{
    // instance variables - replace the example below with your own
    private double position;

    /**
     * Constructor for objects of class E316
     */
    public Moth(double initialPosition)
    {
        position = initialPosition;
    }


    public void moveToLight(double lightPosition)
    {
        double distance = (lightPosition - position)/2;
        position = position + distance;
    }
    
    public double getPosition()
    {
        return position;
    }
}
