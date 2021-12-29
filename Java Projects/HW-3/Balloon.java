public class Balloon
{
    // instance variables - replace the example below with your own
    private int radius;
    private double volume;

    /**
     * Constructor for objects of class Baloon
     */
    public Balloon()
    {
        // initialise instance variables
        radius = 0;
        volume = 0;
    }

    public void inflate(double amount)
    {
        radius += amount;
    }
    
    public double getVolume()
    {
        volume = (4/3)*Math.PI*Math.pow(radius, 3);
        return volume;
    }
}
