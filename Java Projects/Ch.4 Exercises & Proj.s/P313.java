public class P313{
    private String name;
        public P313() 
        {
            
        }
        public P313(String in) 
        {
            name = in; 
        }
        public String Hello() 
        {
            return "Hello"; 
        }
        public String nameHello()
        {
            return "Hello, " + name; 
        }
        public String Goodbye() 
        {
            return "Goodbye, " + name;
        } 
        public String Cannot() 
        {
            return "I'm sorry, " + name + " I am afraid I can't do that";
        
        }
        
    public static void main(String args[])
    {
        P313 s0 = new P313();
        P313 s1 = new P313("Nate"); 
        System.out.println(s0.Hello()); 
        System.out.println(s0.Hello()); 
        System.out.println(s1.nameHello()); 
        System.out.println(s1.Goodbye()); 
        System.out.println(s1.Cannot());
    }
} 