public class Product
{
    // instance variables - replace the example below with your own
    private double price;
    private String name;

    /**
     * Constructor for objects of class Product
     */
    public Product(String x, double u)
    {
        name = x;
        price = u;
    }

    public String getName()
    {
        System.out.println("The name of your product is " + name);
        return name;
    }
    
    public double getPrice()
    {
        System.out.println ("The price of your product is " + price +".");
        return price;
    }
    
    public void reducePrice(double discount)
    {
        price = price - discount;
    }
}
