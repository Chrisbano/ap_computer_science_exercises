import java.util.Scanner;
import java.lang.Math;

public class Exercise4
{
    public static void main( String[]args)
    {
        Scanner scan = new Scanner(System.in);
        double x = 0;
        int n = 1;
        double term = 1;
        double sum = 1;

        System.out.println("Enter the x value: ");
        x = scan.nextDouble();
        scan.close();

        while(term > 1.0E-12)
        {
            term *= x/n++;
            // n++ is a post incrament
            sum += term;
            // \t is a tab
            System.out.println("n:" + n +  "\tterm: " + term + "\tsum: " + sum);
        }   
                  
        System.out.println("My   e^x: " + sum);
        System.out.println("Real e^x: " + Math.exp(x));
    }
}
