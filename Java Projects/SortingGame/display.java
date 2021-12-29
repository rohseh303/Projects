import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 * Class display is used with anything related to the actual words that are to be organized.
 *
 * @Rohan Sehgal
 * @1.0
 */

public class display

{
    // instance variables - replace the example below with your own
    private ArrayList<String[]> arrayListData;
    private ArrayList<String[]> chosenLists;
    private int firstSelection;
    private int secondSelection;
    private int thirdSelection;
    private ArrayList<String> one;
    private ArrayList<String> two;
    private ArrayList<String> three;
    private ArrayList<String> sportsArray;
    private ArrayList<String> fruitsArray;
    private ArrayList<String> monthsArray;
    private ArrayList<String> electronicsArray;
    private ArrayList<String> animalsArray;
    
    /**
     * Creates an array list of string arrays by choosing from the selection of arrays provided.
     */
    public display()
    {
            one = new ArrayList<String>();
            two = new ArrayList<String>();
            three = new ArrayList<String>();
            
            sportsArray = new ArrayList<String>();
            fruitsArray = new ArrayList<String>();
            monthsArray = new ArrayList<String>();
            electronicsArray = new ArrayList<String>();
            animalsArray = new ArrayList<String>();
            
            arrayListData = new ArrayList<String[]>();
             String[] sports = new String[]{"baseball", "basketball", "football", "hockey", "soccer"};
             String[] fruits = new String[]{"apple", "banana", "mango", "orange", "pineapple"};
             String[] months = new String[]{"february", "january", "july", "march", "october"};
             String[] electronics = new String[]{"computer", "phone", "radio", "television", "xbox"};
             String[] animals = new String[]{"cat", "lion", "monkey", "mouse", "snake"};
             
             for (int i = 0; i < sports.length; i++)
             {
                 sportsArray.add(sports[i]);
             }
             for (int i = 0; i < fruits.length; i++)
             {
                 fruitsArray.add(fruits[i]);
             }
             for (int i = 0; i < months.length; i++)
             {
                 monthsArray.add(months[i]);
             }
             for (int i = 0; i < sports.length; i++)
             {
                 electronicsArray.add(electronics[i]);
             }
             for (int i = 0; i < sports.length; i++)
             {
                 animalsArray.add(animals[i]);
             }
             
             arrayListData.add(sports);
             arrayListData.add(fruits);
             arrayListData.add(months);
             arrayListData.add(electronics);
             arrayListData.add(animals);

             //to select random arrays
             firstSelection = (int) Math.floor(Math.random() * 5);
             secondSelection = (int) Math.floor(Math.random() * 5);
             thirdSelection = (int) Math.floor(Math.random() * 5);
             
             //make sure all arrays are different and one wasn't selected twice
            while (secondSelection == firstSelection || thirdSelection == firstSelection || thirdSelection == secondSelection)
             {
             if (secondSelection == firstSelection)
             {
                 secondSelection = (int) Math.floor(Math.random() * 5);
                }
             else
             {
                }
                
             if (thirdSelection == firstSelection)
             {
                 thirdSelection = (int) Math.floor(Math.random() * 5);
                }
                else
             {
                }
                
             if (thirdSelection == secondSelection)
             {
                 thirdSelection = (int) Math.floor(Math.random() * 5);
                }
                else
             {
                }
            }
            System.out.println(firstSelection);
            System.out.println(secondSelection);
            System.out.println(thirdSelection);
            
            chosenLists = new ArrayList<String[]>();
            chosenLists.add(arrayListData.get(firstSelection));
            chosenLists.add(arrayListData.get(secondSelection));
            chosenLists.add(arrayListData.get(thirdSelection));
            System.out.print("");
    }

    /*public String getName()
    {
        
        if (chosenLists(0)
        {
        }
        return ""
    } */
    
    /**
     * Used to randomize the order of the string arrays selected.
     *
     * @param     none
     * @return    a random string of the words that were chosen from the constructor being used
     */
    public String createDisplay()
    {
        //store each separate string in a new string[]
        String[] x = chosenLists.get(0);
        String[] y = chosenLists.get(1);
        String[] z = chosenLists.get(2);
        
        String[] display = new String[15];
        
        for (int i = 0; i < x.length; i++)
        {
            //if  (i > 0)
            //{
            //    display += (" ");
            //}
            display[i] = x[i];
        }
        //display += "\n";
        for (int i = 0; i  < y.length; i++)
        {
            //if  (i > 0)
            //{
            //    display += (" ");
            //}
            display[i+5] = y[i];
        }
        //display += "\n";
        for (int i = 0; i  < z.length; i++)
        {
            //if  (i > 0)
            //{
            //    display += (" ");
            //}
            display[i+10] = z[i];
        }
        //System.out.print(chosenLists.get(0));
        //System.out.print(chosenLists.get(1));
        //System.out.print(chosenLists.get(2));
        
        ArrayList<String> randomArrayVersion = new ArrayList<String>();
        
        int randomPlacement = 0;
        int i = 0;
        while  (i < display.length)
        {
            
            randomPlacement = (int) Math.floor(Math.random() * 15);
            
            String currentStr = display[randomPlacement];
            if (!randomArrayVersion.contains(currentStr)) {
                randomArrayVersion.add(display[randomPlacement]);
                i++;
                System.out.println(currentStr);
                
            }
            
            
            if (i == display.length)
                {
                    break;
                }
            //System.out.println("jaya" + randomArrayVersion.get(randomPlacement));
            
            //need to make sure that elements dont get picked more than once use an if else statment
            
        }

        //to display the string[] into a string
        String a = "";
        for (int k = 0; k < randomArrayVersion.size(); k++)
        {
            if  (k > 0)
            {
                a += (" ");
            }
            a += randomArrayVersion.get(k);
        }
        return a;
    }
    
    /*need to redo top by creating an array called compiled array 
     and THEN doing the thing which will print it. I would then take the compiled
     array and then randomize and then display :)
    */
    /**
     * Used to take the input from the first JTextField when the "Enter and Check Answer" button is selected
     *
     * @param     str - a string of the words that all relate to one another
     * @return    Returns true or false
     */
    public boolean takeInput(String str)
    {
        ArrayList<String> one = new ArrayList<>(Arrays.asList(str.split(",")));
        return checkAnswers(one); 
    }
    
    /**
     * Retrieves the first list chosen in the contructor
     *
     * @param     none
     * @return    the first ArrayList<String> chosen
     */
    public ArrayList<String> getList1()
    {
        return one;
    }
    
    /**
     * Retrieves the second list chosen in the contructor
     *
     * @param     none
     * @return    the second ArrayList<String> chosen
     */
    public ArrayList<String> getList2()
    {
        return two;
    }
    
    /**
     * Retrieves the third list chosen in the contructor
     *
     * @param     none
     * @return    the third ArrayList<String> chosen
     */
    public ArrayList<String> getList3()
    {
        return three;
    }
    
    /**
     * Used to take the input from the second JTextField when the "Enter and Check Answer" button is selected
     *
     * @param     str - a string of the words that all relate to one another
     * @return    Returns true or false
     */
    public boolean takeInput1(String str)
    {
        ArrayList<String> two = new ArrayList<>(Arrays.asList(str.split(",")));
        return checkAnswers(two);
    }
    
    /**
     * Used to take the input from the third JTextField when the "Enter and Check Answer" button is selected
     *
     * @param     str - a string of the words that all relate to one another
     * @return    Returns true or false
     */
    public boolean takeInput2(String str)
    {
        ArrayList<String> three = new ArrayList<>(Arrays.asList(str.split(",")));
        return checkAnswers(three);
    }
    
    /**
     * Compares a sample ArrayList<String> to the ones provided. If the ArrayList<String> matches one
     * of the ArrayList<String> in the database, it will return true. Otherwise, it will return false.
     *
     * @param     ArrayList<String>
     * @return    true or false
     */
    public boolean checkAnswers(ArrayList<String> answers)
    {
        System.out.print("f");
        String first = answers.get(0);
        
        if (sportsArray.contains(first))
        {
            Collections.sort(answers);
            if (sportsArray.equals(answers))
            {
                return true;
            }
        }
        if (fruitsArray.contains(first))
        {
            Collections.sort(answers);
            if (fruitsArray.equals(answers))
            {
                return true;
            }
        }
        if (monthsArray.contains(first))
        {
            Collections.sort(answers);
            if (monthsArray.equals(answers))
            {
                return true;
            }
        }
        if (electronicsArray.contains(first))
        {
            Collections.sort(answers);
            if (electronicsArray.equals(answers))
            {
                return true;
            }
        }
        if (animalsArray.contains(first))
        {
            Collections.sort(answers);
            if (animalsArray.equals(answers))
            {
                return true;
            }
        }
        
        
            return false;
        
    }
    
   
}
