
import java.util.*;
public class testFacorial
{

    static int factorial(int n)
    {
        if ( n < 0 || n > 20)
        {
            return -1;
        }
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }  

    }

    public static void main (String[] args)
    {
        int num = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positve number");
       

        while (num >= 0)
        {
            num = scan.nextInt();
            System.out.println("Factorial of "+ num + " is " + factorial(num));
        }   

        System.out.println(" ERROR: no negatives are allowed");
        System.exit(0);

    }
}   