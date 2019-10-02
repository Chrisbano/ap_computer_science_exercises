import java.util.Scanner;

public class Exercise2{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        double n = 0;
        double probobility = 1;

        System.out.println("Please enter the amount of people");
        n = scan.nextDouble();

        for(int counter = 1; counter<=n; counter++)
        {
            probobility = probobility * ((365.0 - (counter-1))/365.0);

        }
        System.out.println(probobility);


    }
}