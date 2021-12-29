import java.util.ArrayList;

/**
   Computes a sum of odd integers between two bounds. 
   Input: a, the lower bound (may be odd or even).
   Input: b, the upper bound (may be odd or even).
   Output: sum of odd integers between a and b (inclusive).
*/
public class OddSum
{

public static void main(String[] args) {
   ArrayList<Integer> vData = new ArrayList<Integer>();
   int rSum;
   for (int cnt = 0; cnt < 4; cnt++) {
      vData.add(cnt + 1);
   }
   rSum = check(vData);
   System.out.println(rSum);
}

}
