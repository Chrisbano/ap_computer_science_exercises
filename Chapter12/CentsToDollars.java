import java.util.Scanner;

public class CentsToDollars{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int cents, dollars;

        System.out.println("Input amount of cents:");
        cents = scan.nextInt();
    
        dollars = (cents) / 100;
        System.out.println(cents + " cents in dollars is " + dollars + " dollars");

        



    }






}