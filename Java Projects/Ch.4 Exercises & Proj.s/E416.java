import java.util.Scanner;
public class E416 {
        public static void main(String[] args)
        {Scanner s = new Scanner(System.in); System.out.println("Enter number"); int num = s.nextInt();
        String st = Integer.toString(num); 
            if ((st.length()) >= 1)
            {
                char st1 = st.charAt(0); System.out.print(st1 + " ");
            }
            if ((st.length()) >= 2)
            {
                char st2 = st.charAt(1); System.out.print(st2 + " ");
            }
            if ((st.length()) >= 3) {
                char st3 = st.charAt(2); System.out.print(st3 + " ");
            }
            if ((st.length()) >= 4)
            {
                char st4 = st.charAt(3); System.out.print(st4 + " ");
            }
            if ((st.length()) >= 5)
            {
            
                char st5 = st.charAt(4); System.out.print(st5 + " ");
            }
            
    }
}