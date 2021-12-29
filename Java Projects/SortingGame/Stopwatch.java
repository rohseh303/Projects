import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * Class Stopwatch is used to track how long the user took to sort the words.
 *
 * @Rohan Sehgal
 * @1.0
 */

public class Stopwatch{
     public static final int TIMER_DELAY = 1000;
     private int seconds = 0;
     private int minutes = 0;
     
     /**
     * Creates a stopwatch, seconds and minutes already initialized at 0;
     */
     public Stopwatch()
     {
      
     }

      /**
      * Updates the stopwatch second by second, as well as minute by minute
      *
      * @param     none
      * @return    nothing
      */
      public void changeTime() {
        if ((seconds+1)/60 == 1)
                                {
                                    seconds = 0;
                                    minutes++;
                                    System.out.println(minutes + ":" + seconds);
                                    //numberLabel.setText(minutes + ":" + seconds);
                                }
                                else
                                {
                                    seconds++;
                                    System.out.println(minutes + ":" + seconds);
                                    //numberLabel.setText(minutes + ":" + seconds);
                                }
        //numberLabel.setText(String.valueOf(number));
      }
      
      /**
      * Retrieves the value of seconds
      *
      * @param     none
      * @return    int - seconds at that moment
      */
      public int getSeconds(){
          return seconds;
      }
      
       /**
      * Retrieves the value of minutes
      *
      * @param     none
      * @return    int - minutes at that moment
      */
      public int getMinutes(){
          return minutes;
      }
      }