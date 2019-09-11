import java.util.Scanner;


public class Yurtlequest{

    public static void main( String[]args)
    {
        String name; 
        double strength;
        double luck;
        double health;
        double total;
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to Yurtles Quest!!");
        System.out.println("Enter the name of your character");
        name = scan.nextLine();
        System.out.println("Enter the strength of your character (0-10)");
        strength = scan.nextDouble();
        System.out.println("Enter the luck of your character (0-10)");
        luck = scan.nextDouble();
        System.out.println("Enter the health of your character (0-10)");
        health = scan.nextDouble();

        total = health + luck + strength;

        

        if (total > 15)
        {
            System.out.println("You have give your character too many points!  Default values have been assigned to chortle. Strength = 5 Luck = 5 Health = 5");

            strength = 5;
            luck = 5;
            health= 5;
        }
        else
        {
            System.out.println("Great " + name + " is all setup");
            
        }









    }
   


}