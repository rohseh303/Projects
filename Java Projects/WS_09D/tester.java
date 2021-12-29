import java.util.ArrayList;
import java.util.Scanner;

public class tester
{
    public static void main(String[] args)
    {
        //create list
        ArrayList<Appointment> list = new ArrayList<Appointment>();
        
        //create different apps
        Daily daily = new Daily();
        Monthly monthly = new Monthly(7);
        Onetime onetime = new Onetime(7, 24, 2020);
        
        //add appointments to list
        list.add(daily);
        list.add(monthly);
        list.add(onetime);
        
        //set descriptions for each one

        daily.setDescription("Basketball");
        monthly.setDescription("Doctor Appointment");
        onetime.setDescription("Rishab's Covid Birthday");
        
        while (true)
        {
            System.out.print("Appointments: (F)ind, (A)dd, or (Q)uit: ");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            
            if (input.equals("F"))
            {
                
                System.out.print("Enter a month: ");
                int mo = in.nextInt();
                
                System.out.print("Enter a day: ");
                int da = in.nextInt();
                
                System.out.print("Enter a year: ");
                int ye = in.nextInt();
                
                for (int i = 0; i < list.size(); i++)
                {
                    Appointment app = list.get(i);
                    app.occursOn(mo, da, ye);
                }
            }
            
            else if (input.equals("A"))
            {
                System.out.print("Enter type [(D)aily, (M)onthly, (O)netime]: ");
                String type = in.next();
                System.out.print("Enter description: ");
                String des = in.next();
                if (type.equals("D"))
                {
                    Daily dailys = new Daily();
                    dailys.setDescription(des);
                    list.add(dailys);
                }
                else if (type.equals("M"))
                {
                    System.out.print("Enter the day of the month the appointment will be on: ");
                    int dat = in.nextInt();
                    Monthly name = new Monthly(dat);
                    name.setDescription(des);
                    list.add(name);
                }
                else if (type.equals("O"))
                {
                    System.out.print("Enter the month the appointment will be on: ");
                    int dat = in.nextInt();
                    System.out.print("Enter the day the appointment will be on: ");
                    int mon = in.nextInt();
                    System.out.print("Enter the year the appointment will be on: ");
                    int yea = in.nextInt();
                    Onetime name = new Onetime(dat, mon, yea);
                    name.setDescription(des);
                    list.add(name);
                }
            }
            
            else if (input.equals("Q"))
            {
                break;
            }
        }
    }
}
