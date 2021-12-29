/**
 * Write a description of class b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        // ADD 1ST PERSON TO THE PRESIDENT SOCIAL
        PrezATDP prezW = new PrezATDP("Washington", 70);
        
        // SHOW RESULTS: NO FRIENDS
        System.out.print("\nRESULT: ");
        System.out.println(prezW.getOwnName() + "age (" + prezW.getOwnAge() + ")"
                   + " has " + prezW.getFriendCount() + " friends: "
                   + prezW.getAllFriendsNames());
        System.out.println("EXPECTED: Washington has no friends right now");
        
        // ADD FRIENDS TO THE 1ST PRESIDENT
        PrezATDP prezA1 = new PrezATDP("Adams", 10);     
        prezW.addFriend(prezA1);
        //... ADD Jefferson HERE ...
        PrezATDP prezJ = new PrezATDP("Jefferson", 20);     
        prezW.addFriend(prezJ);
        //... ADD Madison HERE ...
        PrezATDP prezM = new PrezATDP("Madison", 30);     
        prezW.addFriend(prezM);
        //... ADD Monroe HERE ...
        PrezATDP prezM1 = new PrezATDP("Monroe", 40);    
        prezW.addFriend(prezM1);

        
        // SHOW RESULTS: W/ FRIENDS
        System.out.print("\nRESULT after addFriend: ");
        System.out.println(prezW.getOwnName() + " has " + prezW.getFriendCount() + " friends: "
                   + prezW.getAllFriendsNames());
        System.out.println("EXPECTED: Washington has 4 friends: Adams, Jefferson, Madison, Monroe");
          
        
      // UNFRIEND
        prezW.unfriend("Jefferson");
        System.out.print("\nRESULT after trying to unFriend (" + prezJ.getOwnName() + "): ");
        System.out.println(prezW.getOwnName() + " has " + prezW.getFriendCount() + " friends: "
                   + prezW.getAllFriendsNames());
        System.out.println("EXPECTED: Washington has 3 friends: Adams, Madison, Monroe");
    }

}