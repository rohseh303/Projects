import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What is your name?");
        String name = in.next();
        
        System.out.print("What is your age?");
        int age = in.nextInt();
        
        System.out.print("What is your weight in lbs?");
        double weight = in.nextDouble();
        double weightInKg = weight * (1 / 2.20462);
        
        System.out.print("What is your height in inches?");
        double height = in.nextDouble();
        double heightInMeters = height * (1 / 39.3701);
       
        double BMI = weightInKg / Math.pow(heightInMeters, 2);
        
        System.out.println("BMI of " + name + ", age " + age + ", is " + BMI);
    }
}