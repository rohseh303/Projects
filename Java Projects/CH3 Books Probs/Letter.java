public class Letter
{
    // instance variables - replace the example below with your own
    private String sender;
    private String reciever;
    private String body;
    private String letter;
    //private 

    /**
     * Constructor for objects of class E314
     */
    public Letter(String from, String to)
    {
        sender = from;
        reciever = to;
        body = "";
        letter = "";
    }

    public void addLine(String line)
    {
        body += line + "\n";
    }
    
    public String getText()
    {
        letter = "Dear " + reciever + ":\n\n" + body + "\nSincerely,\n\n" + sender;
        System.out.print(letter);
        return letter;
    }
}
