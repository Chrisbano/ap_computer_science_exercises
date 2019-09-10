import java.util.Scanner;





public class GasChecker
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double gasmileage;
        double tankcapacity;
        double gaugereading;
        final int distance = 200;
        double amountofgas;
    

        System.out.println("Please enter gas milage: ");
        gasmileage = scan.nextDouble();
        System.out.println("Please enter the tank campacity: ");
        tankcapacity = scan.nextDouble();
        System.out.println("Please enter the gauge reading, 0, 25, 50, or 100");
        gaugereading = scan.nextDouble(); 
        gaugereading = gaugereading / 100;

        amountofgas = (tankcapacity * gaugereading) * gasmileage;

        if (amountofgas < 200)
        {
            System.out.println("You need gas!!");
        }
        else{
            System.out.println("You dont need gas!");
        }


        





    }





}