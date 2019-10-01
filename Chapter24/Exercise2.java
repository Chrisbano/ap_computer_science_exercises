import java.util.Scanner;
import java.lang.Math;

public class Exercise2
{    
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int product;
        System.out.println("Enter the N variable");
        n = scan.nextInt();

        for (int counter = 1; counter <= n; counter += 2)
        {
            sum += counter;
        }


        System.out.println(sum);
        System.out.println(n * n);

        


    }
}