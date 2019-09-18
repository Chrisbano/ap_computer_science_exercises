import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double hours = 0;
        double zones = 0;
        double depart = 0;
        double arrive = 0;

        System.out.println("Please enter how many hours you travel: ");
        hours = scan.nextDouble();

        System.out.println("Please enter how many zones you traveld: ");
        zones = scan.nextDouble();
        
        System.out.println("Please enter when you departed: ");
        depart = scan.nextDouble();
        
        System.out.println("Please enter when you arrive: ");
        arrive = scan.nextDouble();

        double daysOfrecovery;
        daysOfrecovery = (hours/2 + (zones-3) + depart + arrive)/10;

        System.out.println(daysOfrecovery);
        


        
    }
}