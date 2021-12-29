import java.util.ArrayList;
import java.util.Iterator;

public class Sequence {

   private ArrayList<Integer> values;

   public Sequence() { values = new ArrayList<Integer>(); }

   public void add(int n) { values.add(n); }

   public String toString() { return values.toString(); }

   public Sequence append(Sequence other)
   {
       Sequence sn=new Sequence();
       Iterator<Integer> it=values.iterator();
       while(it.hasNext())
       sn.add(it.next());
      
       Iterator<Integer> it1=other.values.iterator();
       while(it1.hasNext())
           sn.add(it1.next());
      
       return sn;
   }
   public Sequence merge(Sequence other)
   {
       int c=0;
       Sequence sn=new Sequence();
       Iterator<Integer> it=values.iterator();
       Iterator<Integer> it1=other.values.iterator();
       while(it.hasNext()||it1.hasNext()){
           if(c<values.size()){
       sn.add(it.next());}
           if(c<other.values.size()){
       sn.add(it1.next());}
       c++;
       }
      
       /*while(it1.hasNext())
           sn.add(it1.next());*/
      
       return sn;
   }
  
  
   public static void main(String[] args) {
       Sequence s=new Sequence();
       s.add(1);
       s.add(4);
       s.add(9);
       s.add(16);
       Sequence s1=new Sequence();
       s1.add(9);
       s1.add(7);
       s1.add(4);
       s1.add(9);
       s1.add(11);
       Sequence snew=s.append(s1);
       Sequence snew1=s.merge(s1);
       Iterator<Integer> it1=snew.values.iterator();
       System.out.println("append results are...");
       while(it1.hasNext())
           System.out.println(it1.next());
      
      
       Iterator<Integer> it11=snew1.values.iterator();
       System.out.println("merge results are...");
       while(it11.hasNext())
           System.out.println(it11.next());
      
   }
  
}

