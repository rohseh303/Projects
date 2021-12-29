public class ProductTester
{
    public static void main(String args[])
    {
        Product phone = new Product("iPhone", 500);
        Product basketball = new Product("Evolution Indoor Basketball", 60);
        
        phone.getName();
        phone.getPrice();
        
        phone.getName();
        basketball.getPrice();
        
        phone.reducePrice(5);
        basketball.reducePrice(5);
        
        phone.getPrice();
        basketball.getPrice();
    }
}
