import java.util.ArrayList;;

public class PrezATDP
{
    private String ownName;
    private int ownAge;
    private ArrayList<String> friendsNames;
    
    public PrezATDP (String aName, int anAge)
    {
       //... YOUR CODE HERE ...
       ownName = aName;
       ownAge = anAge;
       friendsNames = new ArrayList<String>();
    }

    /**
     * Gets the president's name.
     * @return president's own name.
     */
    public String getOwnName()
    {
        return ownName;
    }
    
    /**
     * Gets the president's age.
     * @return president's own age.
     */
    public int getOwnAge()
    {
        return ownAge;
    }
       
    /**
     * Sets the president's age.
     * @param 's new age.
     */
    public void setOwnAge(int givenAge)
    {
        ownAge = givenAge;
    }

    /**
     * Gets the number of friends this president has.
     * @return the number of friends.
     */
    public int getFriendCount()
    {
        if (friendsNames == null)
        {
        return 0;
    }
        else
        {
            return friendsNames.size();
        }
    }
    
    /**
     * Gets a list of all of this president's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Lincoln, Johnson"
     */
    public String getAllFriendsNames()
    {
        String x = "";
        if (friendsNames == null)
        {
            return "NO FRIENDS";
        }
        else
        {
        for (int i = 0; i < friendsNames.size(); i++)
        {
           x = friendsNames + ", ";
           // array += friendsNames[i] + ", ";
        }
        return x;
    }  
}

    
    
    /**
     * Gets the ith friend.
     * @param i the index of the friend you want to get.
     * @return the ith friend's name.
     */
    public String get1FriendsNames(int index)
    {
        return friendsNames.get(index -1);
    }
    
    /**
     * Adds the given friend to this president's friends list if the friend is not
     * yet in the list.
     * @param friend the friend to add.
     */
    public void addFriend(PrezATDP aFriend)
    {   
        String name;
        if (friendsNames == null)
        {
        name = aFriend.getOwnName();
        friendsNames.add(name);
        }
        
        else
        {
        name = aFriend.getOwnName();
        friendsNames.add(name);
        }
        
    }
    
    /**
     * Remove the given name from this president's friends list.
     * @param foe Name of president to remove.
     */
    public void unfriend(String foe)
    {
        for (int i = 0; i < friendsNames.size(); i++)
        {
          boolean found = false;
          if (friendsNames.get(i).equals(foe))
          {
            friendsNames.remove(i);
          }
        }
    }
    
    //public String toString()
    //{
        //wasn't sure what the method was intended to do?
    //}
    
    private int findFriend(PrezATDP aFriend)
    {
        boolean found = false;
        int indx = 0;
        int count = friendsNames.size();
        if (count > 0)
        {
            while (!found && indx < count)
            {
                if (friendsNames.get(indx).equals(aFriend.ownName))
                {
                    found = true;
                }
                else
                {
                    indx++;
                }
            }
        }
        
        if (!found)
            indx = -1;
        return indx; 
    }
}