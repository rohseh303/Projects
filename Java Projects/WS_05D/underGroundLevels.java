import java.util.Scanner;

public class underGroundLevels
{
    public static  void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        if (in.hasNextInt())
        {
            int floor = in.nextInt();
            
            if (floor == 15)
            {
                    System.out.print("There is no fifteenth floor");
                }
            else if (floor <= 0 || floor > 20)
            {
                System.out.println("Pick a lvel from 1-20. Note the higher the number, the deeper the underground floor will be ");
            }
            else
            {
                int actualFloor = floor;
                if (floor > 13)
                {
                    actualFloor = floor - 1;
                }
                
                System.out.println("Traveling to the underground floor - " + actualFloor);
            }
        }
        else
        {
        System.out.print("Input an integer");
        }
    }
}