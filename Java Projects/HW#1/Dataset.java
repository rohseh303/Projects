import java.util.ArrayList;

public class Dataset
{
    // instance variables - replace the example below with your own
    private float total;
    private ArrayList<Float> list;

    /**
     * Constructor for objects of class Dataset
     */
    public Dataset()
    {
        list = new ArrayList<Float>();
        total = 0;
    }

    public void add(float value)
    {
        list.add(value);
        total += value;
    }
    
    public float getAverage()
    {
        return total / list.size();
    }
    
    public float getSmallest()
    {
        while (list.get(0) > list.get(1) && list.get(0) > list.get(2) && list.get(0) > list.get(3) && list.get(0) > list.get(3))
        {
            if (list.get(0) > list.get(1))
            {
                float placeHolder = list.get(0);
                list.set(0, list.get(1));
                list.set(1, placeHolder);
            }
            if (list.get(0) > list.get(2))
            {
                float placeHolder = list.get(0);
                list.set(0, list.get(2));
                list.set(2, placeHolder);
            }
            if (list.get(0) > list.get(3))
            {
                float placeHolder = list.get(0);
                list.set(0, list.get(3));
                list.set(3, placeHolder);
            }
        }
        return list.get(0);
    }
    
    public float getLargest()
    {
        ArrayList<Float> copy = list;
        
        while (copy.get(0) < copy.get(1) && copy.get(0) < copy.get(2) && copy.get(0) < copy.get(3) && copy.get(0) < copy.get(3))
        {
            if (copy.get(0) < copy.get(1))
            {
                float placeHolder = copy.get(0);
                copy.set(0, copy.get(1));
                copy.set(1, placeHolder);
            }
            if (copy.get(0) < copy.get(2))
            {
                float placeHolder = copy.get(0);
                copy.set(0, copy.get(2));
                copy.set(2, placeHolder);
            }
            if (copy.get(0) < copy.get(3))
            {
                float placeHolder = copy.get(0);
                copy.set(0, copy.get(3));
                copy.set(3, placeHolder);
            }
        }
        return copy.get(0);
    }
    
    public float getRange()
    {
        //ArrayList<Float> copy = list;
        return getLargest() - getSmallest(); 
    }
}
